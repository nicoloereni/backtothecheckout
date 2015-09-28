import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpecialPriceTest {

    @Test
    public void createSpecialPriceTest(){
        SpecialPrice specialPrice = new SpecialPrice(3,4.00);
        assertEquals(4.00, specialPrice.specialPrice, 0.001);
        assertEquals(3, specialPrice.quantityForSpecialPrice);
    }

}
