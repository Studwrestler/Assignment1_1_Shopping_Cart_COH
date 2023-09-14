/**
 * This class serves as the application entry point to test the ShoppingCart class.
 */
public class Application {

	/**
	 * Default
	 */
	Application(){
		
	}
    /**
     * The main method for running the shopping cart application.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {

        ShoppingCart<Item> cart = new ShoppingCart<>();

        Item item1 = new Item("Item 1", 10.99);
        Item item2 = new Item("Item 2", 5.49);
        Item item3 = new Item("Item 3", 7.99);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        System.out.println("Added items to the cart.");

        System.out.println("Contents of the cart:");
        cart.showCartContents();

        double totalPrice = cart.getTotalPrice();
        System.out.println("Total Price in the Cart: $" + totalPrice);

        int numberOfItems = cart.getNumberOfItems();
        System.out.println("Number of Items in the Cart: " + numberOfItems);

        cart.removeItem(item2);
        System.out.println("Removed item2 from the cart.");

        System.out.println("Updated Contents of the cart:");
        cart.showCartContents();

        Item item4 = new Item("Item 4", 12.99);
        Item item5 = new Item("Item 5", 8.49);

        cart.addItem(item4);
        cart.addItem(item5);
        System.out.println("Added items 4 and 5 to the cart.");

        cart.removeItem(item1);
        cart.removeItem(item3);
        System.out.println("Removed items 1 and 3 from the cart.");

   
        System.out.println("Final Contents of the cart:");
        cart.showCartContents();
    }//end main
}//end class
