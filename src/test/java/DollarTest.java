import org.junit.Test;
import static org.junit.Assert.*;

/*
To-Do
- $5 + 10CHF = $10 (환율이 2:1일 경우)
- [v] $5 * 2 = $10
- amount를 private
- Dollar 부작용?
- Money 반올림?
*/
public class DollarTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
