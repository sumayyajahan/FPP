package polymorphisimNum4;

public class Employee {
	
	private int id;
	private String name;
	private String department;
	public double salary;
	private String designation;
	public double bonus;
	public double defaultBonus=200;
	
//	Employee(){
//		
//	}
	
	Employee(int id,String name,String department,double salary,String designation){
	  this.id=id;
	  this.name=name;
	  this.department=department;
	  this.salary=salary;
	  this.designation=designation;
	}
	private void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	private void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	private void setDepartment(String department) {
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}
	private void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
//	private void setBonus(double bonus) {
//		this.bonus=bonus;
//	}
//	public double getBonus() {
//		return bonus;
//	}
	private void setDesignation() {
		this.designation=designation;
	}
	public String getDesignation() {
		return designation;
	}
	
//	@Override
//	public boolean equals(Object e) {
//		if(this.designation.equals(e)) {
//			
//			return true;
//		}
//		return false;
//	}
	public double addBonus(double bonus) {
		return this.bonus+salary+defaultBonus;
	 
	}
	
	@Override
	public boolean equals(Object otherObject)
	{
	  if(otherObject == null)
	    return false;
	  else if(getClass( ) != otherObject.getClass( ))
	    return false;
	  else
	  {
	    Employee otherEmployee = (Employee) otherObject;
	    return (designation.equals(otherEmployee.designation));
	  }
	}
	
	
	
	
	
	public void display() {
		
		
		
		
		System.out.println("Employee Id: " + id);
		System.out.println("Employee Id: " + name);
		System.out.println("Employee Id: " + department);
		System.out.println("Employee Id: " + salary);
		System.out.println("Employee Id: " + designation);
	}
	

}
