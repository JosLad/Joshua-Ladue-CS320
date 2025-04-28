package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import contact.ContactService;

class TaskServiceTest {

	@AfterEach
	void tearDown() throws Exception { //clears task
		ContactService.contacts.clear();
	}

	@DisplayName("Testing adding task")
	@Test
	void testAddContact() {
        String ID = "0";
      	String firstName = "Brock";
        String lastName = "Jones";
        String phoneNumber = "1234567891";
        String address = "123";
        
        ContactService tempContact = new ContactService();
        
        assertEquals(0, ContactService.contacts.size());
        
        tempContact.addContact(firstName, lastName, phoneNumber, address);
       
		assertTrue(ContactService.contacts.containsKey(ID));
		assertEquals(firstName, ContactService.contacts.get(ID).getFirstName());
		assertEquals(lastName, ContactService.contacts.get(ID).getLastName());
		assertEquals(phoneNumber, ContactService.contacts.get(ID).getPhoneNumber());
		assertEquals(address, ContactService.contacts.get(ID).getAddress());
		
	}

	@DisplayName("Testing deleting task")			  
	@Test void testDeleteContact() {
				  
		String firstName = "Brock";
        String lastName = "Jones";
        String phoneNumber = "1234567891";
        String address = "123";
		  
        ContactService tempContact = new ContactService();
        
        assertEquals(0, ContactService.contacts.size());

        tempContact.addContact(firstName, lastName, phoneNumber, address);
        tempContact.addContact(firstName, lastName, phoneNumber, address);
		  
		assertEquals(2,ContactService.contacts.size());
		  
		tempContact.deleteContacts("1");
		  
		assertEquals(1,ContactService.contacts.size());
		assertFalse(ContactService.contacts.containsKey("1"));
			 
	}

	@DisplayName("Testing updating task")
	@Test
	void testUpdateTasks() {
		String ID = "0";
      	String firstName = "Brock";
        String lastName = "Jones";
        String phoneNumber = "1234567891";
        String address = "123";
		  
        ContactService tempContact = new ContactService();
        
        tempContact.addContact(firstName, lastName, phoneNumber, address);

        tempContact.updateContacts("0", firstName, lastName, phoneNumber, "New Address");
        assertEquals("New Address", ContactService.contacts.get(ID).getAddress());
        assertEquals(firstName, ContactService.contacts.get(ID).getFirstName());
        assertEquals(lastName, ContactService.contacts.get(ID).getLastName());
        assertEquals(phoneNumber, ContactService.contacts.get(ID).getPhoneNumber());
	}

}