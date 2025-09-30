/*
*By Muhindo Reuben
*/
import java.util.Scanner;
public class SplitSeconds{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Seconds: ");
		int totalSeconds = input.nextInt();
		int minutes, seconds;
		minutes = totalSeconds/60; // convert seconds to minutes (whole numbers)
		seconds = totalSeconds%60; // get remaining seconds
		System.out.println("You get " + minutes +" minutes and " + seconds + " seconds from " + totalSeconds + " seconds");
	}
}