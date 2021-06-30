import java.io.*;
import java.util.*;
import java.util.Scanner;

//Converts Celcius to Fahrenheit.

public class Cel2Far {
	public static void main(String[] args){
		double celsius, fahrenheit;
		// F = C * 9/5 + 32 so will need two constants
		final double MULTIPLIER = 9.0/5.0;
		final int ADDEND = 32;
		Scanner in = new Scanner(System.in);
		
		//prompt the user and get the value
		System.out.print("How many Celsius? ");
		celsius = in.nextDouble();
		
		//convert to Fahrenheit and output result to one decimal place
		fahrenheit = celsius * MULTIPLIER + ADDEND;
		System.out.printf("%.1f C = %.1f F", celsius, fahrenheit);
	}
}