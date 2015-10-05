import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BackToTheCheckoutTest {

    private ArrayList<Item> itemList;
    private BackToTheCheckout backToTheCheckout;
    private Item itemWithSpecialPrice;

    @Before
    public void setUp(){
        itemList = new ArrayList();
        itemWithSpecialPrice = new Item(new Product("A", new SpecialPrice(3, 20.00)), 10.00);
        itemList.add(itemWithSpecialPrice);
        itemList.add(new Item(new Product("B", null), 20.00));
        itemList.add(new Item(new Product("C", null), 30.00));
        backToTheCheckout = new BackToTheCheckout();
    }

    @Test
    public void simpleItemSumTest(){
        assertEquals(60.00, backToTheCheckout.sum(itemList), 0.0001);
    }

    @Test
    public void twoForOneTest(){
        itemList.add(itemWithSpecialPrice);
        itemList.add(itemWithSpecialPrice);
        assertEquals(70.00, backToTheCheckout.sum(itemList), 0.0001);
    }

    @Test
    public void sortItemsList(){
        itemList.add(itemWithSpecialPrice);
        itemList.add(itemWithSpecialPrice);
        ArrayList<Item> sortedItemList = backToTheCheckout.sort(itemList);
        assertEquals("A", sortedItemList.get(0).product.sku);
        assertEquals("A", sortedItemList.get(1).product.sku);
        assertEquals("A", sortedItemList.get(2).product.sku);
        assertEquals("C", sortedItemList.get(3).product.sku);
    }

//    @Test
//    public void twoForOneComplexTest(){
//        itemList.add(new Item("D", 3, 30.00, new SpecialPrice(2, 30.00)));
//        assertEquals(130.00, backToTheCheckout.sum(itemList), 0.0001);
//    }
//
//    @Test
//    public void threeForTwoTest(){
//        itemList.add(new Item("D", 3, 30.00, new SpecialPrice(3, 40.00)));
//        assertEquals(110.00, backToTheCheckout.sum(itemList), 0.0001);
//    }
//
//    @Test
//    public void threeForTwoComplexTest(){
//        itemList.add(new Item("D", 4, 30.00, new SpecialPrice(3, 40.00)));
//        assertEquals(140.00, backToTheCheckout.sum(itemList), 0.0001);
//    }

    @After
    public void tearDown(){
        itemList = null;
    }

}
