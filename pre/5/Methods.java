import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Methods {
	
	//Exercise 2 - methods takes two integers and checks for divisibility
	public static boolean isDivisible (int n, int m) {
		if (n % m == 0) {
			System.out.print(n + " is divisible by " + m);
			return true;
		}
		else {
			System.out.print(n + " is not divisible by " + m);
			return false;
		}
	}
	
	//Exercise 3 - takes three integers and checks if a triangle can be formed with side lengths
	public static boolean isTriangle (int a, int b, int c) {
		if ( a + b > c && b + c > a && a + c > b) {
			System.out.print("can form triangle");
			return true;
		} else {
			System.out.print("cannot form triangle");
			return false;
		}
	}
	 
	 //Exercise 8 - takes two integers and returns value of Ackermann function
	 public static int ack(int m, int n) {
		 int result;
		 
		 if (m == 0) {
			 result = n + 1;
			 return result;
		 } else if (m > 0 && n == 0) {
			 m = m - 1;
			 result = ack(m, 1);
			 return result;
		 } else if (m > 0 && n > 0) {
			 result = ack(m - 1, ack(m, n - 1));
			 return result;
		 }
		 //line below is dead code because any combination of define, non-negative integers will 
		 // meet any one of the requirements above. To avoid missing return statement error, method 
		 // will return -1 (not a value that's possible)
		 return -1;
	 }
	 
	public static void main (String[] args) {
		int m, n;
		int a,b,c;
		int answer;
		
		Scanner in = new Scanner(System.in);
		
		//ask the user which method they want to run
		System.out.println("Which method do you want to run: divisible (1), triangle (2), or ack (3)?");
		System.out.print("Input a numerical value: ");
		answer = in.nextInt();
		
		if (answer == 1) {
			//prompt the user and get input values for isDivisible
			System.out.print("What number do you want to check is divisible by another? ");
			n = in.nextInt();
			
			System.out.print("And what is the other number? ");
			m = in.nextInt();
			
			isDivisible(n,m);
		} else if (answer == 2) {
			//prompt the user and get input values for isTriangle
			System.out.print("What is the first length? ");
			a = in.nextInt();
		
			System.out.print("What is the second length? ");
			b = in.nextInt();
			
			System.out.print("What is the third length? ");
			c = in.nextInt();
			
			isTriangle(a,b,c);
		} else if (answer == 3) {
			//prompt the user and get input values for ack
			System.out.print("What is m? ");
			m = in.nextInt();
			
			System.out.print("What is n? ");
			n = in.nextInt();
			
			System.out.print(ack(m,n));
		} else {
		System.out.println("invalid input. try again.");
		}
	}
}