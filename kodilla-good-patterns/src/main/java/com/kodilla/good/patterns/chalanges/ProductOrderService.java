package com.kodilla.good.patterns.chalanges;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }
    public OrderDto process(Order order) {
        boolean isPurchased = orderService.purchaseOrder(order);

        if (isPurchased) {
            informationService.inform(order.getUser());
            orderRepository.createOrder(order);
            return new OrderDto(order.getUser(),order.getItem(),true);
        } else {
            return new OrderDto(order.getUser(),order.getItem(),false);

        }
    }
}
