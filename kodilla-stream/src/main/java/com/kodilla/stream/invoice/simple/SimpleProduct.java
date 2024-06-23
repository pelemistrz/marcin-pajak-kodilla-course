package com.kodilla.stream.invoice.simple;

public class SimpleProduct {
    private final String productName;
    private final double productPrice;

    public SimpleProduct(final String productName, final double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleProduct that = (SimpleProduct) o;
        return Double.compare(productPrice, that.productPrice) == 0 && productName.equals(that.productName);
    }

    @Override
    public int hashCode() {
        int result = productName.hashCode();
        result = 31 * result + Double.hashCode(productPrice);
        return result;
    }
}
