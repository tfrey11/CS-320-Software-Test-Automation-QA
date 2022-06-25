import java.util.Date;

public class Appointment {
	private String ID;
	private Date Date;
	private String description;
	
	public Appointment(String id, Date date, String desc ) { //Constructor for new appointments
		if (id.length() > 10 || date.before(new Date()) || desc.length() > 50) {
			throw new IllegalArgumentException("invalid entry"); //Checks for invalid argument lengths and invalid dates
		}
		
		if (id == null || desc == null) {
			throw new IllegalArgumentException("invalid entry"); //Checks for null arguments
		}
		
		this.ID = id;
		this.Date = date;
		this.description = desc;
			
		
	}
	
	public String getID() { //returns ID
		return ID;
	}
	
	public Date getDate() { // returns date
		return Date;
	}
	
	public String getInfo() { // returns description
		return description;
	}
	
	public void setDate(Date date) { //allows to update date 
		if (date.before(new Date())) {
			throw new IllegalArgumentException("invalid date");
		}
		
		this.Date = date;
	}
	
	public void setInfo(String desc) { // allows to update description
		if (desc.length() > 50) {
			throw new IllegalArgumentException("invalid description");
		}
		
		this.description = desc;
	}
	

}
