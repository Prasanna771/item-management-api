package com.spring.demo.model;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.*;



@Entity
@Table(name="Items")
public class Item
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotBlank(message = "Name of the product is required")
	private String name;
	
	private String description;

	@NotNull(message="Price is required")
	@Min(value=1, message = "Price must be greater than 0")
	private Double price;
	
	@NotBlank(message="Category is required")
	private String category;
	
	private String brand;
	
	

	public Item()
	{
		
	}

//	public Item(Long id, @NotBlank(message = "Name of the product is required") String name, String description,
//			@NotNull(message = "Price is required") @Min(value = 1, message = "Price must be greater than 0") Double price,
//			@NotBlank(message = "Category is required") String category, String brand) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.description = description;
//		this.price = price;
//		this.category = category;
//		this.brand = brand;
//	}
	
	

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	

}
