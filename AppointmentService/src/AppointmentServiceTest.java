import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppointmentServiceTest {

	@Test
	void testAppointmentService() {
		AppointmentService testService = new  AppointmentService();
		
		assertTrue(testService.getSize() == 2);
		assertTrue(testService.getList().get(0).getID().equals("10181992"));
	}
	
	@Test
	void testRemoveAppointment() {
		AppointmentService testService = new  AppointmentService();
		
		testService.removeAppointment("10181992");
		
		assertTrue(testService.getSize() == 1);
	}
	
	@Test
	void testRemoveException() {
		AppointmentService testService = new  AppointmentService();
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testService.removeAppointment("10111992");
		});
	}
	
	@Test
	void testAddAppointment() {
		AppointmentService testService = new  AppointmentService();
		@SuppressWarnings("deprecation")
		Date date1 = new Date(123, 10, 19);
		
		testService.addAppointment("10192023", date1, "Here is yet another description");
		
		assertTrue(testService.getList().get(2).getID().equals("10192023"));
		assertTrue(testService.getList().get(2).getDate().equals(date1));
		assertTrue(testService.getList().get(2).getInfo().equals("Here is yet another description"));
		
	}

}
