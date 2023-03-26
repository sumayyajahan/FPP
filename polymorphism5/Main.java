package polymorphism5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Pet> pets = new ArrayList<Pet>();
		
		loop:while(true) {
			System.out.println("Pet name: ");
			String petName = sc.next();
			
			if(petName.equals("STOP")) {
				break loop;
			}
			
			System.out.println("Please pet type");
			String petType = sc.next();
			if(petType.toLowerCase().charAt(0)=='c') {
			Cat cat = new Cat(petName);
		    pets.add(cat);
			}else if(petType.toLowerCase().charAt(0)=='d') {
				Dog dog = new Dog(petName);
				pets.add(dog);
			}
		}
		sc.close();
		System.out.println(pets.toString());
		for(Pet pet:pets) {
			System.out.println("Name: "+ pet.getName());
			System.out.println("Type: "+ pet.getClass());
		}

	}
	class Pet{
		
		private String name;
		
		Pet(String name){
		  this.name=name;
		}
		public String getName() {
			return name;
		}
		private void setName(String name) {
			this.name=name;
		}
		
	}
	class Cat extends Pet{

		Cat(String name) {
			super(name);
			
		}
		
	}
	class Dog extends Pet{

		Dog(String name) {
			super(name);
			
		}
		
	}

}
