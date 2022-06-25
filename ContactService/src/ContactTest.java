

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("10181992", "Tyler", "Frey", "2516042954", "7261 Red Arrow Rd");
		assertTrue(contact.getID().equals("10181992"));
		assertTrue(contact.getFirstName().equals("Tyler"));
		assertTrue(contact.getLastName().equals("Frey"));
		assertTrue(contact.getPhoneNum().equals("2516042954"));
		assertTrue(contact.getAddress().equals("7261 Red Arrow Rd"));
		
		
	}
	
	@Test
	void testContactIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("10181992111", "Tyler", "Frey", "2516042954", "7261 Red Arrow Rd");});
	}
	
	@Test 
	void testContactNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("10181992", null, "Frey", "2516042954", "7261 Red Arrow Rd");});
	}
	
	@Test
	void testSetters() {
		Contact contact = new Contact("10181992", "Tyler", "Frey", "2516042954", "7261 Red Arrow Rd");
		contact.setfName("Alex");
		contact.setlName("Collier");
		contact.setPhoneNum("2516049809");
		contact.setAddress("1200 Grande Oak Blvd");
		
		assertTrue(contact.getID().equals("10181992"));
		assertTrue(contact.getFirstName().equals("Alex"));
		assertTrue(contact.getLastName().equals("Collier"));
		assertTrue(contact.getPhoneNum().equals("2516049809"));
		assertTrue(contact.getAddress().equals("1200 Grande Oak Blvd"));
	}

}
