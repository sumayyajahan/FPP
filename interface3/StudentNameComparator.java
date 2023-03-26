package interface3;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

	@Override
	public final int compare(Student s, Student other) {
		
		if(!(s.getClass().equals(other.getClass()))){
			throw new ClassCastException("The objects don't belong to the same class");
		}else if(s.getStudentLastName().compareTo(other.getStudentLastName())<0){
			return -1;
		}else if(s.getStudentLastName().compareTo(other.getStudentLastName())==0) {
			return 0;
		}else if(s.getStudentLastName().compareTo(other.getStudentLastName())>0) {
			return 1;
		}
		
		return -1;
	}




	
		

		
	


}
