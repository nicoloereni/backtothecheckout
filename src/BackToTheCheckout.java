import java.util.ArrayList;

public class BackToTheCheckout {
    public double sum(ArrayList<Item> itemList) {
        double priceSum= 0.0;

        for(Item item:itemList)
        {
            priceSum += getPriceSum(item);
        }

        return priceSum;
    }

    private double getPriceSum(Item item) {

        if(item.specialPrice == null){
            return item.singlePrice * item.quantity;
        }

        return item.specialPrice.getSpecialPriceSum(item.quantity, item.singlePrice);
    }
}
