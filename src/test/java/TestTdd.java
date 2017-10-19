import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTdd {


    @Test
    public void testEquality() {
        Assertions.assertFalse(Money.makeFranc(20d).equals(Money.makeFranc(19.999d)));
        Assertions.assertTrue(Money.makeFranc(20d).equals(new Franc(20d, "CHF")));
        Assertions.assertTrue(Money.makeFranc(10d).equals(new Money(10d, "CHF")));
    }

    @Test
    public void testMultiplication() {
        Assertions.assertTrue(new Money(10d).equals(new Money(5d).times(2f)), "Two money objects unequal");
        Assertions.assertTrue(new Money(15d).equals(new Money(5d).times(3f)), "Two money objects unequal");
    }

    @Test
    public void testAddMoney() {
        Assertions.assertEquals(new Money(5d).plus(new Money(5d)), new Money(10d), "Two money objects unequal");
    }
}
