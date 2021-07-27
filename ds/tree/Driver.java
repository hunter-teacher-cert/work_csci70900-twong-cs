import java.io.*;
import java.util.*;


public class Driver {
  public static void main(String[] args) {
    BSTree t = new BSTree();
    // t.seed();

    t.insert(10);
		t.insert(20);
		t.insert(5);
		t.insert(7);
		t.insert(8);
		t.insert(3);
		t.insert(25);
    t.insert(2);
    t.insert(4);
		t.insert(18); //swapped inserting 18 and 19 and deleting 20 works
    t.insert(19);
		t.insert(17);
		//t.insert(16);

		//but deleting 3 doesn't work!


    // int value;
    // value = t.search(10);
    // System.out.println(value);
    // value = t.search(20);
    // System.out.println(value);
    // value = t.search(5);
    // System.out.println(value);
    // value = t.search(7);
    // System.out.println(value);
    // value = t.search(8);
    // System.out.println(value);
    // value = t.search(3);
    // System.out.println(value);
    // value = t.search(25);
    // System.out.println(value);
    // value = t.search(17);
    // System.out.println(value);

    // try {
    //   value = t.search(17);
    //   System.out.println(value);
    // } catch (NullPointerException e) {
    //   System.out.println("17 not in tree");
    // }

		//t.preorderTraverse();
		//t.postorderTraverse();
		t.inorderTraverse();

    // t.delete(25);
    // t.inorderTraverse();

    // t.delete(7);
    // t.delete(3);
    // t.inorderTraverse();
		//
		int num = 5;
		System.out.println("deleting " + num + ": ");
    t.delete(num);
  	t.inorderTraverse();

		// t.delete(20);
		// t.inorderTraverse();

  }
}
