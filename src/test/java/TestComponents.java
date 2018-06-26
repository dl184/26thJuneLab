import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestComponents {
    
    Components components1;
    Components components2;
    Components components3;
    Car car;



    @Before
    public void setUp() throws Exception {
        car = new Car("Percy", 5000, "Burgandy");
        components1 = new Components("Wing Mirror");
        components2 = new Components("Air Fresher");
        components3 = new Components("Horn");

        ArrayList<Components> components = new ArrayList<Components>();
        components.add(components1);
        components.add(components2);
        components.add(components3);
    }

    @Test
    public void name() {
    }
}
