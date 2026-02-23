package com.shop;

public class OrderService {
	private InventoryService inventoryService;

    public OrderService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public boolean placeOrder(String productName, int quantity) {
        if (inventoryService.isStockAvailable(productName, quantity)) {
            return true; // order success
        }
        return false; // order failed
    }

}
