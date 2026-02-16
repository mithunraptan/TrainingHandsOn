package com.collections.map.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.collections.practice.Contact;

public class MainDriverClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<Long, Contact> listOfContact = new HashMap<>();

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
				listOfContact.put(phoneNumber, contact);

				Phonebook phonebook = new Phonebook(listOfContact);
				System.out.println(
						"your " + listOfContact.get(phoneNumber).getName() + " contact has been addded successfully");
				break;
			}
			case 2: {
				if (listOfContact.isEmpty()) {
					System.out.println("no contacts found!! please add contacts");
//					ch = 1;
					break;
				} else {
					Map<Long, String> viewAllContact = Phonebook.viewAllContact(listOfContact);

					for (Entry<Long, String> entrySet : viewAllContact.entrySet()) {
						System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
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
					System.out.println("enter your searching contact number : ");
					long phoneNumber = sc.nextLong();
					boolean searchContact = Phonebook.searchContact(listOfContact, phoneNumber);

					if (searchContact) {
						System.out.println(phoneNumber + " found in your contact list ");
					} else {
						System.out.println(phoneNumber + " not found in your contact list ");
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

					Map<Long, Contact> afterDeleteContactList = Phonebook.deleteContact(listOfContact,
							deleteContactNumber);
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
