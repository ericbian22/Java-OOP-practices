

public class Employee implements Comparable<Employee> {

	//Variable declaration
	private String firstName;
	  private String lastName;
	  private int Year;

	  //Use the main class to create the object
	  public Employee( String firstName, String lastName, int Year ){
		  this.firstName = firstName;
		  this.lastName =lastName;
		  this.Year = Year;
	 }
	  int Year()  { 
	  return Year; 
	}
	  String LastName()   { 
		   return lastName; 
		 }
	  String FirstName()  {
	   return firstName; 
	  }
	  public String toString(){ 
		  return this.LastName() + "   " + this.FirstName() + "   " + this.Year();
		  
		  
	  }
	  

	  public int compareTo( Employee other ) { 
		  return this.toString().toLowerCase().compareTo(other.toString().toLowerCase());		  
	 }

	
	
	
}

