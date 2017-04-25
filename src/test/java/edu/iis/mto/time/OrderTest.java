package edu.iis.mto.time;

import edu.iis.mto.time.timeprovider.RealTimeProvider;
import org.junit.Test;

/**
 * Created by Wojciech Szczepaniak on 25.04.2017.
 */
public class OrderTest {

    @Test
    public void notExpiredOrderInConfirmNoThrowException() {
        Order order = new Order(new RealTimeProvider());
        order.submit();
        order.confirm();
    }
}
