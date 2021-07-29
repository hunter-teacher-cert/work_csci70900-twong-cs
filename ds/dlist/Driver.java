import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {

    DLlist dll = new DLlist();
    //System.out.println(dll.isEmpty()); //isEmpty is true
    //System.out.println(dll.length()); //length is 0
    dll.add("e"); //populate dll
    dll.add("d");
    dll.add("c");
    dll.add("b");
    //System.out.println(dll.length()); //length is 1
    //System.out.println(dll.isEmpty()); //isEmpty is false
    dll.add("a");
    //System.out.println(dll.length()); //length is 2
    System.out.println("dll is: " + dll);

    /* ~~~~ code below used to search method ~~~~
    dll.remove(0); //removes a
    dll.remove(2); //removes d
    dll.remove(10); //says you can't remove
    dll.remove(2); //removes e at end of list
    */

    /* ~~~~ code below used to search method ~~~~
    System.out.println("a is at index: " + dll.search("a")); //returns 0
    System.out.println("b is at index: " + dll.search("b")); //returns 1
    System.out.println("e is at index: " + dll.search("e")); //returns 4
    */

    /* ~~~~ code below used to set method ~~~~
    dll.insert(0,"z");
    dll.insert(3,"y");
    dll.insert(7,"x");
    dll.insert(10,"v");
    */

    /* ~~~~ code below used to set method ~~~~
    dll.set(0, "z"); //first item now z
    dll.set(1, "y"); //second item now y
    dll.set(5, "x"); //prints index not valid
    */

    /* ~~~~ code below used to get method ~~~~
    System.out.println(dll.get(0)); //returns first item
    System.out.println(dll.get(1)); //returns second item
    System.out.println(dll.get(7)); //returns index not valid
    */
    System.out.println("dll is: " + dll);




    /* ~~~~ code below used to test member methods in Node.java ~~~~

    Node n, n2, n3, n4;
    n = new Node("a");
    n2 = new Node("b");
    n3 = new Node("c", n2);
    n4 = new Node("d", n3);

    n2.setPrev(n); //testing setPrev
    n.setNext(n2); //testing setNext
    n2.setNext(n3);
    n3.setNext(n4);
    //n4.setData("e"); //testing setData

    System.out.println("n is " + n);
    System.out.println("n2 is " + n2);
    System.out.println("n3 is " + n3);
    System.out.println("n4 is " + n4);

    n.printNodeList(); //testing printNodeList

    System.out.println("prev n is " + n.getPrev());
    System.out.println("next n is " + n.getNext());

    System.out.println("prev n2 is " + n2.getPrev());
    System.out.println("next n2 is " + n2.getNext());

    System.out.println("prev n3 is " + n3.getPrev());
    System.out.println("next n3 is " + n3.getNext());

    System.out.println("prev n4 is " + n4.getPrev());
    System.out.println("next n4 is " + n4.getNext());
    */

  } //end main

} //end class
