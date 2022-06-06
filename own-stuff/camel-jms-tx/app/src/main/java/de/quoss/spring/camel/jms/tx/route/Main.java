package de.quoss.spring.camel.jms.tx.route;

import org.apache.camel.builder.endpoint.EndpointRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Main extends EndpointRouteBuilder {

    static final String ROUTE_ID = "main";

    public void configure() {

        from(jms("topic:foo").clientId("client-id").durableSubscriptionName("durable-subscription")).routeId(ROUTE_ID)
                .to(log("foo"));

    }

}
