package entity;

public class Flights {

	private int flightId;
	private String airlinesAssociated;
	private int maxPassanger;
	
	public Flights(){
		
	}
	
	public Flights(int flightId, String airlinesAssociated, int maxPassanger) {
		super();
		this.flightId = flightId;
		this.airlinesAssociated = airlinesAssociated;
		this.maxPassanger = maxPassanger;
		
	}
   
	

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getAirlinesAssociated() {
		return airlinesAssociated;
	}

	public void setAirlinesAssociated(String airlinesAssociated) {
		this.airlinesAssociated = airlinesAssociated;
	}

	public int getMaxPassanger() {
		return maxPassanger;
	}

	public void setMaxPassanger(int maxPassanger) {
		this.maxPassanger = maxPassanger;
	}

	@Override
	public String toString() {
		return "Flights [flightId=" + flightId + ", airlinesAssociated=" + airlinesAssociated + ", maxPassanger=" + maxPassanger + "]";
	}
	
}

