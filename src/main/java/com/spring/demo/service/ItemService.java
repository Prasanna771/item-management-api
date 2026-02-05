package com.spring.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.spring.demo.model.Item;
import com.spring.demo.repo.ItemRepository;

@Service
public class ItemService 
{
	private final ItemRepository itemRepo;
	
	public ItemService(ItemRepository itemRepo)
	{
		this.itemRepo=itemRepo;
	}
	
	public Item addItem(Item item)
	{
		
		return itemRepo.save(item);
	}
	
	public Optional<Item> getItemById(Long id)
	{
		return itemRepo.findById(id);
	}
	

}
