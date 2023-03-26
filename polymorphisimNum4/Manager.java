package polymorphisimNum4;

public class Manager extends Employee{

	//double mBonus; 
	
	Manager(int id, String name, String department, double salary, String designation) {
		super(id, name, department, salary, designation);
		
	}
	
//	public double getmBonus() {
//		return mBonus;
//	}
//
//	public void setmBonus(double mBonus) {
//		this.mBonus = mBonus;
//	}

	@Override
	public double addBonus(double bonus) {
		
		return bonus+salary+defaultBonus;
	 
	}

	
	
}
