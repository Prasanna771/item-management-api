package com.spring.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Item;
import com.spring.demo.service.ItemService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Tag(name="Items APIs ",description = "APIs for for managing items i.e posting and getting items details")
@RestController
@RequestMapping("/api/items")
public class ItemController 
{
	private final ItemService itemService;
	
	public ItemController(ItemService itemService)
	{
		this.itemService=itemService;
	}
	
	@PostMapping
	@Operation(summary="Add a new item",
	description="Creates a new item and saves it in H2 database")
	public ResponseEntity<Item> addItem(@Valid @RequestBody Item item) {

	    Item savedItem = itemService.addItem(item);   
	    return ResponseEntity.ok(savedItem);          
	}


    @Operation(summary="Get item by Id",description="Fetches the item details by using item ID")
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItem(@PathVariable Long id) {
        return itemService.getItemById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
