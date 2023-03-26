package numberTwo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class CalAge {
	
	//private int date_of_birth;
	private double age;
	private int birthDay;
	private int today;
	
	public double calculateAge(int year, int bYear) {
		LocalDate today = LocalDate.now();
		year=today.getYear();
		LocalDate birthDate = LocalDate.of(1988, Month.NOVEMBER, 3);
		bYear = birthDate.getYear();
		age = year-bYear;
		return age;
	}
	CalAge(int birthDay, int today){
		this.birthDay=birthDay;
		this.today=today;
	}
	public void setToday() {
		
	}
	
//	public LocalDate setDateOfBirth() {
//		Scanner sc = new Scanner(System.in);
//		//Localdate birthday;
//	}

}
