
/*
 * Author:Eric Bian Date 2019-11-25 The program sort the employees by their last name
 */
import java.util.Arrays;

public class EmployeeMain {

	public static void main ( String[] args ){
		
		//Create an object(Array)
		Employee[] employee = new Employee[18];
		
		//Array Declaration
		employee[0] = new Employee( "Eric", "Bian",  2002);
		employee[1] = new Employee( "Luke", "Kim",  2002);
		employee[2] = new Employee("Dvir", "Malka", 2002);
		employee[3] = new Employee("Kyle", "Stammers", 2002);
		employee[4] = new Employee("Cater", "Ruytenbeek", 2002);
		employee[5] = new Employee("Rylan", "Mayor", 2002);
		employee[6] = new Employee("Josh", "Delambert", 2002);
		employee[7] = new Employee("Zuhaib", "Ali", 2002);
		employee[8] = new Employee("Sam", "Yeung", 2002);
		employee[9] = new Employee("Sameer", "Virdi", 2002);
		employee[10] = new Employee("Ray", "Tong", 2004);
		employee[11] = new Employee("Parker", "Kelly", 2002);
		employee[12] = new Employee("Jason", "To", 2000);
		employee[13] = new Employee("Michelle", "Yang", 2002);
		employee[14] = new Employee("Kate", "Young", 2003);
		employee[15] = new Employee("Victoria", "Jeffrey", 2002);
		employee[16] = new Employee("Katia", "Nevodina", 2002);
		employee[17] = new Employee("Muhammad", "Aljabri", 2002);
		    //Sort the array 
		    Arrays.sort(employee);
		    //output the array
		    for ( int i=0; i<employee.length; i++ )
		      System.out.println(employee[i]);
		  }  


	
}
