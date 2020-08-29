
public class Fruit1 implements Comparable<Fruit1>{

		  //Variable Declaration
		  private String name;
		  private int weight;
		  private String taste;
		
		
		  //use the information from main class
		
		  public Fruit1( String name, int weight, String Taste ){
			  	this.name = name;
			  	this.weight = weight;
			  	this.taste = Taste;
		  } 
		  public int tastetoString(String Taste) {
			  int t=0;
			  	if(Taste=="plain") {
			  		t=4;
			  	}else if(Taste=="good") {
			  		t=3;
			 	}else if(Taste=="yummy") {
			  		t=2;
			 	}else if(Taste=="great") {
			  		t=1;
			  		}	
		    return t;
		  }
		  public String toString(){
		    return taste + "\t" + name + "\t" + weight + "oz";
		  }
		 //convert to string
		
		  public int compareTo( Fruit1 other )  {
			//Comparison
		int taste1=tastetoString(this.taste);
		int taste2=tastetoString(other.taste);
		int difference=taste2-taste1;
		if(difference>0) {
			return 1;
		}else if(difference<0) {
			return -1;
		}
		return 0;
			  } 
			}
		
