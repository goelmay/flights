package entity;


public class UserDetails {

	
    private int userId;
	private String name;
	private String emailId;
	private int phoneNo;
	
	public UserDetails(){
		
	}
	
	public UserDetails(int userId, String name,String emailId, int phoneNo) {
		super();
		this.userId = userId;
		this.name = name;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		
	}
   
	
   
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Flights [userId=" + userId + ", name=" + name + ", emailId=" + emailId + ", phoneNo=" + phoneNo + "]";
	}
	
}


