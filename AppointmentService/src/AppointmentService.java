import java.util.Vector;
import java.util.Date;

public class AppointmentService {
	private Vector<Appointment> appointmentList;
	private int size;
	
	AppointmentService() { //Constructor, also populates list with 2  appointments
		appointmentList = new Vector<Appointment>();
		@SuppressWarnings("deprecation")
		Date date1 = new Date(123, 10, 18);
		@SuppressWarnings("deprecation")
		Date date2 = new Date(123, 5, 3);
		Appointment app1 = new Appointment("10181992", date1, "this is my desc");
		Appointment app2 = new Appointment("05031995", date2, "this is another desc");
		
		appointmentList.add(app1);
		appointmentList.add(app2);
		
		this.size = 2;
	}
	
	public void addAppointment(String id, Date date, String desc) { //creates new appointment and adds to list
		Appointment newapp = new Appointment(id, date, desc);
		appointmentList.add(newapp);
		size += 1;
	}
	
	public int searchList(String id) { //searches list and returns index of appointment or -1 if appointment doesn't exist
		int index = -1;
		for (int i = 0; i < appointmentList.size(); ++i) {
			if (appointmentList.get(i).getID().equals(id)) {
				index = i;
			}
		}
		return index;
	}
	
	public void removeAppointment(String id) { //searches for appointment and removes from list by index or throws exception if appointment doesn't exist
		int target = searchList(id);
		
		if (target == -1) {
			throw new IllegalArgumentException("Appointment does not exist");
		}
		
		appointmentList.remove(target);
		size -= 1;
	}
	
	public int getSize() { //returns size of appointment list
		return size;
	}
	
	public Vector<Appointment> getList() {
		return appointmentList;
	}

}
