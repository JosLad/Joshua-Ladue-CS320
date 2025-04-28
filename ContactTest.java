package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import contact.Contact;

class TaskTest {

	//testing for valid inputs below
	
	@DisplayName("Testing a valid ContactID")
	@Test
	void validIDTest() {
		
		String ContactID = "1";
      	String firstName = "Brock";
        String lastName = "Jones";
        String phoneNumber = "1234567891";
        String address = "123";

		
        Contact tempContact = new Contact(ContactID, firstName, lastName, phoneNumber, address);
        
        tempContact.setContactID("1");
        
		assertEquals(1, tempContact.getContactID());
		//assertEquals(firstName, tempContact.getFirstName());
		//assertEquals(lastName, tempContact.getLastName());
		//assertEquals(phoneNumber, tempContact.getPhoneNumber());
		//assertEquals(address, tempContact.getAddress());
	}
	
	
	
	@DisplayName("Testing a valid first name")
	@Test
	public void validFirstName() {
		String ID = "0";
      	String firstName = "Brock";
        String lastName = "Jones";
        String phoneNumber = "1234567891";
        String address = "123";
		
        Contact tempContact = new Contact(ID, firstName, lastName, phoneNumber, address);  
        tempContact.setFirstName("Test Name");        
        assertEquals("Test Name", tempContact.getFirstName());
	}
	
	@DisplayName("Testing a valid last name")
	@Test
	public void validDescription() {
		String ID = "0";
      	String firstName = "Brock";
        String lastName = "Jones";
        String phoneNumber = "1234567891";
        String address = "123";
		
        Contact tempContact = new Contact(ID, firstName, lastName, phoneNumber, address);  
        tempContact.setLastName("Test Name");        
        assertEquals("Test Name", tempContact.getLastName());
	}
	
	@DisplayName("Testing a valid phone number")
	@Test
	public void validPhoneNumber() {
		String ID = "0";
      	String firstName = "Brock";
        String lastName = "Jones";
        String phoneNumber = "1234567891";
        String address = "123";
		
        Contact tempContact = new Contact(ID, firstName, lastName, phoneNumber, address);  
        tempContact.setPhoneNumber("Test Phone");        
        assertEquals("Test Phone", tempContact.getPhoneNumber());
	}
	
	@DisplayName("Testing a valid address")
	@Test
	public void validAddress() {
		String ID = "0";
      	String firstName = "Brock";
        String lastName = "Jones";
        String phoneNumber = "1234567891";
        String address = "123";
		
        Contact tempContact = new Contact(ID, firstName, lastName, phoneNumber, address);  
        tempContact.setAddress("Test Address");        
        assertEquals("Test Address", tempContact.getAddress());
	}
	
	//testing for too long inputs below
	
	@DisplayName("Testing a too long ID")
	@Test
	void tooLongIDTest() {
		
		String ID = "11111111111111111111";
      	String firstName = "Brock";
        String lastName = "Jones";
        String phoneNumber = "1234567891";
        String address = "123";
       
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(ID, firstName, lastName, phoneNumber, address);
        });       
	}

	
	@DisplayName("Testing a too long first name")
	@Test
	public void tooLongNameTest() {
		String ID = "1";
      	String firstName = "Brock1234567890123456789011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111";
        String lastName = "Jones";
        String phoneNumber = "1234567891";
        String address = "123";
		
                
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(ID, firstName, lastName, phoneNumber, address);
        });	
	}
	
	
	@DisplayName("Testing a too long last name")
	@Test
	void tooLongDescriptionTest() {
		
		String ID = "1";
      	String firstName = "Brock";
        String lastName = "Jones12345678901234567890";
        String phoneNumber = "1234567891";
        String address = "123";
       
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(ID, firstName, lastName, phoneNumber, address);
        });		
	}
	
	@DisplayName("Testing a too long phone number")
	@Test
	void tooLongPhoneNumber() {
		
		String ID = "1";
      	String firstName = "Brock";
        String lastName = "Jones";
        String phoneNumber = "12345678911234567891";
        String address = "123";
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(ID, firstName, lastName, phoneNumber, address);
        });
		
	}
	
	@DisplayName("Testing a too long address")
	@Test
	void tooLongAddress() {
		
		String ID = "1";
      	String firstName = "Brock";
        String lastName = "Jones";
        String phoneNumber = "1234567891";
        String address = "123 123456789012345678901234567890123456789012345678901234567890";
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(ID, firstName, lastName, phoneNumber, address);
        });
		
	}
	
	
	//testing null inputs below
	
	@DisplayName("Testing a null ID")
	@Test
	void nullIDTest() {
		
		String ID = null;
      	String firstName = "Brock";
        String lastName = "Jones";
        String phoneNumber = "1234567891";
        String address = "123";
       
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(ID, firstName, lastName, phoneNumber, address);
        });       
	}
	
	@DisplayName("Testing a null first name")
	@Test
	public void nullFirstNameTest() {
		String ID = "1";
      	String firstName = null;
        String lastName = "Jones";
        String phoneNumber = "1234567891";
        String address = "123";
		         
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(ID, firstName, lastName, phoneNumber, address);
        });
	}
	
	@DisplayName("Testing a null last name")
	@Test
	public void nullLastNameTest() {
		String ID = "1";
      	String firstName = "Brock";
        String lastName = null;
        String phoneNumber = "1234567891";
        String address = "123";                 
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(ID, firstName, lastName, phoneNumber, address); 
        });	
	}
	
	@DisplayName("Testing a null phone number")
	@Test
	public void nullPhoneNumberTest() {
		
		String ID = "1";
      	String firstName = "Brock";
        String lastName = "Jones";
        String phoneNumber = null;
        String address = "123";                 
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(ID, firstName, lastName, phoneNumber, address); 
        });
		
	}
	
	@DisplayName("Testing a null address")
	@Test
	public void nullAddressTest() {
		
		String ID = "1";
      	String firstName = "Brock";
        String lastName = "Jones";
        String phoneNumber = "1234567891";
        String address = null;
		
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(ID, firstName, lastName, phoneNumber, address); 
        });
        
	}
	

}
