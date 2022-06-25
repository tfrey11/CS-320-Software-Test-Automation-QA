import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testService() {
		ContactService testService = new ContactService();
		
		assertTrue(testService.getSize() == 1);
		assertTrue(testService.getList().get(0).getID().equals("10181992"));
		
	}
	
	@Test
	void testUpdates() {
		ContactService testService = new ContactService();
		testService.changeContactName("10181992", "Alex", "Collier");
		testService.changePhoneNum("10181992", "2516049809");
		testService.changeAddress("10181992", "1200 Grande Oak Blvd");
		
		assertTrue(testService.getList().get(0).getFirstName().equals("Alex"));
		assertTrue(testService.getList().get(0).getLastName().equals("Collier"));
		assertTrue(testService.getList().get(0).getPhoneNum().equals("2516049809"));
		assertTrue(testService.getList().get(0).getAddress().equals("1200 Grande Oak Blvd"));
	}
	
	@Test
	void testRemove() {
		ContactService testService = new ContactService();
		
		testService.removeContact("10181992");
		assertTrue(testService.getSize()== 0);
		assertTrue(testService.getList().isEmpty());
	}
	
	@Test
	void testAdd() {
		ContactService testService = new ContactService();
		
		testService.addContact("05031995", "Alex", "Collier", "2516049809", "1200 Grande Oak Blvd");
		
		assertTrue(testService.getList().get(1).getID().equals("05031995"));
		assertTrue(testService.getList().get(1).getFirstName().equals("Alex"));
	}

}
