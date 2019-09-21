
package IteratorShopping;

import java.util.Iterator;

public class IndianClothes implements ClothesShopping{
	
	static final int MAX_SELECTION = 4;
	int num = 0;
	ClothesSelection[] clothes;
	
	public IndianClothes() {
		clothes = new ClothesSelection[MAX_SELECTION];
		
		addItem("Saree", "Banarasi Saree", 299.99);
		addItem("Kurta", "Cotton Kurta", 39.99);
		addItem("Kanjiwaram", "Silk Saree", 199.99);
		addItem("Jhumki", "Dangling earrings", 9.99);
	}
	
	public void addItem(String name, String description, 
             double price) 
	{
		ClothesSelection selection = new ClothesSelection(name, description, price);
		if (num >= MAX_SELECTION) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			clothes[num] = selection;
			num = num + 1;
		}
	}
	
	public ClothesSelection[] getClothesSelection() {
		System.out.println("Indian");
		return clothes;
	}

	public Iterator<ClothesSelection> createIterator() {
		return new ClothesSelectionIterator(clothes);
	}

}
