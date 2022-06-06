package de.quoss.spring.camel.jms.tx.route;

import org.apache.activemq.artemis.core.server.embedded.EmbeddedActiveMQ;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MainTest {

    private static final EmbeddedActiveMQ EMBEDDED = new EmbeddedActiveMQ();

    @BeforeAll
    static void setUpClass() throws Exception {
        EMBEDDED.start();
    }

    @AfterAll
    static void tearDownClass() throws Exception {
        EMBEDDED.stop();
    }

    @Test
    void testDefault() throws Exception {
        Thread.sleep(5000L);
    }

}
