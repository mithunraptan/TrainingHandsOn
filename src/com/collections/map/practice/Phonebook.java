package com.collections.map.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.collections.practice.Contact;

public class Phonebook {

	Map<Long, Contact> listOfContact;

	public Phonebook(Map<Long, Contact> listOfContact) {
		super();
		this.listOfContact = listOfContact;
	}

	public static Map<Long, String> viewAllContact(Map<Long, Contact> listOfContact) {

		Map<Long, String> getAllContacts = new HashMap<>();

		for (Entry<Long, Contact> entrySet : listOfContact.entrySet()) {
			Long phoneNumber = entrySet.getKey();
			String name = entrySet.getValue().getName();
			getAllContacts.put(phoneNumber, name);
		}

		return getAllContacts;
	}

	public static boolean searchContact(Map<Long, Contact> listOfContact, long phoneNumber) {

		for (Entry<Long, Contact> entrySet : listOfContact.entrySet()) {
			if (entrySet.getKey() == phoneNumber) {
				return true;
			}
		}
		return false;
	}

	public static Map<Long, Contact> deleteContact(Map<Long, Contact> listOfContact, long deleteContactNumber) {

		for (Entry<Long, Contact> entrySet : listOfContact.entrySet()) {
			if (entrySet.getKey() == deleteContactNumber) {
				listOfContact.remove(deleteContactNumber);
				return listOfContact;
			}
		}
		return listOfContact;

	}

}
