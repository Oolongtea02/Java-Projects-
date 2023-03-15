// by Samuel Zhang
public class Teacher {
   private String name;
   private int employeeID;
   private double salary;
   
   //constructor
   public Teacher() {
	   //todo
	   this.name = "";
	   this.employeeID = 0;
	   this.salary = 0.0;
	   
	   
   }
   
   //constructor
   public Teacher(String n, int id, double sal) {
	   //todo
	   name = n;
	   employeeID = id;
	   salary = sal;
	   
   }
   
   public String getName()  {
	return name;
	   //todo}
   }
   public int getID()       {
	return employeeID;
	   //todo}
   }
   public double getSalary()  {
	return salary;
	   //todo}
   }
   
   public void setName(String n) {
    //todo}
	  name = n;
	  
   }
   public void setID(int id) {
	   //todo}
	   employeeID = id;
   }
   public void setSalary(double sal) {
	   //todo}
	   salary = sal;
   }
   
   //raise the salary by x%
   public void raiseSalaryByPercent(double x) {
	   //todo
	  salary += salary * (x/100.0f);
   }
   
   //return a string with format: 
   //      name:ID:salary
   public String toString()  {
	 //todo
	   return name + ":" + employeeID + ":" + salary;
	  
   } 
}
