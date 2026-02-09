package com.collections.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainDriverClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Contact> listOfContact = new ArrayList<>();

		boolean loop = true;

		while (loop) {

			System.out.println("press 1. for add new contact");
			System.out.println("press 2. for view all contacts");
			System.out.println("press 3. for specific contact");
			System.out.println("press 4. for delete");
			System.out.println("enter your choice : ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1: {

				System.out.println("enter the name of the contact : ");
				String name = sc.next();
				System.out.println("enter phone number : ");
				long phoneNumber = sc.nextLong();
				Contact contact = new Contact(name, phoneNumber);
				listOfContact.add(contact);

				Phonebook phonebook = new Phonebook(listOfContact);
				System.out
						.println("your " + listOfContact.getLast().getName() + " contact has been added successfully ");

				break;
			}
			case 2: {
				if (listOfContact.isEmpty()) {
					System.out.println("no contacts found!! please add contacts");
					ch = 1;
					break;
				} else {
					List<String> viewAllContact = Phonebook.viewAllContact(listOfContact);
					for (String name : viewAllContact) {
						System.out.println(name);
					}
				}

				break;
			}
			case 3: {

				if (listOfContact.isEmpty()) {
					System.out.println("no contacts found!! please add contacts to search");
					ch = 1;
					break;
				} else {
					System.out.println("enter your searching contact name : ");
					String searchingContactName = sc.next();
					boolean searchContact = Phonebook.searchContact(listOfContact, searchingContactName);
					if (searchContact) {
						System.out.println(searchingContactName + " found in your contact list ");
					} else {
						System.out.println(searchingContactName + " not found in your contact list ");
					}
				}

				break;
			}
			case 4: {

				if (listOfContact.isEmpty()) {
					System.out.println("no contacts found!! please add contacts to delete");
					ch = 1;
					break;
				} else {
					System.out.println("enter contact number to delete : ");
					long deleteContactNumber = sc.nextLong();

					List<Contact> afterDeleteContactList = Phonebook.deleteContact(listOfContact, deleteContactNumber);
					if (afterDeleteContactList != null) {
						listOfContact = afterDeleteContactList;
						System.out.println("contact deleted successfully");
					} else {
						System.out.println("contact number not found!!!");
					}

				}
				break;
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}

		}

	}

}
