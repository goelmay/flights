package entity;

public class Bookings {
  
	private int pnr;
	private int userId;
	private int travelId;
	
	
	public Bookings(){
		
	}
	
	public Bookings(int pnr, int userId,int travelId) {
		super();
		this.pnr = pnr;
		this.userId = userId;
		this.travelId = travelId;
		
		
	}
   
	
   
	
	
	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getTravelId() {
		return travelId;
	}

	public void setTravelId(int travelId) {
		this.travelId = travelId;
	}

	@Override
	public String toString() {
		return "Bookings [pnr=" + pnr + ", userId=" + userId + ", travelId=" + travelId + "]";
	}
	
}



