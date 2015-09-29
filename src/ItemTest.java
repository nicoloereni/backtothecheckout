import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void createItemTest(){
        Product product = new Product("A", null);
        Item item = new Item(product, 20.00);
        assertEquals(product, item.product);
        assertEquals(20.00, item.singlePrice, 0.0001);
    }

}
