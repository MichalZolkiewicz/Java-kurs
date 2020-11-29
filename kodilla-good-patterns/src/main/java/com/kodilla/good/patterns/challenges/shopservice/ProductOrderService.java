package com.kodilla.good.patterns.challenges.shopservice;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final OrderService orderService, final InformationService informationService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderData orderData) {
        boolean isBought = orderService.order(orderData.getUser(), orderData.getProduct());
        if(isBought) {
            System.out.println("Order created!");
            informationService.informUser(orderData.getUser());
            orderRepository.order(orderData.getUser(), orderData.getProduct());
            return new OrderDto(orderData.getUser(), true);
        }else{
            return new OrderDto(orderData.getUser(), false);
        }
    }
}
