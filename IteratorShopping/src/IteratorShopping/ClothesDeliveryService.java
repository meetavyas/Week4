
package IteratorShopping;

import java.util.ArrayList;
import java.util.Iterator;

public class ClothesDeliveryService {
	ArrayList<ClothesShopping> selection;
    
	  
	public ClothesDeliveryService(ArrayList<ClothesShopping> selection) {
		this.selection = selection;
	}
   
	void printMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			ClothesSelection clothesItems = (ClothesSelection)iterator.next();
			System.out.print(clothesItems.getName() + ", ");
			System.out.print(clothesItems.getPrice() + " -- ");
			System.out.println(clothesItems.getDescription());
		}
	}
	
	public void printMenu() {
		Iterator<?> selectionIterator = selection.iterator();
		while(selectionIterator.hasNext()) {
			ClothesShopping menu = (ClothesShopping)selectionIterator.next();
			printMenu(menu.createIterator());
		}
	} 
	
}

