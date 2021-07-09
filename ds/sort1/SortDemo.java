//ds/sort1/SortDemoDriver.java
//Collaborators: mlaks23	twong-cs	Skabanakis

import java.io.*;
import java.util.*;

/*
Setup:
 1.Make a folder under your work repo named: ds
 2. Make another folder under that named sort1
 3. Copy this file and SortDemoDriver.java into the ds/sort1 folder

Lab:
Part 1:
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortDemoDriver.java and SortDemo.java) and confirm
   the behavior of the constructors.
Part 2:
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortDemoDriver to test.
Part 3:
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortDemoDriver to test.
*/

public class SortDemo{

    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    private Random r;

    //default
    public SortDemo(){
	  data = new ArrayList<Integer>();
	  r = new Random();
  	for (int i=0;i<15;i++){ //default size of list is 15
	    data.add(r.nextInt(20)); //picks random num from 0-19
	}

    }
    //constructor with parameter the size will vary depending on user or programmer choice
    public SortDemo(int size){
	  data = new ArrayList<Integer>();
	  r = new Random();
	  for (int i=0;i<size;i++){
	    data.add(r.nextInt(20)); //picks random num from 0-19
	}

    }

    /*
      return the index of the ArrayList data from index start to the end
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it woudl return 3 which is the index of the value
      6 which is the index with the smallest value from start to end
    */
    //this method is finding the smallest index based on the parameter index number that we provoid. It will include that index #  and go to the right. It will NOT include any values prior to that index number. 
    public int findSmallestIndex(int start){
	    int smallIndex = start;
      // start a variable at the one after start
	   

	    // loop from that variable to end and update smallIndex as needed
      for (int i = start+1; i < data.size(); i++){
        if (data.get(smallIndex) < data.get(i)) {
          smallIndex = smallIndex;
        }
        else{
          smallIndex = i;
        }
      }
  
	    return smallIndex;
      //if repeats of smallest number occur, will return last instance of smallest number

    }// end of findSmallestIndex

  public int get(int index) {
    // define get()
    return this.data.get(index);
  }

  public void sort(){
  	int smallestIndex;
    
	  for (int j=0;j < data.size()-1; j++){
	    // find the smallet index from i to end
	    // your code here
      smallestIndex = findSmallestIndex(j);
      int valSmallIndex = data.get(smallestIndex);
      data.set(smallestIndex, data.get(j));
      data.set(j, valSmallIndex);
	    // swap the item at that index and i
	    // your code here
      
      }

  }


    /* If you finish the lab early you can get started on this */
    public int linearSearch(int value){
	// loop through the ArrayList data
	// and if the value you're searchign for is in the ArrayList, return it.
	// return -1 if it isn't there.


	return 0; // replace this return
    }

    /* If you finish the lab early you can get started on this */
    public int binarySearch(int value){
	boolean replacethiswithrealexpression=false;
	int lowerIndex = 0;
	int upperIndex = data.size();
	int middleIndex = data.size()/2;

	/* if upper crosses lower it's not there and the lop should exit the loop
	   and if the item is at middle you should exit the loop

           you have to replace the "replacethiswithrealexpression" boolean
           with a correct expression based on lowerIndex and upperIndex
	*/
	while (replacethiswithrealexpression)
	    {
		// update lower and upper.
		// remember if value is less than data.get(middleIndex) you want to search next time
		// from lower to the middle and otherwise from the middle to the upper.
		//
		// then update middleIndex based on new lowerIndex and upperIndex.

	    }

	/* replace this return to either return the value if it was found and -1
	   if upperIndex and lowerIndex crossed
	*/

	return 0; // replace this return
    }


    public String toString(){
	return ""+data;
    };

}