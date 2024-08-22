package com.kodilla.good.patterns.chalanges;

public class OrderDto {
    private User user;
    private Item item;
    private boolean isPurchased;

    public OrderDto(User user, Item item, boolean isPurchased) {
        this.user = user;
        this.item = item;
        this.isPurchased = isPurchased;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public boolean isPurchased() {
        return isPurchased;
    }
}
