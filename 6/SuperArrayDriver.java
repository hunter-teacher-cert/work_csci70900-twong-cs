//eric, tiffany, daiana
import java.io.*;
import java.util.*;

public class SuperArrayDriver
{
  public static void main( String[] args )
  {

    System.out.println("Testing default constructor.");
    SuperArray sa = new SuperArray();
    System.out.println("Testing empty print:");
    System.out.println(sa);
    System.out.println("Testing isEmpty (should be true)");
    System.out.println(sa.isEmpty());
    
	sa.printData();
	System.out.println(sa.getNumberElements());
	
    // -----------------------------------------------------------
    // YOUR HOMEGROWN/HOUSEMADE/ROLL-YOUR-OWN TEST METHODS HERE...
    // -----------------------------------------------------------
    //precondition: newly-instantiated SuperArray of default capacity

    
    System.out.println("Testing overfill (calling grow() in add)");
    for (int i=0; i<15; i++) { //i<15 before
      sa.add(i,i);
    }//for i
    //System.out.println(sa);
	
	/*
	sa.printData();
	System.out.println(sa.getNumberElements());
    System.out.println(sa.isEmpty());
	
    
	
    System.out.println("\nTesting add at index 5, 0 and 17(end)");
    sa.add(5, 100);
    System.out.println(sa);
    sa.add(0, 100);
    System.out.println(sa);
    sa.add(17, 100);
    System.out.println(sa);
	
	sa.printData();
	System.out.println(sa.getNumberElements());
    
    System.out.println("\nTesting remove at 0, 5, and 15 (end)");
    sa.remove(0);
	
	sa.printData();
	System.out.println(sa.getNumberElements());
	
	
    System.out.println(sa);
    sa.remove(5);
	
	sa.printData();
	System.out.println(sa.getNumberElements());

    System.out.println(sa);
    sa.remove(15);
	
	sa.printData();
	System.out.println(sa.getNumberElements());
	
    System.out.println(sa);
	*/
	System.out.println(sa.toString());
	
    

  }//main

}//class SuperArrayDriver