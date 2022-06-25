
public class Task {
	private String ID;
	private String taskName;
	private String taskDescription;
	
	public Task(String id, String name, String desc) {
		
		if (id.length()>10 || name.length()>20 || desc.length()>50) {
			throw  new IllegalArgumentException("Invalid argument");
		}
		if (id==null|| name==null|| desc==null) {
			throw  new IllegalArgumentException("Invalid argument");
		}
		
		this.ID = id;
		this.taskName = name;
		this.taskDescription = desc;
	}
	
	public String  getID() {
		return ID;
	}
	
	public String getName() {
		return taskName;
	}
	
	public String getDescription() {
		return taskDescription;
	}
	
	public void setName(String name) {
		if (name.length()>20) {
			throw new IllegalArgumentException("Name too long");
		}
		this.taskName = name;
	}
	
	public void setDesc(String desc) {
		if (desc.length()>50) {
			throw new IllegalArgumentException("Description too long");
		}
		this.taskDescription = desc;
	}

}
