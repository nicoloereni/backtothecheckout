public class Item {
    public String sku;
    public double singlePrice;
    public SpecialPrice specialPrice;
    public int quantity;

    public Item(String sku, int quantity, double singlePrice, SpecialPrice specialPrice) {

        this.sku = sku;
        this.singlePrice = singlePrice;
        this.specialPrice = specialPrice;
        this.quantity = quantity;
    }
}
