package polymorphisimNum4;

public class Clerk extends Employee{

	Clerk(int id, String name, String department, double salary, String designation) {
		super(id, name, department, salary, designation);
		
	}
	
	@Override
	public double addBonus(double bonus) {
		return bonus+salary+defaultBonus;
	 
	}


	

}
