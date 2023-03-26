package interface3;

public class Student {
   
	private int id;
	private String studentLastName;
	
	
	
	public Student(int id, String studentLastName) {
		
		this.id = id;
		this.studentLastName = studentLastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	
}
