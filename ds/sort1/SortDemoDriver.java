//ds/sort1/SortDemoDriver.java
//Collaborators: mlaks23	twong-cs	Skabanakis

import java.io.*;
import java.util.*;

public class SortDemoDriver {
  public static void main(String[] args) {
//default constructor limited to 15
	SortDemo sd = new SortDemo();
	System.out.println(sd);
//constructor with the int
	SortDemo sd2 = new SortDemo(30);
	System.out.println(sd2);

	/* part 2 test lines */
	
	  int i;
	i = sd.findSmallestIndex(0);
  //System.out.println(i);  //check to see if the program returns the index of the smallest number
	System.out.println("sd["+ i + "] = "+sd.get(i)+" : " + sd);
	i = sd2.findSmallestIndex(0);
   //System.out.println(i);
	 System.out.println("sd2["+ i + "] = "+sd2.get(i)+" : " + sd2);
	

	/* part 3 test lines */
	
	  System.out.println(sd);
	  sd.sort();
    System.out.print("Sorted list: ");
	  System.out.println(sd);
	
    }
}
