//eric, tiffany, daiana

/**
   lab skeleton
   encapsulation / SuperArray
   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
 **/

import java.io.*;
import java.util.*;

public class SuperArray
{
  //instance vars/attributes
  private int[] data;           //where the actual data is stored
  private int numberElements;   //number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    this.data = new int[size];
    this.numberElements = 0;
  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    this.data = new int[10];
    this.numberElements = 0;
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int i, int value )
  {
    // test to see if we need to grow, then grow
    if(this.numberElements < i || this.numberElements == this.data.length){
	//first condition allows you to insert values at certain index
	//second condition works with loop in Driver
      grow();
    }
    // SIMPLE VERSION DOES NOT AUTO-GROW CAPACITY; INSERT MORE CODE HERE LATER

    // add item
	//this.data[this.numberElements] = value;
    this.data[i] = value;

    // increment numberElements
	 this.numberElements++;

  }//end add()

	public void remove(int i){
		for(int j = i; j < this.data.length - 1; j++) {
			this.data[j] = this.data[j+1];
		}
		this.numberElements--;
	}
	
	//getters - allows access to instance vars outside of class
	public int[] getData(){
		return this.data;
	}
	
	public int getNumberElements(){
		return this.numberElements;
	}
	
	//setters - allows modifying instance vars outside of class
	public void setData(int[] newData) { 
		this.data = newData;
	}
	
	public void setNumberElements(int newNumberElements){
		this.numberElements = newNumberElements;
	}
	
	//printing items of int list data
	public void printData(){
		for(int i = 0; i < this.data.length; i++){
			System.out.print(this.data[i] +" ");
		}
		System.out.println();
	}

  //checks if data is empty
  public boolean isEmpty()
  {
    if(this.numberElements == 0){
      return true;
    } else {
      return false;
    }
  }


  public int get(int index) //get(5) should return the number at data[5]
  {
    int x = this.data[index];
	return x;
  }


  public String toString()
  {
	String output = "[";
	for(int i = 0; i < this.numberElements; i++){
		output = output + String.format("%02d",this.data[i]);
		if(i < this.numberElements - 1) {
			output = output + ", ";
		}
	}
	output = output + "]";
	
    return output;
  }//end toString()


  //helper method for debugging/development phase
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  private void grow()
  {
    // create a new array with extra space
    int[] newData = new int[this.data.length + 20];

    // Q: How did you decide how much to increase capacity by?
    // A: Increasing by arbitrary number 10

    // copy over all the elements from the old array to the new one
    for(int i = 0; i < this.data.length; i++){
      newData[i] = this.data[i]; //space where it goes <-- value we want to assign;
    }
    
    // point data to the new array
    this.data = newData;

    // Q: How does this look when illustrated using encapsulation diagram?
    //A: an empty array is created, information is copied over one by one, and then the old array is aliased to the new array, thus growing it
    /* A: this.data now makes reference to the new object created/instantiated by newData*/
  }//end grow()

}//end class