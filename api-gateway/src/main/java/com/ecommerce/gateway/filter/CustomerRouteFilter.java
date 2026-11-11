package com.ecommerce.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import reactor.core.publisher.Mono;

public class CustomerRouteFilter extends AbstractGatewayFilterFactory<Object> {

    public CustomerRouteFilter() {
        super(Object.class);
    }

    @Override
    public GatewayFilter apply(Object config) {
        return (exchange, chain) -> {
            System.out.println("Route Filter: before routing");
            exchange.getRequest().mutate().header("X-Route-Header", "Added-By-Gateway")
                    .build();

            return chain.filter(exchange).then(Mono.fromRunnable(()->
                    System.out.println("Route Filter: After routing")));
        };
    }
}
