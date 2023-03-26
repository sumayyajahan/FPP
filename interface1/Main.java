package interface1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		City city1 = new City("FairFiled", 22);
		City city2 = new City("Iowa", 12);
		ArrayList<City> listCity = new ArrayList();
		listCity.add(city1);
		listCity.add(city2);
		
		boolean found = false;
		for(int i=0; i<listCity.size(); i++) {
			if(listCity.get(i).getCityName().equals(city1.getCityName())) {
				found = true;
			}
		}
		
//		for(City city:listCity) {
//		  System.out.println(city.getCityName());	
//		}
		Collections.sort(listCity, new CityComparator());
		for(City city:listCity) {
			System.out.println(city.getCityName());
			System.out.println(city.getTemperature());
		}
		
	}

}
