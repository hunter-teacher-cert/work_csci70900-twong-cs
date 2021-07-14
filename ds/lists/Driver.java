import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	Node n;
	n = new Node();
	n.setData("Eduardo");


	Node n2 = new Node("Brian");
	n.setNext(n2);

	System.out.println(n);

	System.out.println(n2);

	System.out.println(n.getNext());

  //Node n3 = new Node("Steph");

	n.getNext().setNext(new Node("Steph"));
  n.getNext().getNext().setNext(new Node("Tofr"));
	//System.out.println(n2.getNext());
	//System.out.println(n.getNext().getNext());

  //create new list
	Node L = new Node("Tiffany");
  L.setNext(n);

  System.out.println("Create a new  list that looks like: L->a->b->c->d ");
  L.printNodeList();

  //System.out.println(L);

  //System.out.println(n.getNext().getNext().getNext());

  //insert new node in linked list
  Node x = new Node("Mamudu");
  x.setNext(n2); //Mamudu to Brian
  n.setNext(x); //Eduardo to Mamudu

  System.out.println("Write the code to insert an x between b and c");
  L.printNodeList();

  //code to delete a node
  x.setNext(n2.getNext());
  System.out.println("Write the code to delete c");
  L.printNodeList();
  //Node
	// 1.Create a new  list that looks like:
	//   L->"a"->"b"->"c"->"d"
	// 2. Write the code to insert an "x"
	//    between the b and the c
	// 3. Write the code to delete the c


    }
}
