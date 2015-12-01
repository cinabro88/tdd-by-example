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
*/
public class DollarTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }
    
    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
        assertFalse(new Franc(5).equals(new Dollar(5)));
    }
}
