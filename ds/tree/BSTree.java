import java.io.*;
import java.util.*;

public class BSTree {
  private TreeNode root;

  public BSTree(){
    root = null;
  }

  public void delete(int key){

    // if the tree is empty, nothing to delete
    if (root==null){
      return;
    }

    // find the node that we want to delete
    // and the node above it using piggybacking
    TreeNode front = root;
    TreeNode trailer = root;

    // do the piggyback loop
    // until we either find the node or
    // find null if the key isn't present
    while (front != null && front.getData() != key ){
      if (front.getData() < key){
        trailer = front;
        front = front.getRight();
      } else {
        trailer = front;
        front = front.getLeft();
      }
    }

    // if the key wasn't in the tree
    if (front == null){
      return;
    }

    // if we get here
    // front points to the node we want to delete
    // and trailer points to the one above it

    // case 1 -- the node we want to delete is a leaf
    if (front.getLeft() == null &&
    front.getRight() == null) {
      //System.out.println("no children");
      // repoint front's parent to null...
      if (key > trailer.getData()){
        trailer.setRight(null); //...on the right side
      } else {
        trailer.setLeft(null); //...on the left side
      }

      /* check to see if front has one child */
      //Node has one child on the left
    } else if (front.getLeft() != null && front.getRight() == null) {
      //System.out.println("one child on left");
      trailer.setLeft(front.getLeft());

      //Node has one child on the right
    } else if (front.getLeft() == null && front.getRight() != null) {
      //System.out.println("one child on right");
      trailer.setRight(front.getRight());
    }
      // repoint front's parent to front's child
    else {
    //System.out.println("2 children");
      // front has two children
      //
      // find the node with the largest value on fronts left subtree
      // and replace front with it.
      //i.e. go left once and go as far right as possible

      TreeNode temp = new TreeNode();
      temp = front;
      front = front.getLeft();
      while (front.getRight() != null){ //while a right node exists
        temp = front;
        front = front.getRight(); //keep processing right node
        //System.out.println("looped");
      }
      //temp.setData(front.getData());
      System.out.println("front: " + front.getData());
      System.out.println("temp: " + temp.getData());
      System.out.println("trailer: " + trailer.getData());
      //then connect the trailer to the new front Node
      if(front.getData() < temp.getData()){ //if key is to the left of trailer
        System.out.println("IF");
        //temp.setData(front.getData());
        front.setRight(trailer.getLeft().getRight());
        if(front.getLeft().getLeft() != null){
        //System.out.println("front is: " + front.getData());
        //delete(front.getData());
        //if(trailer.getLeft().getLeft().getLeft() != null){ //if front has left node
          front.setLeft(trailer.getLeft().getLeft()); //copy over left subtree of front
          System.out.println(front.getLeft().getData());
          //delete(front.getLeft().getRight());
          front.getLeft().setRight(null); //delete copy of itself
          System.out.println("something has been deleted");
        }
        trailer.setLeft(front);
        //System.out.println("front: " + front.getData());
        //System.out.println("right of front: " + front.getRight().getData());

      } else { //if key is to the right of trailer
        System.out.println("ELSE");
        front.setLeft(trailer.getRight().getLeft());

        if(trailer.getLeft().getLeft().getLeft() != null){ //same code to avoid infinite recursive loop
          front.setRight(trailer.getRight().getRight());
          front.getLeft().setRight(null);
        }
        trailer.setRight(front);
      }
      //have the new front node point to what the old node pointed to
      //on the left and the right

    }

  }

  private void preorderTraverse(TreeNode current){
    if (current == null)
    return;

    //process the current node
    System.out.print(current.getData()+", ");

    // recursively print out the left subtree
    preorderTraverse(current.getLeft());

    // recursively print out the right subtree
    preorderTraverse(current.getRight());
  }

  public void preorderTraverse(){
    preorderTraverse(root);
    System.out.println();
  }

  private void postorderTraverse(TreeNode current){
    if (current == null)
    return;

    // recursively print out the left subtree
    postorderTraverse(current.getLeft());

    // recursively print out the right subtree
    postorderTraverse(current.getRight());

    //process the current node
    System.out.print(current.getData()+", ");

  }

  public void postorderTraverse(){
    postorderTraverse(root);
    System.out.println();
  }

  private void inorderTraverse(TreeNode current){
    if (current == null)
    return;


    // recursively print out the left subtree
    inorderTraverse(current.getLeft());

    //process the current node
    System.out.print(current.getData()+", ");

    // recursively print out the right subtree
    inorderTraverse(current.getRight());
  }

  public void inorderTraverse(){
    inorderTraverse(root);
    System.out.println();
  }


  public void insert(int key){

    TreeNode newNode = new TreeNode(key);

    // if the tree is empty
    // manually insert the new node as the root
    if (root == null){
      root = newNode;
      return;
    }

    TreeNode front = root;
    TreeNode trailer = null;

    while (front != null){
      int frontValue = front.getData();
      if (frontValue == key){
        // if we're here, it means the key is
        // already in the tree so we can
        // update this node in some way
        // and then return
        return;
      } else if (frontValue < key){
        trailer = front;
        front = front.getRight();
      } else {
        trailer = front;
        front = front.getLeft();
      }
    }
    if (key > trailer.getData()){
      // insert on the right
      trailer.setRight(newNode);
    } else {
      // insert on left
      trailer.setLeft(newNode);
    }
  }


  public int search(int key){
    TreeNode current = root;

    while (current != null){

      int currentValue = current.getData();

      if (current.getData() == key){ //current value is equal to key value
        currentValue = current.getData();
        return currentValue;
      }
      else if (currentValue < key){ //current value is less than key, move right
        current = current.getRight();
      }
      else if (currentValue > key){ //current value is greater than key, move left
        current = current.getLeft();
      }
    }
    //Return -1 if key not found in tree
    return -1;
  }

  public void seed(){
    TreeNode t;

    t = new TreeNode(10);
    root = t;
    t = new TreeNode(5);
    root.setLeft(t);
    t = new TreeNode(20);
    root.setRight(t);

    root.getLeft().setRight( new TreeNode(8));

    t = new TreeNode(15);
    root.getRight().setLeft(t);

    t = new TreeNode(22);
    root.getRight().setRight(t);

  }


}
