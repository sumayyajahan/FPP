package polymorphism6;

public class Electronic extends Assets{

	private String model;
	private String brand;
	
	public Electronic(int serialNumber, String category, String name, double price, String condition) {
		super(serialNumber, category, name, price, condition);
		
	}

}
