package interface1;

import java.util.Comparator;

public class City {
	
	private String cityName;
	private double temperature;
	
	public City(String cityName, double temperature) {
		this.cityName=cityName;
		this.temperature=temperature;
		
	}
	public void setCityName(String cityName) {
		this.cityName=cityName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setTemperature(double temperature) {
		this.temperature=temperature;
	}
	public double getTemperature() {
		return temperature;
	}
	
	
	

}
