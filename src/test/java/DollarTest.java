import org.junit.Test;
import static org.junit.Assert.*;

/*
To-Do
- $5 + 10CHF = $10 (환율이 2:1일 경우)
- [v] $5 * 2 = $10
- [v] amount를 private
- [v] Dollar 부작용?
- Money 반올림?
- [v] equals()
- hashCode()
- Equal null
- Equal object
- [v] 5CHF * 2 = 10CHF
- Dollar/Franc 중복
- [v] 공용 equals
- 공용 times
- [v] Franc와 Dollar 비교하기
- 통화?
- testFrancMultiplication을 지워야 할까?
*/
public class DollarTest {
    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }
    
    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
