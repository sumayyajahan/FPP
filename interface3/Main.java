package interface3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student(1, "Khan");
		Student st2 = new Student(2, "Chowdhury");
		Student st3 = new Student(3, "Kawser");
		Student st4 = new Student(4, "Bongsho");
		Student st5 = new Student(5, "Kihiii");
		
		ArrayList<Student> students = new ArrayList();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
		
		Collections.sort(students, new StudentComparator());
		for(Student student:students) {
			System.out.println(student.getId() +" "+ student.getStudentLastName());
			
		}
		
		System.out.println(" ");
		
		Collections.sort(students, new StudentNameComparator());
		for(Student student:students) {
			System.out.println(student.getId() +" "+ student.getStudentLastName());
			
		}
		
		
		
	}

}
