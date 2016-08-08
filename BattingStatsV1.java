package battingStats;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BattingStatsV1 {
	

	Scanner scan = new Scanner(System.in);
	private int sin, doub, trip, home, hits, atbat, bases;
	private double average;
	private double slugging;

	public void getStats(String name) {

		System.out.print("Times at bat: ");
		atbat = scan.nextInt();
		while (atbat <0) {
			System.out.print("Enter at bat value of 0 or greater: ");
				atbat = scan.nextInt();};
		System.out.print("Single hits: ");
		sin = scan.nextInt();
		while (sin <0) {
			System.out.print("Enter single hit value of 0 or greater: ");
				sin = scan.nextInt();};
		System.out.print("Double hits: ");
		doub = scan.nextInt();
		while (doub <0) {
			System.out.print("Enter double hit value of 0 or greater: ");
				doub = scan.nextInt();};
		System.out.print("Triple hits: ");
		trip = scan.nextInt();
		while (trip <0) {
			System.out.print("Enter triple hit value of 0 or greater: ");
				trip = scan.nextInt();};
		System.out.print("Homeruns: ");
		home = scan.nextInt();
		while (home <0) {
			System.out.print("Enter homerun hit value of 0 or greater: ");
				home = scan.nextInt();};
	}

	public Object calcAvg() {
		
		DecimalFormat df = new DecimalFormat("#.###");
		df.setMinimumFractionDigits(3);
		
		hits = sin + doub + trip + home;
		if (hits <= atbat) {
			average = ((double) hits / (double) atbat);
			return df.format(average);
		} else {
			return "YOU CHEATED! That's " + (hits - atbat) + " hits too many!" ;
		}
	}

	public Object slugAvg() {
		
		DecimalFormat df = new DecimalFormat("#.###");
		df.setMinimumFractionDigits(3);
		
		bases = (sin + (doub * 2) + (trip * 3) + (home * 4));
		if (hits <= atbat) {
			slugging = ((double) bases / (double) atbat);
			return df.format(slugging);
		} else {
			return "YOU CHEATED! That's " + (hits - atbat) + " hits too many!" ;
		}
	}

	public void printAll(String name) {
		System.out.println("Player statistics for " + name + ":");
		System.out.println("Single hits: " + sin);
		System.out.println("Double hits: " + doub);
		System.out.println("Triple hits: " + trip);
		System.out.println("Homerun: " + home);
		System.out.println("Times at bat: " + atbat);
		System.out.println("Total hits: " + hits);
		System.out.println("Total bases: " + bases);

	}
}
