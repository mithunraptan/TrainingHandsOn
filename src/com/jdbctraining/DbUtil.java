package com.jdbctraining;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class DbUtil {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/sql_practice";
		String username = "postgres";
		String password = "mithun";
		Connection conn = DriverManager.getConnection(url, username, password);

		if (conn != null) {
			System.out.println("Connected successfully");
			// write a jdbc program that deletes a product
			// condition: if the product has associated with orders -> do not delete
			// otherwise delete successfully

//				String deleteQuery = "delete from product where prod_name in "
//						+ "(select p.prod_name from product p left outer join orders o on p.prod_id=o.prod_id where o.ord_id is null)";
//				PreparedStatement pstmt = conn.prepareStatement(deleteQuery);
//				int executeUpdate = pstmt.executeUpdate();
//				if(executeUpdate!=0) {
//					System.out.println("deleted "+ executeUpdate + " products from product table which has not associated with the orders table");
//				}
//				else {
//					System.out.println("can't delete product ");
//			}
			
			
			
			
			

			// write a jdbc code to insert multiple values in product table.
			// use the sorted procedure that was created in the last session.
			// use callable statement to call the procedure

//			String sql = "CALL insert_row(?, ?, ?, ?, ?)";
//			CallableStatement cstmt = conn.prepareCall(sql);
//
//			Scanner sc = new Scanner(System.in);
//
//			while (true) {
//			    System.out.print("Enter Product ID: ");
//			    int prodId = sc.nextInt();
//			    sc.nextLine(); // consume newline
//
//			    System.out.print("Enter Product Name: ");
//			    String prodName = sc.nextLine();
//
//			    System.out.print("Enter Product Description: ");
//			    String prodDesc = sc.nextLine();
//
//			    System.out.print("Enter Product Price: ");
//			    BigDecimal price = sc.nextBigDecimal(); // ✅ better for NUMERIC
//			    sc.nextLine(); // consume newline
//
//			    System.out.print("Enter Product category: ");
//			    String prodCategory = sc.nextLine();
//
//			    // Set parameters
//			    cstmt.setInt(1, prodId);
//			    cstmt.setString(2, prodName);
//			    cstmt.setString(3, prodDesc);
//			    cstmt.setBigDecimal(4, price);
//			    cstmt.setString(5, prodCategory);
//
//			    //to call PostgreSQL PROCEDURE
//			    cstmt.executeUpdate();
//
//			    System.out.println("Product inserted successfully!");
//
//			    System.out.print("Do you want to insert another product? (yes/no): ");
//			    String choice = sc.nextLine().trim().toLowerCase();
//
//			    if (choice.equals("no")) {
//			        System.out.println("All products inserted.");
//			        break;
//			    }
//			}
//
//			//cleanup
//			cstmt.close();
//			sc.close();
			
			
			
			
			
			

			// write a jdbc program that: create a pojo class for product report
			// fetches top three products based on number of orders
			// Display:
			// prodName
			// oderCount
			// totalRevenue

//			String sql = """
//				    select p.prod_name, count(*) as total_orders, sum(price) as total_revenue
//				    from product p 
//				    inner join orders o
//				    on p.prod_id = o.prod_id
//				    group by p.prod_name
//				    order by total_orders desc
//				    limit 3
//				""";
//
//				PreparedStatement ps = conn.prepareStatement(sql);
//				ResultSet rs = ps.executeQuery();
//
//				List<ProductReport> list = new ArrayList<>();
//
//				while (rs.next()) {
//
//				    String name = rs.getString("prod_name");
//				    int totalOrders = rs.getInt("total_orders");
//				    BigDecimal totalRevenue = rs.getBigDecimal("total_revenue");
//
//				    ProductReport obj = new ProductReport(name, totalOrders, totalRevenue);
//				    list.add(obj);
//				}
//				
//				list.forEach((obj)-> System.out.println(obj));
//
//				rs.close();
//				ps.close();
			
			
			
			
			
			
			

			// write a jdbc program that
			// insert multiple products using batch processing
			// then inserts multiple orders for those products using batch
			// commit transaction if all inserts succeed
			// rollback entirely if any failure occurs

			// requirements: use addBatch() and executeBatch() methods
			// con.setAutoCommit(false);
			// con.commit();
			// con. rollback();

//			try {
//				Scanner sc = new Scanner(System.in);
//				// disabled auto commit
//				conn.setAutoCommit(false);
//
//				String productSql = "INSERT INTO product(prod_id, prod_name, prod_desc, price, prod_category) "
//						+ "VALUES (?, ?, ?, ?, ?)";
//				PreparedStatement pstmt = conn.prepareStatement(productSql);
//
//				System.out.print("How many products to insert? ");
//				int productCount = sc.nextInt();
//				sc.nextLine();
//
//				for (int i = 1; i <= productCount; i++) {
//					System.out.println("\nEnter details for Product " + i);
//
//					System.out.print("Product ID: ");
//					int prodId = sc.nextInt();
//					sc.nextLine();
//
//					System.out.print("Product Name: ");
//					String prodName = sc.nextLine();
//
//					System.out.print("Product Description: ");
//					String prodDesc = sc.nextLine();
//
//					System.out.print("Product Price: ");
//					BigDecimal price = sc.nextBigDecimal();
//					sc.nextLine();
//
//					System.out.print("Product Category: ");
//					String category = sc.nextLine();
//
//					pstmt.setInt(1, prodId);
//					pstmt.setString(2, prodName);
//					pstmt.setString(3, prodDesc);
//					pstmt.setBigDecimal(4, price);
//					pstmt.setString(5, category);
//
//					pstmt.addBatch(); // adding the prepared statements to batch
//
//				}
//
//				// executing all the prepared statements at once
//				pstmt.executeBatch();
//
//				// commit if all the records added in the
//				conn.commit();
//				System.out.println("All products and orders inserted successfully!");
//
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("Error occurred. Transaction rolled back!");
//				conn.rollback();
//			}
			
			
			
			
			//create a jdbc based search feature where user can filter orders by:
			//orderType (optional)
			//startDate (optional)
			//endDate (optional)
			//minPrice (optional)
			
	        // Take User Inputs
			Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Order Type (or press Enter to skip): ");
	        String orderType = sc.nextLine().trim();

	        System.out.print("Enter Start Date (yyyy-mm-dd) or press Enter to skip: ");
	        String startDate = sc.nextLine().trim();

	        System.out.print("Enter End Date (yyyy-mm-dd) or press Enter to skip: ");
	        String endDate = sc.nextLine().trim();

	        System.out.print("Enter Minimum Price (or press Enter to skip): ");
	        String minPriceInput = sc.nextLine().trim();

	        //Build Dynamic Query
	        StringBuilder sql = new StringBuilder(
	                "SELECT o.ord_type, o.ord_date, p.prod_name, p.price " +
	                "FROM orders o " +
	                "JOIN product p ON o.prod_id = p.prod_id " +
	                "WHERE 1=1 ");

	        List<Object> params = new ArrayList<>();

	        if (!orderType.isEmpty()) {
	            sql.append(" AND o.ord_type = ? ");
	            params.add(orderType);
	        }

	        if (!startDate.isEmpty()) {
	            sql.append(" AND o.ord_date >= ? ");
	            params.add(Date.valueOf(startDate));
	        }

	        if (!endDate.isEmpty()) {
	            sql.append(" AND o.ord_date <= ? ");
	            params.add(Date.valueOf(endDate));
	        }

	        if (!minPriceInput.isEmpty()) {
	            sql.append(" AND p.price >= ? ");
	            params.add(new java.math.BigDecimal(minPriceInput));
	        }

	        PreparedStatement ps = conn.prepareStatement(sql.toString());

	        // Set Parameters Dynamically
	        for (int i = 0; i < params.size(); i++) {
	            ps.setObject(i + 1, params.get(i));
	        }

	        ResultSet rs = ps.executeQuery();

	        // -------------------------------
	        System.out.println("\n--- Search Results ---");

	        while (rs.next()) {
	            System.out.println(
	                    rs.getString("ord_type") + " | " +
	                    rs.getDate("ord_date") + " | " +
	                    rs.getString("prod_name") + " | " +
	                    rs.getBigDecimal("price"));
	        }
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		} else {
			System.out.println("Connection failed");
		}

	}

}
