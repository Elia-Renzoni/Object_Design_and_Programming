package monitoring;

public class TrafficUpdate {
	private String cityArea;
	private String trafficState;
	private int timeStamp;
	
	public TrafficUpdate(final String cityArea, final String state) {
		this.cityArea = cityArea;
		this.trafficState = state;
		this.timeStamp = 10;
	}
	
	public void updateAttributes(String cityArea, String state) {
		this.cityArea = cityArea;
		this.trafficState = state;
	}
	
	public int getTimeStamp() {
		return this.timeStamp;
	}
	
	public String getCityArea() {
		return this.cityArea;
	}
	
	public String getTrafficState() {
		return this.trafficState;
	}
}
