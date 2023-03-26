package interface1;

import java.util.Comparator;

public class CityComparator implements Comparator<City>  {

	@Override
	public int compare(City city1, City city2) {
		
		if (!(city1.getClass().equals(city2.getClass()))) {
			throw new ClassCastException("The objects don't belong to the same class");
			
		}
	else if (city1.getTemperature()< city2.getTemperature() ) {
			return -1;
			
		}
		else if (city1.getTemperature()==city2.getTemperature()) {
			return 0;
		}
		else if (city1.getTemperature()>city2.getTemperature()) {
			return 1;
		}
		
		return -1;
	}

	
	
	
}
