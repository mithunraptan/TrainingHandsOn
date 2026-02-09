package com.training.library;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainDriver {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Member> listOfMember = new ArrayList<>();

		boolean loop = true;

		while (loop) {

			System.out.println("press 1. for add new member");
			System.out.println("press 2. for view all members");
			System.out.println("press 3. for specific member");
			System.out.println("press 4. for delete");
			System.out.println("enter your choice : ");
			int ch = sc.nextInt();
			Library lib = new Library();

			switch (ch) {
			case 1: {
				System.out.println("enter the name of the member : ");
				String name = sc.next();
				System.out.println("enter member id : ");
				String id = sc.next();
				
				
				Member member =  new Member(id, name);
				
				try {
					Member addedMember = lib.addMember(member);
					System.out.println("member added successfully ");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				
				break;
			}
			case 2: {
				
				try {
					List<Member> allMembers = lib.getAllMembers();
					for(Member member : allMembers) {
						System.out.println(member.getMemberName());
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				

				break;
			}
			case 3: {
				
				System.out.println("enter member name : ");
				String name = sc.next();
				try {
					Member member = lib.getMember(name);
					System.out.println(member.getMemberName() + " found in database ");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				break;
			}
			case 4: {
				System.out.println("enter member name : ");
				String name = sc.next();
				
				try {
					boolean deleteMember = lib.deleteMember(name);
					if(true) {
						System.out.println("member deleted!!!");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				break;
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}

		}

	}

}
