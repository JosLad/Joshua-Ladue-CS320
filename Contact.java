
package contact;

public class Contact {
	
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;	
	
	
	private final boolean validateID(String contactID) {
		if(contactID == null || contactID.length() > 10) {
			return false;			
		}		
		return true;
	}
	
	private final boolean validateFirstName(String firstName) {
		if(firstName == null || firstName.length() > 10) {	
			return false;			
		}
		return true;
	}
	
	
	private final boolean validateLastName(String lastName) {
		if(lastName == null || lastName.length() > 10) {
			return false;			
		}
		return true;
	}
	
	
	private final boolean validatePhone(String phoneNumber) {
		if(phoneNumber == null || phoneNumber.length() != 10) {
			return false;			
		}
		return true;
	}
	
	private final boolean validateAddress(String address) {
		if(address == null || address.length() > 30) {
			return false;			
		}
		return true;
	}
	
	public Contact(String contactID, 
			String firstName, 
			String lastName, 
			String phoneNumber, 
			String address) {
		
		if(!this.validateID(contactID)) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		
		if(!this.validateFirstName(firstName)) {
			throw new IllegalArgumentException("Invalid first name");
		}
		
		if(!this.validateLastName(lastName)) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		if(!this.validatePhone(phoneNumber)) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		if(!this.validateAddress(address)) {
			throw new IllegalArgumentException("Invalid address");
		}		
		
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setAddress(address);
	}

	public int getContactID() {
		return Integer.valueOf(contactID);
	}

	
	public void setContactID(String contactID) {
		if(!this.validateID(contactID)) {
			throw new IllegalArgumentException("Invalid contactID");
		}
		this.contactID = contactID;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if(!this.validateFirstName(firstName)) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if(!this.validateLastName(lastName)) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if(!this.validatePhone(phoneNumber)) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if(!this.validateAddress(address)) {
			throw new IllegalArgumentException("Invalid address");
		}	
		this.address = address;
	}

}