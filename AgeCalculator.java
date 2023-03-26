
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {
	private int todayDate;
	private int birthDate;
	private double age;

	public int getTodayDate() {
		return todayDate;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public void setTodayDate(int todayDate) {
		this.todayDate = todayDate;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");

	public AgeCalculator(int todayDate, int birthDate) {
	        this.todayDate = todayDate;
	        this.birthDate = birthDate;

	    }
	

	public double calculateAge(int year, int ybirth) {
		LocalDate today = LocalDate.now();
		year = today.getYear();
		LocalDate birthDate = LocalDate.of(1991, Month.MAY, 24);
		ybirth = birthDate.getYear();
		age = year - ybirth;

		return age;
	}

	public static void main(String[] args) {
		AgeCalculator age = new AgeCalculator(2021,1991);
        System.out.println(age.calculateAge(2022,1991)+ " years");
		
		

	}

	
}
