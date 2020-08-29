import java.util.Scanner;
public class Jam {
	Scanner input=new Scanner(System.in);
 public int Gooseberry;   //if private, then it can only be accessed in this class
public int CrabApple;
public int Rhubarb;
 
 public Jam(int Gooseberry,int CrabApple,int Rhubarb) {
	 this.Gooseberry=Gooseberry;
	 this.CrabApple=CrabApple;
	 this.Rhubarb=Rhubarb;
 }
 public  int pickGooseberry() {
	 int amount;
	 System.out.println("Enter amount to spread");
	 amount=input.nextInt();
	System.out.println("Spreading "+ amount+" fluid ounces of Gooseberry");
	Gooseberry=Gooseberry-amount;
	return Gooseberry;

	
 }
 public void pickCrabApple() {
	 int amount;
	 System.out.println("Enter amount to spread");
	 amount=input.nextInt();
	 this.CrabApple=this.CrabApple-amount;
	 System.out.println("Spreading "+ amount+" fluid ounces of CrabApple");
 }
 public void pickRhubarb() {
	 int amount;
	 System.out.println("Enter amount to spread");
	 amount=input.nextInt();
	 this.Rhubarb=this.Rhubarb-amount;
	 System.out.println("Spreading "+ amount+" fluid ounces Rhubarb");
 }
 
}
