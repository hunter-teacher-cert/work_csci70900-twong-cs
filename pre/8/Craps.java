import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Craps {
	
	//roll accepts integer parameter and returns random number
	public static int roll (int n) {
		//random number is 1 and n, inclusive
		int rand = (int)(Math.random() * n + 1);
		
		return rand;
	}
	
	//shoot accepts 2 parameters and returns dice roll results
	public static int[] shoot (int numDice, int max) {
		//initiaize list to store dice roll results
		int[] diceRoll = new int[numDice];
		
		//generate roll result for each die
		for (int i = 0; i < numDice; i++) {
			diceRoll[i] = roll(max);
		}
		
		return diceRoll;
	}
	
	//round accepts no parameters and returns win/loss
	public static boolean round () {
		//simulate player rolling two dice
		int[] pointList = shoot(2,6);
		//point(2) is sum of player's roll
		int point = 0;
		int point2 = 0;
		
		System.out.println();
		System.out.println("Let's play a round of Craps.");
		
		//use loop to take sum of rolls
		for (int i = 0; i < pointList.length; i++) {
			point = pointList[i] + point;
		}
		System.out.println("You rolled a " + point);
		
		if (point == 2 || point == 3 || point == 12) {
			//player loses if roll is 2, 3, or 12
			System.out.println("You lose! You rolled craps");
			return false;
		} else if (point == 7 || point == 11) {
			//player wins if roll is 7 or 11
			System.out.println("You win! You rolled a natural");
			return true;
		} else {
			
			System.out.println("Roll again!");
			
			//repeat rolling until player rolls point again or 7
			do {
				//player rolls again
				point2 = 0;
				pointList = shoot(2,6);
				for (int i = 0; i < pointList.length; i++) {
					point2 = pointList[i] + point2;
				}
				System.out.println("You rolled a " + point2);
				
				if (point2 == point) {
					System.out.println("You win! You rolled " + point + " again.");
					return true;
				} else if (point2 == 7) {
					System.out.println("You lose! You rolled a 7.");
					return false;
				}
			} while (true);
			
			
		}
			
	}
	
	public static void main (String[] args) {
		int num = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many rounds of craps do you want to play?");
		num = in.nextInt();
		
		//play Craps for as many rounds as user inputted
		for (int i = 0; i < num; i++) {
			round();
		}
	}
	
}