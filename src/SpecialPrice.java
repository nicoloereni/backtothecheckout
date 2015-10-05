
public class SpecialPrice {
    public int quantity;
    public double totalPriceForQuantity;

    public SpecialPrice(int quantity, double totalPriceForQuantity) {
        this.quantity = quantity;
        this.totalPriceForQuantity = totalPriceForQuantity;
    }

    public Double getPriceFor(Integer itemsQuantity, Item item) {

        int discountedElementsQuantity = itemsQuantity / quantity;
        int notDiscountedElement =  itemsQuantity % quantity;

        return discountedElementsQuantity * totalPriceForQuantity + notDiscountedElement * item.singlePrice;
    }

    private boolean hasSpecialPrice(Item item) {
        return item.product.specialPrice != null;
    }
}
