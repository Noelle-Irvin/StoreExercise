public class Vendor {

    private String vendorName;
    private int quantity;
    private Product[] productsAvailable;

    public Vendor(String vendorName, Product [] productsAvailable) {
        this.vendorName = vendorName;
        this.productsAvailable = productsAvailable;
    }

    public int itemsAvailable (String nameOfItem) {

    }

    public int setQuantity(int customerQuantity) {
        int newQuantity = quantity /*5 */ - customerQuantity; //2
        this.quantity = newQuantity;
        return quantity; //3
    }
}
