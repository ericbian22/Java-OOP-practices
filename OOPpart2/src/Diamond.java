
public class Diamond implements Comparable<Diamond>{
	
	
	//Variable declaration
	private static String diamond1 ;
	private static  String diamond2;
	private String stockNumber;
	  private double carat;    
	  private String clarity;  
	  private char color;     
	  private String cut;    

	  String getStock()   { return stockNumber; }
	  double getCarat()   { return carat; }
	  String getClarity() { return clarity; }
	  char   getColor()   { return color; }
	  String getCut()     { return cut; }
	  
	  public Diamond( String Stock, double Carat, String Clarity, char Color, String Cut )
	  {
		
	    stockNumber = Stock;  carat = Carat; clarity = Clarity; color = Color; cut = Cut;  
	  }
	  
	  public String toString(){
		  //convert to string
		  return this.carat + " " + this.clarity + " " + this.color + " " + this.cut; 
		  
	  }
	  
	  public int compareTo( Diamond other ) {
	//compare the diamonds 
		  String diamond1 = ("" + this.color);
		  String diamond2 = ("" + other.color);
		
		  if(this.toString().compareTo(other.toString())==0) {
			  if(this.clarity.compareTo(other.clarity)==0) {
					if(this.diamond1.compareTo(other.diamond2)==0) {
						return 0;
					}else if(this.diamond1.compareTo(other.diamond2)==1) {
						return  this.diamond1.compareTo(other.diamond2);
					}else if(this.diamond1.compareTo(other.diamond2)==-1) {
						return this.diamond1.compareTo(other.diamond2);
					}
				}else if(this.clarity.compareTo(other.clarity)==1) {
					return this.clarity.compareTo(other.clarity);
				}else if(this.clarity.compareTo(other.clarity)==-1) {
					return this.clarity.compareTo(other.clarity);
				}
			}else if(this.toString().compareTo(other.toString())==1) {
				return this.toString().compareTo(other.toString());
			}else if(this.toString().compareTo(other.toString())==-1) {
				return this.toString().compareTo(other.toString());
			}
				return 0;
	}
}


