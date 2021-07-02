import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Loops {
	
	//Exercise 3 - iterative method to perform power calculations
	public static int power(double x, int n) {
		double base = x;
		if (n == 0) {
			x = 1;
		} else {
			for (int i = 2; i <= n; i = i + 1) {
				x = x * base;
			}
		} 
		int num = (int) x;
		//System.out.print(base + " to the " + n + " power is " + num);
		return num;
	}
	
	//Exercise 4 - iterative method to compute factorials
	public static int factorial(int x) {
		int num = x;
		if (num == 0) {
			x = 1;
		} else {
			for (int i = num; i >= 2; i = i - 1) {
				x = x * (i-1);
			}
		}
		//System.out.print(num + "! = " + x);
		return x;
	}
	
	//Exercise 5.1-2 - iterative method to calculate e^x
	public static double myexp(double x, int n) {
		double num, pow, fact;
		num = 1;
		if (n == 0) {
			num = 0;
		} else if (n == 1) {
			num = 1;
		} else {
			pow = 1;
			fact = 1; 
			for (int i = 1; i < n; i = i + 1) {
				pow = pow * x;
				fact = fact * i;
				num = pow / fact + num;
			}
		}
		//System.out.println("e^" + x + " approximated to " + n + " terms = "+ num);
		return num;
	}
	
	//Exercise 5.3 - method that outputs x, myexp(x), Math.exp(x)
	public static void check(double x, int n){
		System.out.println(x + "\t" + myexp(x,n)+ "\t" + Math.exp(x));
	}
	
	public static void main (String[] args) {
		double x;
		int answer, m, n;
		Scanner in = new Scanner(System.in);
		
		//ask the user which method they want to run
		System.out.println("Which method do you want to run: power (1), factorial (2), myexp (3), or check (4)?");
		System.out.print("Input a numerical value: ");
		answer = in.nextInt();
		
		if (answer == 1) {
			//ask the user for input values to power
			System.out.print("Input the base number: ");
			x = in.nextDouble();
			
			System.out.print("Input the exponent: ");
			n = in.nextInt();
			
			power(x, n);
		} else if (answer == 2) {
			//ask the user for input values to factorial
			System.out.print("Input the number: ");
			n = in.nextInt();
			
			factorial(n);
		} else if (answer == 3) {
			//ask the user for input values to myexp
			System.out.print("Input value of x in e^x: ");
			m = in.nextInt();
			
			System.out.print("Input the # terms to approximate to: ");
			n = in.nextInt();
			
			myexp(m, n);
		} else if (answer == 4) {
			//ask the user for input a value for checl
			//System.out.print("Input a number to check: ");
			//m = in.nextInt();
			
			System.out.print("Input the # terms to approximate to: ");
			n = in.nextInt();
			
			//The number of digits in agreement are more significant as x increases in value
			for (double i = 0.1; i <= 100.0; i = i * 10) {
				check(i, n);
			}
			
			//The accuracy increasingly worsens as x becomes more negative
			for (double i = -0.1; i >= -100.0; i = i * 10) {
				check(i, n);
			}
		}
	}
}