import java.util.Vector;

public class TaskService {
	private Vector <Task> taskList = new Vector<Task>();
	private int size = 0;
	
	TaskService(){
		Task task1 = new Task("10181992", "Tyler", "This is my name to test");
		Task task2 = new Task("05031995", "Alex", "This is someone else's name");
		taskList.add(task1);
		taskList.add(task2);
		this.size = 2;
	}
	
	public Vector<Task> getList() {
		return taskList;
	}

	
	public int getSize() {
		return size;
	}

	
	public int getIndex(String id) {
		int i;
		int index = -1;
		for (i=0; i<taskList.size(); ++i) {
			if (taskList.get(i).getID() == id) {
				index = i;
			}
		}
		return index;
	}
	public void addTask(String id, String name, String description) {
		Task adding = new Task(id, name, description);
		taskList.add(adding);
		size+=1;
	}
	
	public void removeTask(String id) {
		int Index = getIndex(id);
		
		if (Index == -1) {
			throw new IllegalArgumentException("ID does not exist");
		}
		else {
			taskList.remove(Index);
			size-=1;
		}
	}
	
	public void updateName(String id, String name) {
		int index = getIndex(id);
		if (index == -1 || name.length()>20) {
			throw new IllegalArgumentException("Invalid arguments");
		}
		taskList.get(index).setName(name);
	}
	
	public void updateDescription(String id, String desc) {
		int index = getIndex(id);
		if (index == -1 || desc.length()>50) {
			throw new IllegalArgumentException("Invalid arguments");
		}
		taskList.get(index).setDesc(desc);
	}

}
