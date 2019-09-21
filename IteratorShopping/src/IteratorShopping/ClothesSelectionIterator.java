
package IteratorShopping;

import java.util.Iterator;

public class ClothesSelectionIterator implements Iterator<ClothesSelection>{

	ClothesSelection[] list;
	int pos = 0;
	
	public ClothesSelectionIterator(ClothesSelection[] list) {
		this.list = list;
	}
	
	public boolean hasNext() {
		if (pos >= list.length || list[pos] == null) {
			return false;
		} else {
			return true;
		}
	}

	public ClothesSelection next() {
		ClothesSelection selection = list[pos];
		pos = pos + 1;
		return selection;
	}

}