
import java.util.*;

public class ContactService {
	private Vector<Contact> contactsList = new Vector<Contact>();
	private  int size;
	
	public ContactService() {
		Contact con1 = new Contact("10181992", "Tyler", "Frey", "2516042954", "7261 Red Arrow Road");
		contactsList.add(con1);
		size = 1;
	}
	
	public void addContact(String ID, String fName, String lName, String pNum, String address) {
		Contact next = new Contact(ID, fName, lName, pNum, address);
		contactsList.add(next);
		size += 1;
		}
	
	public int findContact(String ID) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (contactsList.get(i).getID().equals(ID)) {
				index = i;
			}
		}
		return index;
	}
	public Contact searchContact(String ID) {
		for (int i =0; i < size; i++) {
			if (contactsList.get(i).getID().equals(ID)) {
				return contactsList.get(i);
				
			}
		}
		return null;
	}
	
	public void changeContactName(String ID, String fName, String lName) {
		Contact target = searchContact(ID);
		if (fName.length() > 10 || lName.length() > 10) {
			throw new IllegalArgumentException("Invalid argument");
		}
		target.setfName(fName);
		target.setlName(lName);
	}
	public void changePhoneNum(String ID, String pNum) {
		Contact target = searchContact(ID);
		if (pNum.length() != 10) {
			throw new IllegalArgumentException("Invalid argument");
		}
		target.setPhoneNum(pNum);
	}
	public void changeAddress(String ID, String address) {
		Contact target  = searchContact(ID);
		if (address.length() > 30) {
			throw new IllegalArgumentException("Invalid argument");
		}
		target.setAddress(address);
	}
	public void removeContact(String ID) {
		int target = findContact(ID);
		
		if (target != -1) {
			contactsList.remove(target);
			size -=1;
			
		}
		else {
			throw new IllegalArgumentException("Contact does not exist.");
		}
	}
	public Vector<Contact> getList(){
		return contactsList;
	}
	
	public int getSize() {
		return size;
	}
	

}
