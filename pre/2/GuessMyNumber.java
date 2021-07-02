import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {

    public static void main(String[] args) {
		
		int guess;
		int difference;
		
        // picks a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
		
		Scanner in = new Scanner(System.in);
		
		//prompt user to guess a number
		System.out.print("I'm thinking a number between 1 and 100, inclusive. ");
		System.out.println("Can you guess what it is?");
		System.out.print("Type a number: ");
		guess = in.nextInt();
		
		if (guess > number) {
			difference = guess - number;
		} else {
			difference = number - guess;
		}
		
		
		System.out.println("Your guess is: " + guess);
		System.out.println("The number I was thinking of is: " + number);
		System.out.println("You were off by: " + difference);
		
    }
}