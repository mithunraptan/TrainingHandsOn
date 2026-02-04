package com.studentavg;

import java.util.Arrays;

public class Shop {
	
	public Shop(String shopName, String shopAddress, String[] product) {
		super();
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.product = product;
	}
	String shopName;
	String shopAddress;
	String[] product;
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	public String[] getProduct() {
		return product;
	}
	public void setProduct(String[] product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Shop [shopName=" + shopName + ", shopAddress=" + shopAddress + ", product=" + Arrays.toString(product)
				+ "]";
	}

	

	
	

}
