import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TestDealer {

    Dealer dealer;


    @Before
    public void setUp() throws Exception {
        dealer = new Dealer("Dodgy Dave");
        }

    @Test
    public void canGetName() {
        assertEquals("Dodgy Dave", dealer.getName());

    }
}
