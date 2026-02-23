package com.shop.test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import com.shop.Product;

public class ProductTest {
	   @Test
	    void orderShouldSucceedWhenStockIsEnough() {
	        Product product = new Product("Laptop", 10);

	        boolean result = product.order(5);

	        assertEquals(9, product.getStock());
	    }

	   

}
