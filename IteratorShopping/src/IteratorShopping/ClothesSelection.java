
package IteratorShopping;

public class ClothesSelection {

	String name;
	String description;
	double price;
 
	public ClothesSelection(String name, 
	                String description, 
	                double price) 
	{
		this.name = name;
		this.description = description;
		this.price = price;
	}
  
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public double getPrice() {
		return price;
	}
  
}