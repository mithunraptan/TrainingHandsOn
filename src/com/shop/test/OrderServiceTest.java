package com.shop.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import com.shop.InventoryService;
import com.shop.OrderService;

public class OrderServiceTest {

    @Test
    void orderShouldSucceedWhenStockIsAvailable() {

        // 1️ Create mock
        InventoryService inventoryMock = mock(InventoryService.class);

        // 2️ Define mock behavior
        when(inventoryMock.isStockAvailable("Laptop", 2))
                .thenReturn(true);

        // 3️ Inject mock into service
        OrderService orderService = new OrderService(inventoryMock);

        // 4️ Call method
        boolean result = orderService.placeOrder("Laptop", 2);

        // 5️ Verify result
        assertTrue(result);

        // 6️ Verify interaction
        verify(inventoryMock).isStockAvailable("Laptop", 2);
    }

    @Test
    void orderShouldFailWhenStockIsNotAvailable() {

        InventoryService inventoryMock = mock(InventoryService.class);

        when(inventoryMock.isStockAvailable("Mobile", 5))
                .thenReturn(false);

        OrderService orderService = new OrderService(inventoryMock);

        boolean result = orderService.placeOrder("Mobile", 5);

        assertFalse(result);

        verify(inventoryMock).isStockAvailable("Mobile", 5);
    }
}
