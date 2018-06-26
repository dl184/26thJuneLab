import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestTill {

    Till till;
    Car car;


    @Before
    public void setUp() {
        till = new Till(2000);
        car = new Car("Percy", 5000, "Burgandy");
        }

    @Test
    public void tillHasMoney() {
        assertEquals(2000, till.getCount());
    }

    @Test
    public void canAddToTill() {
        till.addToTill(car);
        assertEquals(7000, till.getCount());

    }
}
