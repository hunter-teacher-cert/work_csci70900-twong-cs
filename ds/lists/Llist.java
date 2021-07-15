import java.io.*;
import java.util.*;


public class Llist{
  private Node front; // the front of the list

  public  Llist(){
    front = null;
  }

  // Add a new node containing data
  // at the front of the list
  public void addFront(String data){
    // make the new node
    Node n = new Node(data);
    // point it to what front points to
    // point it to what front.getNext() points to or refers to
    n.setNext(front);
    // point front to the new node
    // front gets value of n
    front = n;

    //n.setNext(front.getNext());

    //n.setNext(front);
  }

  public String toString(){
    Node currentNode;
    currentNode = front;
    String result = "";
    while (currentNode != null){
      result = result + currentNode + "\n";
      // this is like i=i+1 is for arrays
      // but for linked lists
      currentNode = currentNode.getNext();
    }
    result = result + "null";
    return result;
  } //end toString

  // returns True if there is nothing in the list
   // False otherwise
   public boolean isEmpty(){
     if (front != null) {
       return false;
     }
     return true;
   }

   // returns the number of items in the list
   // Hint: look at the toString
   // to remind you how to traverse down the list
   public int length(){
     Node currentNode; //declare current node
   	 currentNode = front; //initialize it to the front node
     int counter = 0; //initialize a counter variable

     //Traverse the linked list and count the nodes
     while (currentNode != null){
       counter++;
       currentNode = currentNode.getNext();
      }
     return counter;
   }//end of length

  // returns the item at location index;
  // returns null if there aren't enough
  // items. Starts with index 0
  public String get(int index){
    Node currentNode; //declare current node
    currentNode = front; //initialize it to the front node
    int counter = 0;
    String item = ""; //initialize an item variable


    if (index > this.length()) { //if index is greater than length...
      return null; //...return null
    }

    while (currentNode != null){
      if (counter == index) {
        item = currentNode.toString();
      }//end if
      counter++;
      currentNode = currentNode.getNext();
    }//end while

     return item;
  }//end get

  // sets the item at location index (starting
  // with 0) to value.
  // only sets if the index is within range
  public void set(int index, String value){
    Node currentNode; //declare current node
    Node beforeCurrentNode;
    currentNode = front; //initialize it to the front node
    beforeCurrentNode = front;
    int counter = 0;

    if (index > this.length()) { //if index is greater than length...
      System.out.println("Choose an index within the linked list");
      return;
    }

    while (currentNode != null){
      if (counter == index - 1) {
        beforeCurrentNode = currentNode;
      }
      if (counter == index) {
        Node n = new Node(value);
        n.setNext(currentNode.getNext());//sets new value to point to what current node points to
        beforeCurrentNode.setNext(n);
        break;
      }//end if
      counter++;
      currentNode = currentNode.getNext();
    }//end while

  }

  // insert an item before index.
  // only inserts if the index is within bounds
  // Hint: look at toString for hints on
  // traversal and draw out a diagram.
  // You will need a variable that refers to
  // the node BEFORE you want to do the insertion.
  public void insert(int index, String value){

  }

  // returns the index of the first item with
  // data value key. Returns -1 if not found
  public int search(String key){
    return -1;
  }

  // removes the node at index.
  // does nothing if index out of bounds
  public void remove(int index){

  }
}
