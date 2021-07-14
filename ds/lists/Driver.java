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
	System.out.println(n2.getNext());
	System.out.println(n.getNext().getNext());

	Node L = new Node("Tiffany");
  L.setNext(n);

  System.out.println(L);

  System.out.println(n.getNext().getNext().getNext());

  Node x = new Node("Mamudu");
  x.setNext(n2); //Mamudu to Brian
  n.setNext(x); //Eduardo to Mamudu

  //prints out linked list
  System.out.println("This is a linked list: ");
  Node s = L;
  while(s != null){
    System.out.println(s);
    s = s.getNext();
  }
  x.setNext(n2.getNext());
  //prints out linked list
  System.out.println("This is a linked list: ");
  Node s2 = L;
  while(s2 != null){
    System.out.println(s2);
    s2 = s2.getNext();
  }
  //Node
	// 1.Create a new  list that looks like:
	//   L->"a"->"b"->"c"->"d"
	// 2. Write the code to insert an "x"
	//    between the b and the c
	// 3. Write the code to delete the c


    }
}
