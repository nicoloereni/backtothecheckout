
public class SpecialPrice {
    public int quantityForSpecialPrice;
    public double specialPrice;

    public SpecialPrice(int quantityForSpecialPrice, double specialPrice) {
        this.quantityForSpecialPrice = quantityForSpecialPrice;
        this.specialPrice = specialPrice;
    }

    public double getSpecialPriceSum(int totalQuantity, double normalPrice) {
        int notSpecialPriceQuantity = totalQuantity%quantityForSpecialPrice;
        int specialPriceQuantity = totalQuantity/quantityForSpecialPrice;
        return notSpecialPriceQuantity*normalPrice + specialPrice*specialPriceQuantity;
    }
}
