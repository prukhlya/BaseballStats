package battingStats;

import java.text.DecimalFormat;
import java.util.Scanner;

class BattingStatsPart2 {
		
	public static void main(String[] args) {
	
			BattingStatsV1 player1 = new BattingStatsV1();
			new Scanner(System.in);
			String name = "Player";
			player1.getStats(name);
			player1.calcAvg();
			player1.slugAvg();
			player1.printAll(name);
			
			System.out.println("Batting Average: " + player1.calcAvg());
			System.out.println("Slugging Percentage: " + player1.slugAvg());
		}
}
