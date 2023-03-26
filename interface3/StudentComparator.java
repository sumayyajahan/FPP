package interface3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public final int compare(Student s, Student other) {
		
		if(!(s.getClass().equals(other.getClass()))){
			throw new ClassCastException("The objects don't belong to the same class");
		}else if(s.getId()<other.getId()){
			return -1;
		}else if(s.getId()==other.getId()) {
			return 0;
		}else if(s.getId()>other.getId()) {
			return 1;
		}
		
		return -1;
	}

}
