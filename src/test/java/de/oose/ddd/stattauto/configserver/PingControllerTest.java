package de.oose.ddd.stattauto.configserver;

import de.oose.ddd.stattauto.configserver.controller.PingController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PingControllerTest {

    @Test
    public void pingReturnsPong() {
        PingController controller = new PingController();
        assertEquals("pong", controller.ping());
    }
}
