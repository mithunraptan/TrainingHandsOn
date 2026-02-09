package com.training.library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Library {
	
	

	//add member to db
	public Member addMember(Member member) throws SQLException {
		Connection conn = DbUtil.getConnection();
		
		String memberName = member.getMemberName();
		String memberId = member.getMemberId();
		
		String query = "Insert into employee values(?,?)";
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setString(1, memberId);
		pstmt.setString(2, memberName);
		
		boolean execute = pstmt.execute();
		if(execute) {
			return member;
		}
		else {
			return null;
		}
		
	}
	
	
	//fetch all employees
	
	public List<Member> getAllMembers() throws SQLException{
		Connection conn = DbUtil.getConnection();
		Statement statement = conn.createStatement();
		
		ResultSet rs = statement.executeQuery("select * from employee");
		
		List<Member> memberList = new ArrayList<>();
		while(rs.next()) {
			
			String id = rs.getString("emp_id");
			String name = rs.getString("emp_name");
			Member member = new Member(id, name);
			memberList.add(member);
		}
		return memberList;
	}
	
	
	// fetch particular member based on member name
	public Member getMember(String name) throws SQLException {

	    Member member = null;

	    String sql = "SELECT emp_id, emp_name FROM employee WHERE emp_name = ?";

	    try (Connection conn = DbUtil.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql)) {

	        ps.setString(1, name);

	        try (ResultSet rs = ps.executeQuery()) {
	            if (rs.next()) {
	                String id = rs.getString("emp_id");
	                String empName = rs.getString("emp_name");

	                member = new Member(id, empName);
	            }
	        }
	    }

	    return member;
	}
	
	
	// delete member and return status
	public boolean deleteMember(String name) throws SQLException {

	    String sql = "DELETE FROM employee WHERE emp_name = ?";

	    try (Connection conn = DbUtil.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql)) {

	        ps.setString(1, name);
	        int rowsAffected = ps.executeUpdate();

	        return rowsAffected > 0;
	    }
	}



}
