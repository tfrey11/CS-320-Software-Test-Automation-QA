import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppointmentTest {

	@Test
	void testAppointment() {
		@SuppressWarnings("deprecation")
		Date date1 = new Date(123, 10, 18);
		Appointment testAppointment = new Appointment("10181992", date1, "this is my desc");
		
		assertTrue(testAppointment.getID().equals("10181992"));
		assertTrue(testAppointment.getDate().equals(date1));
		assertTrue(testAppointment.getInfo().equals("this is my desc"));
	}
	
	@Test
	void testIDLength() {
		@SuppressWarnings("deprecation")
		Date date1 = new Date(123, 10, 18);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("10181992101", date1, "this is my desc");
		});
	}
	
	@Test
	void testInvalidDate() {
		@SuppressWarnings("deprecation")
		Date date1 = new Date(92, 10, 18);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("10181992", date1, "this is my desc");
		});
	}
	
	@Test
	void testSetDate() {
		@SuppressWarnings("deprecation")
		Date date1 = new Date(123, 10, 18);
		@SuppressWarnings("deprecation")
		Date date2 = new Date(123, 11, 18);
		
		Appointment testAppointment = new Appointment("10181992", date1, "this is my desc");
		
		testAppointment.setDate(date2);
		
		assertTrue(testAppointment.getDate().equals(date2));
	}
	
	@Test
	void setDesc() {
		@SuppressWarnings("deprecation")
		Date date1 = new Date(123, 10, 18);
		Appointment testAppointment = new Appointment("10181992", date1, "this is my desc");
		
		testAppointment.setInfo("This is another desc");
		
		assertTrue(testAppointment.getInfo().equals("This is another desc"));
	}

}
