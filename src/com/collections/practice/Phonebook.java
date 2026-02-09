package com.collections.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Phonebook {
	
	List<Contact> listOfContact;
	
	public Phonebook(List<Contact> listOfContact) {
		super();
		this.listOfContact = listOfContact;
	}
	
	
	
	public static List<String> viewAllContact(List<Contact> listOfContact){
		List<String> listOfContactName = new ArrayList<String>();
		
		for(Contact contact : listOfContact) {
			listOfContactName.add(contact.getName());
		}
		return listOfContactName;
	}
	
	
	public static boolean searchContact(List<Contact> listOfContact , String searchingContactName) {
		for(Contact contact : listOfContact) {
			if(contact.getName().equalsIgnoreCase(searchingContactName)) {
				return true;
			}
		}
		return false;
		
	}
	
	public static List<Contact> deleteContact(List<Contact> listOfContact, long deleteContactNumber) {

	    Iterator<Contact> iterator = listOfContact.iterator();

	    while (iterator.hasNext()) {
	        Contact contact = iterator.next();
	        if (contact.getPhoneNumber() == deleteContactNumber) {
	            iterator.remove(); 
	            return listOfContact;
	        }
	    }

	    System.out.println("Contact not found");
	    return listOfContact;
	}


}
