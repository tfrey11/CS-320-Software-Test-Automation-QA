import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class TaskServiceTest {

	@Test
	void testTaskService() {
		TaskService test1 = new TaskService();
		assertTrue(test1.getSize()==2);
		assertTrue(test1.getList().get(0).getName().equals("Tyler"));
	}
	
	@Test
	void testAddTask() {
		TaskService test1 = new TaskService();
		test1.addTask("101010", "name", "description");
		
		assertTrue(test1.getSize()==3);
		assertTrue(test1.getList().get(2).getName().equals("name"));
	}
	
	@Test
	void testRemoveTask() {
		TaskService test1 = new TaskService();
		test1.removeTask("10181992");
		
		assertTrue(test1.getSize() == 1);
		assertTrue(test1.getList().get(0).getName().equals("Alex"));
	}
	
	@Test
	void testUpdateName() {
		TaskService test1 = new TaskService();
		test1.updateName("10181992", "Charlie");
		assertTrue(test1.getList().get(0).getName().equals("Charlie"));
	}
	
	@Test
	void testUpdateDescription() {
		TaskService test1 = new TaskService();
		test1.updateDescription("10181992", "This des");
		assertTrue(test1.getList().get(0).getDescription().equals("This des"));
	}
	
	@Test 
	void testRemoveInvalid() {
		TaskService test1 = new TaskService();
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			test1.removeTask("1010");
		});
	}
	
	@Test
	void testUpdateNameToLong() {
		TaskService test1 = new TaskService();
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			test1.updateName("10181992", "This is longer than 20 characters");
		});
	}
	
	@Test
	void testUpdateDescToLong() {
		TaskService test1 = new TaskService();
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			test1.updateDescription("10181992", "This is a description that is longer than 50 charactters which is too long");
		});
	}

}
