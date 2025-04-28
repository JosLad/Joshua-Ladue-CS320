package contact;

import java.util.HashMap;

public class ContactService {
	
	int currentID = 0;
	
	public static HashMap<String, Contact> contacts = new HashMap<String, Contact>();
	
	public void addContact(String firstName, String lastName, String phoneNumber, String address) {

		String stringID = Integer.toString(currentID);	
		
		Contact tempContact = new Contact (stringID, firstName, lastName, phoneNumber, address);
		
		contacts.put(stringID, tempContact);	

		++currentID;		
	}
	
	public void deleteContacts(String ID) {
		
		if(contacts.containsKey(ID)) {			
			contacts.remove(ID);
		}		
	}
	
	public void updateContacts(String ID, String newFirstName, String newLastName, String newPhonenumber, String newAddress) {
		
		if(contacts.containsKey(ID)) {
			
			contacts.get(ID).setFirstName(newFirstName);
			
			contacts.get(ID).setLastName(newLastName);
			
			contacts.get(ID).setPhoneNumber(newPhonenumber);
			
			contacts.get(ID).setAddress(newAddress);
		}
		
	}
}