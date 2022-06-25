import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {

	@Test
	void testTask() {
		Task task = new Task("10181992", "Tyler", "This is my description");
		assertTrue(task.getID().equals("10181992"));
		assertTrue(task.getName().equals("Tyler"));
		assertTrue(task.getDescription().equals("This is my description"));
	}
	
	@Test
	void testTaskIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task("10181992101", "Tyler", "This is my description");
		});
	}
		
}
