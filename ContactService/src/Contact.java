
public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	public Contact(String ID, String fName, String lName, String pNum, String cAddress) {
		if (ID==null || fName==null || lName==null || pNum==null || cAddress==null) {
			throw new IllegalArgumentException("Not enough input");
		}
		if (ID.length()>10 || fName.length()>10 || lName.length()>10 || pNum.length()!=10 || cAddress.length()>30) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		this.contactID = ID;
		this.firstName = fName;
		this.lastName = lName;
		this.phoneNum = pNum;
		this.address = cAddress;
	}
	
	public String getID() {
		return contactID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public String getAddress() {
		return address;
	}

	public void setfName(String fName) {
		this.firstName = fName;
	}
	
	public void setlName(String lName) {
		this.lastName = lName;
	}
	
	public void setPhoneNum(String pNum) {
		this.phoneNum = pNum;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
