
public class CalculateGrade {
	private int quizOneScore;
    private int quizTwo;
    private int quizThree;
    private int midTerm;
    private int finalExam;
   
    public CalculateGrade(int quizOneScore,int quizTwo,int quizThree,int midTerm,int finalExam){
    	this.quizOneScore=quizOneScore;
    	this.quizTwo=quizTwo;
    	this.quizThree=quizThree;
    	this.midTerm=midTerm;
    	this.finalExam=finalExam;
    }
    
    private double getQuizPercentage() {
    	int total = quizOneScore + quizTwo + quizThree;
    	return (((double)total / 30) * 100)/4 ;
    }
    
    private double getMidTermPercentage() {
    	return ((double)midTerm * 35) / 100;
    }
    
    private double getFinalExamPercentage() {
    	return ((double)finalExam * 40) / 100;
    }
    
    public void display() {
    	int totalScore = (int)(getQuizPercentage() + getMidTermPercentage() +  getFinalExamPercentage());
    	String grade = "F";
    	if(totalScore >= 90) {
    		grade = "A";
    	} else if(totalScore >= 80) {
    		grade = "B";
    	} else if(totalScore >= 70) {
    		grade = "C";
    	} else if(totalScore >= 60) {
    		grade = "D";
    	}
    	
    	System.out.println("Quiz 1: " + quizOneScore);
    	System.out.println("Quiz 2: " + quizTwo);
    	System.out.println("Quiz 3: " + quizThree);
    	System.out.println("Mid Term score: " + midTerm);
    	System.out.println("Final exam : " + finalExam);
    	System.out.println("");
    	System.out.println("Quiz percentage: " + (int) getQuizPercentage());
    	System.out.println("Mid Term: percentage" + getMidTermPercentage());
    	System.out.println("Mid Term percentage: " + getFinalExamPercentage());
    	System.out.println("Total Score: " + totalScore);
    	System.out.println("Grade : " + grade);
    }
}
