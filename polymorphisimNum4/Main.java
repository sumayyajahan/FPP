package polymorphisimNum4;

public class Main {

	public static void main(String[] args) {
		
		//Employee emp = new Employee();
		Manager mg = new Manager(1, "Sumayya", "CSE", 20000, "Manager");
		System.out.println(mg.addBonus(200));
		Clerk ck = new Clerk(2, "Rahim", "4th emplpoyee", 1500, "Clerk");
		mg.display();
		System.out.println("Salary with bonus " + mg.addBonus(200));
		System.out.println(mg.equals(mg));
		
		System.out.println();
		ck.display();
		System.out.println("Salary with bonus " + ck.addBonus(200));
		
		System.out.println(ck.equals(ck));
		
		
		
//		if(mg.equals(mg.getDesignation())) {
//			System.out.println(mg.addBonus(200));
//		}else if(ck.equals(ck.getDesignation())) {
//			System.out.println(ck.addBonus(200));
//		}
//		
//		if(mg.getDesignation().equals(mg)) {
//			System.out.println(mg.addBonus(200));
//		}
		
		
		
		
	    
	}

}
