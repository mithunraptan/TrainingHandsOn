package com.jdbctraining;

import java.math.BigDecimal;

public class ProductReport {
	private String productName;
    private int totalOrders;
    private BigDecimal totalRevenue;

    public ProductReport(String productName, int totalOrders, BigDecimal totalRevenue) {
        this.productName = productName;
        this.totalOrders = totalOrders;
        this.totalRevenue = totalRevenue;
    }

    public String getProductName() {
        return productName;
    }

    public int getTotalOrders() {
        return totalOrders;
    }

    public BigDecimal getTotalRevenue() {
        return totalRevenue;
    }

    @Override
    public String toString() {
        return "Product Name: " + productName +
                ", Total Orders: " + totalOrders +
                ", Total Revenue: " + totalRevenue;
    }
	

}
