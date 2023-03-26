package polymorphismFile2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Pet> pets = new ArrayList<>(); 
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter pet's name: or STOP to exit ");
			String petName = sc.next();
			if(petName.equalsIgnoreCase("STOP")) {
				break;
			}
			System.out.println("If pet is cat enter c, if pet is dog enter d ");
			String petType = sc.next();
			
			if(petType.equals("c")){
				Cat cat = new Cat(petName);
				pets.add(cat);
			}else if(petType.equals("d")){
				Dog dog = new Dog(petName);
				pets.add(dog);
			}
			

		}
		
		for(Pet pet:pets) {
			System.out.println("Pet's Type: "+ pet.getName() + "  Pet's Type: " + pet.getClass());
		}
		

	}

}
