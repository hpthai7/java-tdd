import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTdd {


    @Test
    public void testMoneyEquals() {
        Assertions.assertTrue(new Money(10d).equals(new Money(5d).times(2f)), "Two objects unequal");
    }
}
