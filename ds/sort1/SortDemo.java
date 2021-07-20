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
        //use get method on ArrayList data to retrieve value at that lowerIndex
        //conditional compares every item to its next
        smallIndex = smallIndex;
        //if current item is less in value, value at smallIndex is in correct place
      }
      else{
        smallIndex = i;
        //if current item is greater in value, smallIndex gets next index as value
      }
    }
    return smallIndex;
    //if repeats of smallest number occur, will return last instance of smallest number
  }// end of findSmallestIndex

  // define get() method for instances of SortDemo
  //SortDemo.get(x) should get value of data at index x
  public int get(int index) {
    return this.data.get(index);
  } //end get

  //method to sort
  public void sort(){
    int smallestIndex;
    for (int i = 0; i < data.size(); i++){
      smallestIndex = findSmallestIndex(i);
      //find smallest index from current value of i to end of list
      int valSmallIndex = data.get(smallestIndex);
      //valSmallIndex gets value at smallestIndex
      data.set(smallestIndex, data.get(i));
      data.set(i, valSmallIndex);
      // swap the item at that index and i
    } //end for loop
  } //end sort


  // linear search for value in data
  public int linearSearch(int value){
    // loop through the ArrayList data
    for (int i = 0; i < data.size(); i++){
      if(data.get(i) == value) {
        return i; //returns index of first instance of value found
      }
    }
    return -1; // returns -1 if value is not found
  }

  // binary search for value in data
  public int binarySearch(int value){

    int lowerIndex = 0;
    int upperIndex = data.size() - 1;
    int middleIndex = data.size()/2; //rounds down if odd number of elements
    boolean loop = lowerIndex < upperIndex;
    /* if upper crosses lower it's not there and the loop should exit the loop
    and if the item is at middle you should exit the loop

    */
    while (loop) {

      System.out.println("middleIndex is " + middleIndex);
      System.out.println("upperIndex is " + upperIndex);
      System.out.println("lowerIndex is " + lowerIndex);
      // remember if value is less than data.get(middleIndex) you want to search next time
      if(value < data.get(middleIndex)){
        upperIndex = middleIndex;
      }

      if(value > data.get(middleIndex)){
        lowerIndex = middleIndex;
      }

      if(value == data.get(middleIndex)){
        System.out.println("found");
        return middleIndex;
      }

      // from lower to the middle and otherwise from the middle to the upper.
      //
      // then update middleIndex based on new lowerIndex and upperIndex.
      middleIndex = (lowerIndex + upperIndex)/2;
      loop = lowerIndex < upperIndex;
      //upper and lower index will never cross bc middleIndex will always be the floor of avg
    } //end while loop

    /* replace this return to either return the value if it was found and -1
    if upperIndex and lowerIndex crossed
    */
    System.out.println("not found");
    return -1; // replace this return
  } //end binarySearch


  public String toString(){
    return ""+data;
  }
  /*------------------------- MERGESORT STUFF -----------------*/


  // Preconditions: a and b are ArrayLists of Integers and
  //                both are in increasing order
  // Return: a new ArrayList of Integers that is the result
  //         of merging a and b. The new ArrayList
  //         should be in increasing order
  private ArrayList<Integer> mergeSort (ArrayList<Integer> a){
    if (a.size() <= 1) { //base case
      return a;
    } //end base case

    int lo = 0;
    int hi = a.size();
    int mid = (lo + hi)/2;

    //get left part of ArrayList
    ArrayList<Integer> left = new ArrayList<Integer>();
    for(int i = 0; i < mid; i++){
      left.add(a.get(i));
    }

    //get right part of ArrayList
    ArrayList<Integer> right = new ArrayList<Integer>();
    for (int i = mid; i < hi; i++){
      right.add(a.get(i));
    }

    ArrayList<Integer> leftSorted = mergeSort(left);
    ArrayList<Integer> rightSorted = mergeSort(right);

    return merge(leftSorted,rightSorted);

  } //end mergeSort

  private ArrayList<Integer> merge(ArrayList<Integer> a,ArrayList<Integer> b){
    ArrayList<Integer> merged = new ArrayList<Integer>();
    int counterA = 0; //pointer var for ArrayList a
    int counterB = 0; //pointer var for ArrayList b
    while (merged.size() != (a.size() + b.size())) {
       if (counterA == a.size()){ //reached end of A so just append stuff from B
         merged.add(b.get(counterB));
         counterB++;
       }else if (counterB == b.size()){ //reached end of B so just append stuff from A
         merged.add(a.get(counterA));
         counterA++;
       }else if ((a.get(counterA)<= b.get(counterB))){ //if number in a is less than number in b
        merged.add(a.get(counterA)); //adding from a
        counterA++;
      }else{
        merged.add(b.get(counterB)); //else, adding from b
        counterB++;
      }
    } //end while loop
    return merged;
  }//end merge


  private ArrayList<Integer> fillForMerge(int size){
    ArrayList<Integer> a = new ArrayList<Integer>();
    int lastVal = r.nextInt(10);
    for (int i = 0 ; i < size ; i=i+1){
      a.add(lastVal);
      lastVal = lastVal + r.nextInt(10);
    }
    return a;

  } //end fillForMerge
  private ArrayList<Integer> fillForMergeSort(int size){
    ArrayList<Integer> a = new ArrayList<Integer>();
    int lastVal = r.nextInt(10);
    for (int i = 0 ; i < size ; i=i+1){
      a.add(lastVal);
      lastVal = r.nextInt(10);
    }
    return a;

  } //end fillForMerge

  public void testMerge(){
    ArrayList<Integer> a = new ArrayList<Integer>();
    ArrayList<Integer> b = new ArrayList<Integer>();
    //a = fillForMerge(17);
    //b = fillForMerge(10);

    //System.out.println(a);
    //System.out.println(b);
    //System.out.println(merge(a,b));

    a = fillForMergeSort(17);
    System.out.println(a);
    System.out.println(mergeSort(a));
  } //end testMerge




}
