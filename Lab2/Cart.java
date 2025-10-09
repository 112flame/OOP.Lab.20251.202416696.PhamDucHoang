
public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private static DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private static int qtyOrdered = 0;
	
	public static void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < 20) {
			itemsOrdered[qtyOrdered] = disc;
			System.out.println("The disc " + disc.getTitle() + " has been added");
			qtyOrdered += 1;
			if (qtyOrdered == MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is almost full");
			}
		}
		else {
			System.out.println("The cart is full");
		}

	}
	
	public static void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("The cart is empty");
			return;
		}
		int found = -1;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i] != null && itemsOrdered[i].getTitle().equals(disc.getTitle())) {
				found = i;
				break;
			}
		}
		if (found != -1) {
	        for (int i = found; i < qtyOrdered - 1; i++) {
	            itemsOrdered[i] = itemsOrdered[i + 1];
	        }
	        itemsOrdered[qtyOrdered - 1] = null;
	        qtyOrdered--;
	        System.out.println("The disc " + disc.getTitle() + " has been removed.");
	    } else {
	        System.out.println("The disc " + disc.getTitle() + " is not found in the cart.");
	    }
	}
	
	public static float totalCost() {
		float total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i] != null) {
				total += itemsOrdered[i].getCost();
			}
		}
		return total;
	}
}
