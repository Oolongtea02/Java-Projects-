
public class SchoolApp {
  public static void main(String[] args) {
	  Teacher t1 = new Teacher();  
	  t1.setName("Tony");
	  t1.setID(2222);
	  t1.setSalary(2222.50);
	  
	  System.out.println(t1);
	  System.out.println();
	
	  Teacher t2 = new Teacher("Sandy", 1111, 1111.50);
	  t2.setID(3333);
	  t2.raiseSalaryByPercent(11.5);
	  
	  System.out.println(t2.getName());
	  System.out.println(t2.getID());
	  System.out.println(t2.getSalary());
	  System.out.println();
	  
	  Student s1 = new Student();
	  s1.setName("Mike");
	  s1.setID(5555);
	  s1.setGrades(3.0, 4.0, 4.0, 3.0, 4.0);
	  System.out.println(s1.getName());
	  System.out.println(s1.getID());
	  System.out.println(s1.getGrade(2));
	  System.out.println(s1.getAvgGPA());
	  System.out.println(s1.numOfFailedClass());
	  System.out.println();
	  
	  Student s2 = new Student("Tina", 1122);
	  s2.setGrade(1, 4.0);
	  s2.setGrade(2, 2.5);
	  s2.setGrade(3, 2.8);
	  System.out.println(s2.getName());
	  System.out.println(s2.getID());
	  System.out.println(s2.getGrade(2));
	  System.out.println(s2.getAvgGPA());
	  System.out.println(s2.numOfFailedClass());
	  System.out.println();
	  
	  System.out.println(s1);
	  System.out.println(s2);  
  }
}
