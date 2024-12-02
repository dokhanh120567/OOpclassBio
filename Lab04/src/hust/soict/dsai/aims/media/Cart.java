package hust.soict.dsai.aims.media;
import java.util.ArrayList;
public class Cart {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public boolean addMedia(Media media) {
        itemsOrdered.add(media);
        System.out.println("Added " + media.getTitle() + " to the cart.");
        return true;
    }

    public boolean removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("Removed " + media.getTitle() + " from the cart.");
            return true;
        } else {
            System.out.println("Item not found in the cart.");
            return false;
        }
    }

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
    
    public int getSize() {
		return this.itemsOrdered.size();
	}
    
    public void printCart() {
    	System.out.println("***********************CART***********************");
    	System.out.println("Ordered Items:");
    	for (int i=0; i<itemsOrdered.size(); i++) {
    		System.out.println((i+1) + "." + itemsOrdered.get(i).toString());
    	}
    	System.out.println("Total cost: " + totalCost() + "$");
    	System.out.println("***************************************************");
    }
}
