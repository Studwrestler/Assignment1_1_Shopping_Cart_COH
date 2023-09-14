/**
 * This class represents an item that can be added to a shopping cart.
 */
public class Item {
    private String name;
    private double price;

    /**
     * Constructs a new item with the specified name and price.
     *
     * @param name  The name of the item.
     * @param price The price of the item.
     */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }//end constructor

    /**
     * Gets the name of the item.
     *
     * @return The name of the item.
     */
    public String getName() {
        return name;
    }//end getName

    /**
     * Sets the name of the item.
     *
     * @param name The new name of the item.
     */
    public void setName(String name) {
        this.name = name;
    }//end setName

    /**
     * Gets the price of the item.
     *
     * @return The price of the item.
     */
    public double getPrice() {
        return price;
    }//end getPrice

    /**
     * Sets the price of the item.
     *
     * @param price The new price of the item.
     */
    public void setPrice(double price) {
        this.price = price;
    }//end setPrice

    /**
     * Returns a string representation of the item.
     *
     * @return A string containing the name and price of the item.
     */
    @Override
    public String toString() {
        return "Name: " + name + ", Price: $" + price;
    }//end toString
}//end class
