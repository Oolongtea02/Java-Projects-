// by Samuel Zhang
import java.util.Arrays;

public class Student {
	private String name;
	private int studentID;
	private double[] grades;  //an array with five elements: contain GPA  
	                  //for five courses in a year.
	   
	//default constructor
	public Student() {
	   this.name="";
	   this.studentID=0;
	   this.grades=new double[5];
	   
	}
	
	//constructor
	//set name and id, and array grades is initialized.
	public Student(String n, int id) {
		//todo
		name = n;
		studentID = id;
		grades = new double[5];
	  
	}
		   
	public String getName()  {
		//todo 
		return this.name;
		
	}
	public int getID()       {
		//todo	
		return studentID;
	}
	
	//return the grade with index=i 
	public double getGrade(int i) {
		//todo}
		return grades[i];
	}
	
	//get the average gpa for all 5 classes
	//print a warning message if it is lower than 3.0
	public double getAvgGPA() {
		double sum = 0.0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		double avg = sum / grades.length;
		if (avg < 3.0) {
			System.out.println("Warning, your gpa is below 3.0");
		}
		return avg; 
		//todo
	}
	
	//return how many classes have gpa < 3.0
	public int numOfFailedClass() {
		int x = 0;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < 3.0) {
				x += 1;
			} 
		}
		return x;
		
		//todo
	}
		   
	public void setName(String n) {//todo
		name = n;
		
	}
	public void setID(int id)     {//todo
		studentID = id;
	}
	
	//set the grade with index=i as g
	public void setGrade(int i, double g) {
		//todo
		grades[i] = g;
		
	}
	
	//set all 5 classes' grades as g1,g2,g3,g4,g5
	public void setGrades(double g1, double g2, double g3, 
			             double g4, double g5)  {
		
		//todo
		 grades[0] = g1;
		 grades[1] = g2;
		 grades[2] = g3;
		 grades[3] = g4;
		 grades[4] = g5;
		
	}
	
	//return a string like: name:ID:[3.0,4.0, 3.2, 3.8, 4.0]
	//Please use Arrays.toString(array_name)
	public String toString()  {
		return name + ":" + studentID + ":" + Arrays.toString(grades);
		//todo
	} 
}
