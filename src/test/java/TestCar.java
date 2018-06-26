import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCar {

    Car car;

    @Before
    public void setUp() throws Exception {
      car = new Car("Percy", 5000, "Burgandy");
    }

    @Test
    public void canGetName() {
        assertEquals("Percy", car.getName());

    }

    @Test
    public void canPrice() {
        assertEquals(5000,(int) car.getPrice());

    }

    @Test
    public void canGetColour() {
        assertEquals("Burgandy", car.getColour());
        }
}
