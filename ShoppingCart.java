/**
 * Represents a shopping cart that can be used to add, remove, and manage items.
 *
 * @param <T> The type of items to be stored in the shopping cart.
 */
public class ShoppingCart<T> implements BagInterface<T> {
	private ArrayBag<T> bag;

	/**
	 * Constructs a new shopping cart with an underlying bag data structure.
	 */
	public ShoppingCart() {
		bag = new ArrayBag<>();
	}// end constructor

	/**
	 * gets current size of the bag class
	 */
	@Override
	public int getCurrentSize() {
		return bag.getCurrentSize();
	}// end getCurrentSize

	/**
	 * tests if bag class isEmpty
	 */

	@Override
	public boolean isEmpty() {
		return bag.isEmpty();
	}// end isEmpty

	/**
	 * adds something to the bag
	 */

	@Override
	public boolean add(T newEntry) {
		return bag.add(newEntry);
	}// end add

	/**
	 * removes first thing from the bag
	 */

	@Override
	public T remove() {
		return bag.remove();
	}// end remove

	/**
	 * removes something specific from the bag
	 */

	@Override
	public boolean remove(T anEntry) {
		return bag.remove(anEntry);
	}// end remove
	/**
	 * empties the bag
	 */

	@Override
	public void clear() {
		bag.clear();
	}//end clear
	/**
	 * sees how many of an item are in the bag class
	 */

	@Override
	public int getFrequencyOf(T anEntry) {
		return bag.getFrequencyOf(anEntry);
	}//end getFrequencyOf
	/**
	 * shows what is in the bag
	 */

	@Override
	public boolean contains(T anEntry) {
		return bag.contains(anEntry);
	}//end contains
	
	/**
	 * converts the bag to an Array
	 */

	@Override
	public T[] toArray() {
		return bag.toArray();
	}//end Array

	/**
	 * Adds an item to the shopping cart.
	 *
	 * @param item The item to add to the cart.
	 * @return True if the item was successfully added; false otherwise.
	 */
	public boolean addItem(T item) {
		return bag.add(item);
	}// end addItem

	/**
	 * Removes an item from the shopping cart.
	 *
	 * @param item The item to remove from the cart.
	 * @return True if the item was successfully removed; false otherwise.
	 */
	public boolean removeItem(T item) {
		return bag.remove(item);
	}// end removeItem

	/**
	 * Clears the shopping cart, removing all items.
	 */
	public void clearCart() {
		bag.clear();
	}// end clearCart

	/**
	 * Displays the contents of the shopping cart.
	 */
	public void showCartContents() {
		T[] items = bag.toArray();
		for (T item : items) {
			System.out.println(item.toString());
		}
	}// end showCartContents

	/**
	 * Calculates and returns the total price of items in the shopping cart.
	 *
	 * @return The total price of items in the cart.
	 */
	public double getTotalPrice() {
		double totalPrice = 0.0;
		T[] items = bag.toArray();
		for (T item : items) {
			totalPrice += ((Item) item).getPrice();
		}
		return totalPrice;
	}// end getTotalPrice

	/**
	 * Gets the number of items currently in the shopping cart.
	 *
	 * @return The number of items in the cart.
	 */
	public int getNumberOfItems() {
		return bag.getCurrentSize();
	}// end getNumberOfItems
}// end class
