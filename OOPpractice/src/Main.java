import java.util.Scanner;
public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		 int Gooseberry=12;
		 int CrabApple=8;
		 int Rhubarb=16;
		 int userpick;
		
		Jam jam=new Jam(Gooseberry,CrabApple,Rhubarb);
		System.out.println("Enter your selection (1, 2, or 3):");
		userpick=input.nextInt();
		if(userpick==1) {
		Gooseberry=jam.pickGooseberry();
		
;		}else if(userpick==2) {
			jam.pickCrabApple();
		}else if(userpick==3) {
			jam.pickRhubarb();
		}
		System.out.println("Gooseberry "+ Gooseberry );
		System.out.println("CrabApple "+ CrabApple );
		System.out.println("Rhubarb "+ Rhubarb);
//	   int testing=jam.CrabApple;
//	   System.out.println(testing);
	}


}
