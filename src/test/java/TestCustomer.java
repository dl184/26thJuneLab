import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCustomer {

    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer(4800);
    }

    @Test
    public void getWalletAmount() {
        assertEquals(4800, customer.getAmount());
    }
}
