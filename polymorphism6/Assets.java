package polymorphism6;

public class Assets {
   
	private int serialNumber;
	private String category;
	private String name;
	private double price;
	private String condition;
	
	public Assets(int serialNumber, String category, String name, double price, String condition) {
		this.serialNumber = serialNumber;
		this.category = category;
		this.name = name;
		this.price = price;
		this.condition = condition;
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	
	
}
