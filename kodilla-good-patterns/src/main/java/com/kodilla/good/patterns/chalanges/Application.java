package com.kodilla.good.patterns.chalanges;


public class Application {
    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new PurchaseService(), new AllegroOrderRepository());
        productOrderService.process(order);
    }
}
