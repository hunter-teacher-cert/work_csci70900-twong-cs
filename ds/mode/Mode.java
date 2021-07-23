//Michele P., Alex, and Tiffany

import java.io.*;
import java.util.*;



public class Mode{
  private ArrayList<Integer> inputData;
  private Random r;


  public Mode(){ //constructor one
    r = new Random();
    inputData = new ArrayList<Integer>();

    for (int i=0; i < 20; i++){
      inputData.add(r.nextInt(20));
    }
  }

  public Mode(int size){ //constructor 2
    r = new Random();
    inputData = new ArrayList<Integer>();

    for (int i=0; i < size; i++){
      inputData.add(r.nextInt(50));
    }
  }

  //new constructor for purpose of calcMode()
  /*
  public Mode(int size, int dummyPlaceholder){
  r = new Random();
  inputData = new ArrayList<Integer>();

  for (int i=0; i < 20; i++){
  inputData.add(i);
}
}
*/

/**
* Warmup 1

Find and return the smallest value in  InputData.
*/

public int findSmallestValue(){

  int smallest=inputData.get(0); //assign initial value of smallest to first value

  //syntax for array: myArray[3] vs. syntax for ArrayList: inputData.get(3);

  for(int i=1;i<inputData.size();i++) //loop through ArrayList from item 1 to the length of the ArrayList
  {
    if (inputData.get(i)<smallest) //compare ith item in ArrayList with "smallest"
    smallest=inputData.get(i); //smallest reassigned in value if ith value is smaller

  }

  return smallest;

}

/**
* Warmup 2

Returns the frequency of value in inputData, that is, how often value appears
*/
//5,3,8,2,5,9,12,5,12,6,5,
//  myArrayList.frequency(5);
public int frequency(int value){
  int counter = 0;
  for (int i = 0; i<inputData.size(); i++){
    if (inputData.get(i) == value)
    counter++;
  }


  return counter;
}

/**
*
This function should calculate and return the mode of inputData.
The mode is the value that appears most frequently so if inputData contained
5,3,8,2,5,9,12,5,12,6,5, the mode would return 5 since 5 appears four times.

If there are multiple modes such as in the case with this data set: 5,5,2,9,9,6 you should return
either of them (the 5 or the 9).

Note: you will probably use the frequency function you wrote in
this solution but not findSmallestValue. the findSmallestValue
function will help you find a strategy for approaching finding the mode.
*/

//This should work - Do we want to white board to determine how to optimize?
public int calcMode(){ //create integer method called calcMode
  int mode = inputData.get(0); //assuming ArrayList is not empty;  set integer variable mode to first index in ArrayList - This stores the value
  int freqMode = frequency(mode);//freqMode (greatest frequency) is initially set to the frequency of the 0th element - This stores the frequency
  /*
  Sample:

  Values:    0  1  3  13  2  3  1  14
  Indices:   0  1  2  3   4  5  6   7
  frequency(inputData.get(0))=> 1
  frequency(inputData.get(1))=> 2
  frequency(inputData.get(3))=> 2
  frequency(inputData.get(4))=> 1
  frequency(inputData.get(5))=> 2
  frequency(inputData.get(6))=> 2
  frequency(inputData.get(7))=> 1
  */

  int currentCount;//currentCount is the frequency of the current element. - This stores the currrent frequency

  /*ArrayList helperArrayList=new ArrayList<Integer>(inputData.size());

  for (int i=0;i<helperArrayList.size();i++)
  {
    //set the arrayList values to correspond to the indices; set to -1 because 0 is a valid value
    helperArrayList.set(i)=-1;

  }

  0 0 0 0 0 0
  0 1 2 3 4 5
  */
  for(int i = 1; i < inputData.size(); i++){//for loop traverses the ArrayList starting with the 1st element (not 0th)

    //check to avoid unnecessary processing

    //if (inputData.get(i)<1)
    currentCount = frequency(inputData.get(i));//Set currentCount to the frequency of the ith element in the ArrayList.
    if (currentCount > freqMode){//Compares frequency of current element to freqMode
      //if frequency of current element is greater than freqMode, then:
      mode = inputData.get(i);//Set the mode (value to be returned) to the value at the current index, which we now know has the highest frequency.
      freqMode = currentCount;//Set the new value of freqMode (highest frequency) to the value of currentCount (currentFrequency)
    }
    /*
    Loop #1:  i=1    currentCount= 2



    */



  }

  return mode;
}

public String toString(){
  return ""+inputData;
}
}

/*

*/
