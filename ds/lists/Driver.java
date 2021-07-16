//Emma Wingreen, Benson Leung, and Tiffany Wong
import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    /*
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
*/

  //Call Llist.java file
  System.out.println("\n");
	System.out.println("Llist");
	System.out.println("-----------");

	Llist ll = new Llist();
  System.out.println(ll);
  System.out.println("length = " + ll.length());
  System.out.println(ll.isEmpty());

  //Call Llist.java file
  System.out.println("\n");
  System.out.println("Llist (add node 'A')");
  System.out.println("-----------");
  ll.addFront("A");
	System.out.println(ll);
  System.out.println("length = " + ll.length());

  //Call Llist.java file
  System.out.println("\n");
	System.out.println("Llist (add nodes 'D' 'C')");
	System.out.println("-----------");

  ll.addFront("C");
  ll.addFront("D");
  System.out.println(ll);
  System.out.println("length = " + ll.length());

  //Check set() method
  System.out.println("\nCheck set(2, 'Benson'):");
  ll.set(2, "Benson");
  System.out.println(ll);

  //check get() method
  System.out.println("\nCheck get(0):");
  System.out.println(ll.get(0));

  System.out.println("\nCheck get(1):");
  System.out.println(ll.get(1));

  //check insert() method
  System.out.println("\nCheck insert(3, 'B'):");
  ll.insert(3,"B");
  System.out.println(ll);
  System.out.println("length = " + ll.length());

  //check insert() method
  System.out.println("\nCheck insert(4, 'A'):");
  ll.insert(4,"A");
  System.out.println(ll);
  System.out.println("length = " + ll.length());

  //check search() method
  System.out.println("\nCheck search('D'):");
  System.out.println(ll.search("D"));

  System.out.println("\nCheck search('F'):");
  System.out.println(ll.search("F"));

  //check remove() method
  System.out.println("\nCheck remove(0):");
  ll.remove(0);
  System.out.println(ll);
  System.out.println("length = " + ll.length());

  //check remove() method
  System.out.println("\nCheck remove(3):");
  ll.remove(3);
  System.out.println(ll);
  System.out.println("length = " + ll.length());

  //check remove() method
  System.out.println("\nCheck remove(0):");
  ll.remove(0);
  System.out.println(ll);
  System.out.println("length = " + ll.length());

  //check remove() method
  System.out.println("\nCheck remove(0):");
  ll.remove(0);
  System.out.println(ll);
  System.out.println("length = " + ll.length());

  //check remove() method
  System.out.println("\nCheck remove(0):");
  ll.remove(0);
  System.out.println(ll);
  System.out.println("length = " + ll.length());
    }
}
