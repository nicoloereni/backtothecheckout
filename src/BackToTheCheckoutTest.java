import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BackToTheCheckoutTest {

    private ArrayList<Item> itemList;
    private BackToTheCheckout backToTheCheckout;

    @Before
    public void setUp(){
        itemList = new ArrayList();
        itemList.add(new Item("A", 2, 10.00, null));
        itemList.add(new Item("B", 1, 20.00, null));
        itemList.add(new Item("C", 1, 30.00, null));
        backToTheCheckout = new BackToTheCheckout();
    }

    @Test
    public void simpleItemSumTest(){
        assertEquals(70.00, backToTheCheckout.sum(itemList), 0.0001);
    }

    @Test
    public void twoForOneTest(){
        itemList.add(new Item("D", 2, 30.00, new SpecialPrice(2, 30.00)));
        assertEquals(100.00, backToTheCheckout.sum(itemList), 0.0001);
    }

    @Test
    public void twoForOneComplexTest(){
        itemList.add(new Item("D", 3, 30.00, new SpecialPrice(2, 30.00)));
        assertEquals(130.00, backToTheCheckout.sum(itemList), 0.0001);
    }

    @Test
    public void threeForTwoTest(){
        itemList.add(new Item("D", 3, 30.00, new SpecialPrice(3, 40.00)));
        assertEquals(110.00, backToTheCheckout.sum(itemList), 0.0001);
    }

    @Test
    public void threeForTwoComplexTest(){
        itemList.add(new Item("D", 4, 30.00, new SpecialPrice(3, 40.00)));
        assertEquals(140.00, backToTheCheckout.sum(itemList), 0.0001);
    }

    @After
    public void tearDown(){
        itemList = null;
    }

}
