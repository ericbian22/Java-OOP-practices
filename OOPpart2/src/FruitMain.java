/*
 * Author: Eric Bian Date:2019-11-23 The program sort the fruit by its taste 
 */

import java.util.Arrays;

public class FruitMain {
	
	  public static void main ( String[] args ) {
	
		 //Create an object(array)
	    Fruit1[] fruitStand = new Fruit1[10];

	    fruitStand[0] =  new Fruit1( "apple", 3, "plain" );
	    fruitStand[1] =  new Fruit1( "pear",  4, "good" );
	    fruitStand[2] =  new Fruit1( "strawberry", 1, "great" );
	    fruitStand[3] =  new Fruit1( "grape", 1, "great" );
	    fruitStand[4] =  new Fruit1( "orange", 5, "yummy" );
	    fruitStand[5] =  new Fruit1( "quince", 4, "plain" );
	    fruitStand[6] =  new Fruit1( "banana", 3, "yummy" );
	    fruitStand[7] =  new Fruit1( "peach", 4, "good" );
	    fruitStand[8] =  new Fruit1( "watermelon", 3, "yummy" );
	    fruitStand[9] =  new Fruit1( "cantalope", 3, "good" );
	
	    //Sort the array
	    Arrays.sort(fruitStand);
	  
	   for ( int i=0; i<fruitStand.length; i++ )
	      System.out.println( fruitStand[i] );
	  }  
	    
	    
	    
	}
//}

