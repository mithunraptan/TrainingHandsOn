package com.studentavg;

import java.util.Scanner;

public class ShopProductMain {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter how many shops you have");
	    int shopCount = sc.nextInt();
	    //array of Shop
	    Shop[] shopArray = new Shop[shopCount];

	    for (int i = 0; i < shopCount; i++) {
	        System.out.println("enter shop name ");
	        String shopName = sc.next();

	        System.out.println("enter shopAddress ");
	        String shopAddress = sc.next();

	        System.out.println("enter how many products you want to store in your " + (i + 1) + " shop");
	        int numberOfProducts = sc.nextInt();
	        
	        //product array
	        String[] allProducts = new String[numberOfProducts];

	        for (int j = 0; j < numberOfProducts; j++) {
	            System.out.println("enter product name ");
	            String productName = sc.next();
	            allProducts[j] = productName;
	        }

	        //creating Shop object
	        Shop shop = new Shop(shopName, shopAddress, allProducts);
	        //adding the Shop object to shopArray
	        shopArray[i] = shop;
	    }

	    
	    //Find Product part
	    
	    System.out.println("enter product name to search ");
	    String searchingProductName = sc.next();

	    System.out.println("enter shop name where you want to search the product ");
	    String searchingShopName = sc.next();

	    boolean productFound = false;   // added this to track if the product is there in the shop or not

	    for (int i = 0; i < shopArray.length; i++) {

	        if (shopArray[i].getShopName().equalsIgnoreCase(searchingShopName)) {

	            String[] allProductList = shopArray[i].getProduct();

	            for (int j = 0; j < allProductList.length; j++) {

	                if (searchingProductName.equalsIgnoreCase(allProductList[j])) {
	                    System.out.println(" Product Found!");
	                    productFound = true;
	                    break;
	                }
	            }
	        }
	    }

	    // Product Not Found part
	    if (!productFound) {
	        System.out.println(" Product Not Found in the shop! ");
	    }
	}


}
