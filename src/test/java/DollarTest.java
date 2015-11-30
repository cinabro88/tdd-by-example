import org.junit.Test;
import static org.junit.Assert.*;

/*
To-Do
- $5 + 10CHF = $10 (환율이 2:1일 경우)
- [v] $5 * 2 = $10
- amount를 private
- [v] Dollar 부작용?
- Money 반올림?
- [v] equals()
- hashCode()
- Equal null
- Equal object
*/
public class DollarTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
