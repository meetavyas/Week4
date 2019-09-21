
package IteratorShopping;

import java.util.ArrayList;
import java.util.Iterator;

public class AmericanClothes implements ClothesShopping{
	ArrayList<ClothesSelection> clothes;
	
	public AmericanClothes() {
		clothes = new ArrayList<ClothesSelection>(); 
		addItem("Boots", "Texas Cowgirl Boots", 59.99);
		addItem("Jeans", "Levis Jeans", 69.99);
	}
	
	public void addItem(String name, String description, double price) {
		ClothesSelection item = new ClothesSelection(name, description, price);
		clothes.add(item);
	}

	public ArrayList<ClothesSelection> getMenuItems() {
		return clothes;
	}

	public Iterator<ClothesSelection> createIterator() {
		return clothes.iterator();
	}
	
}