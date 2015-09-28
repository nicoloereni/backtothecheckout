import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void createItemTest(){
        SpecialPrice specialPrice = new SpecialPrice(2, 10.00);
        Item item = new Item("A", 1, 20.00, specialPrice);
        assertEquals("A", item.sku);
        assertEquals(20.00, item.singlePrice, 0.0001);
        assertEquals(specialPrice, item.specialPrice);
        assertEquals(1, item.quantity);
    }

}
