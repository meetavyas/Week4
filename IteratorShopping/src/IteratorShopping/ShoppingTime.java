
package IteratorShopping;

import java.util.ArrayList;

public class ShoppingTime {
	public static void main(String args[]) {
		IndianClothes eastSide = new IndianClothes();
		AmericanClothes westSide = new AmericanClothes();
		ArrayList<ClothesShopping> menus = new ArrayList<ClothesShopping>();
		menus.add(eastSide);
		menus.add(westSide);
		ClothesDeliveryService delivery = new ClothesDeliveryService(menus);
		delivery.printMenu();
		
	}
}