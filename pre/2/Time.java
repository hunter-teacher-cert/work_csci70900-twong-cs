import java.io.*;
import java.util.*;

public class Time{
	public static void main(String[] args){
		int hour = 20, minute = 28, second = 47;
		int since = ((hour * 60) + minute) * 60 + second;
		System.out.print("Number of seconds since midnight: ");
		System.out.println(since);
		int remain = 24 * 60 * 60 - since;
		System.out.print("Number of seconds remaining in the day: ");
		System.out.println(remain);
		
		//Using a floating point number to calculate % of day passed to avoid rounding errors
		float percentPassed = since * 100 / (since + remain);
		System.out.print("Approximate percentage of the day that has passed: ");
		System.out.println(percentPassed + "%");
		int currentHour = 20, currentMinute = 46, currentSecond = 24;
		int currentSince = ((currentHour * 60) + currentMinute) * 60 + currentSecond;
		
		//Computes new value for number of seconds since midnight
		int elapsed = currentSince - since;
		System.out.print("Seconds elapsed since start of this exercise: ");
		System.out.println(elapsed);
		
		//Expression computes number of hours, minutes, and seconds elapsed since start of this exercise
		System.out.print("Time elapsed since start of this exercise: ");
		System.out.println(elapsed/3600 +" hours " + elapsed/60 +" minutes " + elapsed % 60 +" seconds");
	}
}