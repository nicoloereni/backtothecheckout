import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BackToTheCheckout {

    public double sum(ArrayList<Item> itemList) {
        double priceSum= 0.0;

        ArrayList<Item> sortedItemList = sort(itemList);

        for(Double partialSum : getDifferentProductSum(sortedItemList)){
            priceSum += partialSum;
        }

        return priceSum;
    }

    private ArrayList<Double> getDifferentProductSum(ArrayList<Item> sortedItemList) {

        ArrayList res = new ArrayList();
        String sku = "";
        Integer productQuantity = 0;
        int index = 1;
        for(Item item : sortedItemList){
            if(sku.isEmpty() || !sku.equals(item.product.sku) || isLastElement(sortedItemList, index)){
                res.add(item.product.specialPrice.getPriceFor(productQuantity, item));
                productQuantity = 0;
            }
            productQuantity++;
            index++;
        }

        return res;
    }

    private boolean isLastElement(ArrayList<Item> sortedItemList, int index) {
        return sortedItemList.size() == index;
    }

    public ArrayList<Item> sort(ArrayList<Item> itemList) {
        Collections.sort(itemList, new Comparator<Item>() {
            @Override
            public int compare(Item item1, Item item2) {

                return item1.product.sku.compareTo(item2.product.sku);
            }
        });
        return itemList;
    }
}
