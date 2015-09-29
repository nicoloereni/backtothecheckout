import java.util.ArrayList;

public class BackToTheCheckout {
    public double sum(ArrayList<Item> itemList) {
        double priceSum= 0.0;

        for(Item item:itemList)
        {
            priceSum += item.singlePrice;
        }

        return priceSum;
    }


}
