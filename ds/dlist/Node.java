import java.io.*;
import java.util.*;

public class Node {

  private String data;
  private Node prev, next;

  public Node() {
    data = "";
    prev = null;
    next = null;
  }//default constructor

  public Node(String value) {

    data = value;
    prev = null;
    next = null;
  }//constructor(value)

  public Node(String value, Node prev) {
    data = value;
    this.prev = prev;
  }//constructor(value, prev)

  public Node(String value, Node prev, Node next) {
    data = value;
    this.prev = prev;
    this.next = next;
  }//constructor(value, prev, next)

  public void setData(String value) {
    data = value;
  }//setData

  public void setNext(Node n) {
    next = n;
  }//setNext

  public void setPrev(Node n) {
    prev = n;
  }//setPrev

  public String getData() {
    return data;
  }//end getValue

  public Node getNext() {
    return next;
  }//getNext

  public Node getPrev() {
    return prev;
  }//getPrev

  public String toString() {
    return data;
  }//toString

  public void printNodeList(){
    Node s = this;
    while(s != null){
      System.out.println(s);
      s = s.getNext();
    }
  }

}//class Node
