import java.io.*;
import java.util.*;

public class DLlist{
  private Node front; // the front of the list
  private int length = 0; //create a length variable of 0

  public  DLlist(){
    front = null;
  } //constructor

  public String toString(){
  	Node currentNode, prevNode;
  	currentNode = front;
  	String result = "";
  	while (currentNode != null){
	    result = result + currentNode + " <-> "; //concatenate next node
      prevNode = currentNode.getPrev();
      //System.out.println("currentNode is "+currentNode);
      //System.out.println("prevNode is "+prevNode);
	    currentNode = currentNode.getNext(); //traverse to the next node

    } //end while
  	result = result + "null";
  	return result;
  } //end toString

  public void add(String data){
    Node n = new Node(data); //create new node that stores input
    n.setNext(front); //point it to what front points to
    front = n; //point front back to the new node
    if(n.getNext() != null){ // if n is not the first node
      n.getNext().setPrev(n); //prev of old front is n
    }
    length++; //length increases by 1
  }

  public boolean isEmpty(){
    if (front != null) {
      return false;
    }
    return true;
  } //end isEmpty

  public int length(){
    return length;
  } //end length

  public String get(int index){
    Node currentNode, prevNode; //declare current node and previous node
    currentNode = front; //initialize it to the front node

    int counter = 0;
    String item = ""; //initialize an item variable

    if (index > this.length()-1) { //if index is greater than length...
      return "index not valid"; //...return null
    }

    while (currentNode != null){
      if (counter == index) {
        item = currentNode.toString();
      }//end if
      counter++; //increment counter
      currentNode = currentNode.getNext(); //traverse to the next node
    }//end while
     return item;
  }//end get

  public void set(int index, String value){
    Node currentNode; //declare current node
    currentNode = front; //initialize it to the front node
    int counter = 0;

    if (index > this.length()-1) { //if index is greater than length...
      System.out.println(index + "out of bounds. Choose an index within the linked list.");
      return;
    }

    while (currentNode != null){
      if (counter == index) {
        currentNode.setData(value); //use setData to update the index value
        break;
      }//end if
      counter++; //increment counter
      currentNode = currentNode.getNext(); //traverse to the next node
    }//end while
  }//end set

  //inserts item before index
  //cannot insert if index provided is greater than length
  public void insert(int index, String value){
    Node n = new Node(value);  //make the new node
    if (index > this.length()) { //if index is greater than length...
      System.out.println("Cannot insert " + value + " at " + index);
      return; //...return null
    }
    //System.out.println("index is " + index);

    Node currentNode; //declare current node
    currentNode = front; //initialize currentNode to the front node
    int counter = 0;

    if(index == 0){ //if inserting at beginning
      this.add(value);
    }

   while (currentNode != null){
     if (counter == index - 1) { //inserts before the index
        if(currentNode.getPrev() != null){ //if there are previous nodes to point to...
          n.setPrev(currentNode.getPrev());
          //System.out.println("prev of n is: "+n.getPrev());
        }
        n.setNext(currentNode.getNext());//sets new value to point to what current node points to
        //System.out.println("next of n is: "+n.getNext());
        currentNode.setNext(n); //sets previous node to point to new node
        length++; //increment length variable
        break;
      }//end if
      counter++; //increment counter
      //System.out.println("counter is: " + counter);

      currentNode = currentNode.getNext(); //traverse to the next node
    }//end while
  }// end of insert

  public int search(String key){
    int index = 0; //initialize index to -1
    Node currentNode; //declare current node
    currentNode = front; //initialize it to the front node
    while (currentNode != null){
     if (currentNode.getData() == key) { //if we find the key value...
       return index; //return the index
      }//end if
      index++; //increment index
      currentNode = currentNode.getNext(); //traverse to the next node
    }//end while
    return index = -1;
  }//end search


  public void remove(int index){
    System.out.println("trying to remove at index: " + index);
    if (index > this.length()-1) { //if index is greater than length...
      System.out.println("Index " + index + " out of bounds. Choose an index within the linked list.");
      return; //...return null
    }//end if

    Node currentNode; //declare current node
    currentNode = front; //initialize it to the front node
    int counter = 0; //points to index of currentNode

    //Remove the front node
    if (index == 0){
      front = currentNode.getNext(); //set the new front node
      length--; //decrement length variable
      //System.out.println("removing the front");
    }

    while (currentNode != null){
      if(counter == index - 1){
        //currentNode.setPrev(currentNode.getPrev().getPrev());
        currentNode.setNext(currentNode.getNext().getNext());
        length--; //decrement length variable
        return;
      }//end if
      counter++; //increment counter
      currentNode = currentNode.getNext(); //traverse to the next node
    }//end while
  }//end remove

} //end class
