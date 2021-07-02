import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Arrays {
	
	//Exercise 1.1 - method returning array elements raised to a given power
	public static double[] powArray (double[] a, int pow) {
		for (int i = 0; i < a.length; i++) {
		a[i] = Math.pow(a[i], pow);
		}
		return a;
	}
	
	//Exercise 1.2 - method returning histogram of 100 counters
	public static int[] histogram (int[] scores, int counters) {
		int[] counts = new int[counters];
		for (int i = 0; i < scores.length; i++) {
			int index = scores[i];
			counts[index]++;
			System.out.print(counts[index]);
		}
		return counts;
	}
	
	//Exercise 4 - method that returns index of largest elements
	public static int indexOfMax (int[] ints) {
		int index = -1;
		int max = -1;
		for (int i = 0; i < ints.length; i++) {
				if (max < ints[i]) {
					max = ints[i];
					index = i;
				}
		}
		System.out.print("index of largest element " + max + " is " + index);
		return index;
	}
	
	//Exercise 5 - method that returns boolean array telling if number is prime
	public static void sieve (int n) {
		int[] numbers = new int[n];
		boolean[] isPrime = new boolean[n];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
		}
		
		//0 and 1 are not prime.
		isPrime[0] = false;
		isPrime[1] = false;
		
		//assume rest of integers are prime for now
		for (int i = 2; i < isPrime.length; i++) {
			isPrime[i] = true;
		}
		
		int m = 2;
		while (m <= n) {
			for (int i = m; i < numbers.length - m; i = i + m) {
			isPrime[i + m] = false;
			}
			m++;
		}
		
		int a = 0;
		while (a < n) {
			System.out.println(numbers[a]);
			System.out.println(isPrime[a]);
			a++;
		}
		
	}
	
	public static void main (String[] args) {
		double[] a;
		int[] ints;
		int num, pow, answer, counters;
		Scanner in = new Scanner(System.in);
		
		//ask the user which method they want to run
		System.out.println("Which method do you want to run: powArray(1), histogram(2), indexOfMax(3), sieve(4)?");
		System.out.print("Input a numerical value: ");
		answer = in.nextInt();
		
		if (answer == 1) {
		
			System.out.print("How many numbers are in the array? ");
			num = in.nextInt();
		
			a = new double[num];
			System.out.print("Enter the " + num + " numbers: ");
		
			for (int i = 0; i < a.length; i++) {
				int b = in.nextInt();
				double d = b;
				a[i] = b;
			}
		
			System.out.print("What power do you want to raise the numbers to? ");
			pow = in.nextInt();
		
			powArray(a, pow);
		} else if (answer == 2) {
			System.out.print("How many numbers are in the array? ");
			num = in.nextInt();
		
			ints = new int[num];
			System.out.print("Enter the " + num + " numbers: ");
		
			for (int i = 0; i < ints.length; i++) {
				ints[i] = in.nextInt();
			}
			
			System.out.print("How many counters? ");
			counters = in.nextInt();
			
			histogram(ints, counters);
		} else if (answer == 3) {
			System.out.print("How many numbers are in the array? ");
			num = in.nextInt();
		
			ints = new int[num];
			System.out.print("Enter the " + num + " numbers: ");
		
			for (int i = 0; i < ints.length; i++) {
				ints[i] = in.nextInt();
			}
			
			indexOfMax(ints);
		} else if (answer == 4) {
			System.out.print("How many integers to check for primes? ");
			num = in.nextInt();
			
			sieve(num);
		}
	}
}