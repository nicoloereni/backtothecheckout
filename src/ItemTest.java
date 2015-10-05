import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void createItemTest(){
        Product product = new Product("A", null);
        Item item = new Item(product, 20.00);
        assertEquals(product, item.product);
        assertEquals(20.00, item.singlePrice, 0.0001);
        assertEquals("A", item.product.sku);
    }

    @Test
    public void createItemSpecialPriceTest(){
        Product product = new Product("A", new SpecialPrice(3, 20.00));
        Item item = new Item(product, 20.00);
        assertEquals(product, item.product);
        assertEquals(20.00, item.singlePrice, 0.0001);
        assertEquals("A", item.product.sku);
        assertNotNull(item.product.specialPrice);
        assertEquals(3, item.product.specialPrice.quantity);
        assertEquals(20.00, item.product.specialPrice.totalPriceForQuantity, 0.0001);
    }

}
