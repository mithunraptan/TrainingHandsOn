package com.shop;

public class Product {
	
	 private String name;
	    private int stock;

	    public Product(String name, int stock) {
	        this.name = name;
	        this.stock = stock;
	    }

	    public boolean order(int quantity) {
	        if (quantity <= stock) {
	            stock = stock - quantity;
	            return true;
	        }
	        return false;
	    }

	    public int getStock() {
	        return stock;
	    }

}
