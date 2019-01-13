package entity;

import service.RandomNumberGeneration;

public class UserDetails {

	
    private int userId;
	private String name;
	private String emailId;
	private String phoneNo;
	
	public UserDetails(){
		
	}
	
	public UserDetails(int userId, String name,String emailId, String phoneNo) {
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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Flights [userId=" + userId + ", name=" + name + ", emailId=" + emailId + ", phoneNo=" + phoneNo + "]";
	}

	public void input(String name, String email, String phone, int userId) {
		// TODO Auto-generated method stub
		this.setName(name);
		this.setEmailId(email);
		this.setPhoneNo(phone);
		this.setUserId(userId);
	}
	
}


