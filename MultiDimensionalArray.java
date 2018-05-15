public class MultiDimensionalArray {
	public static void main(String[] args) {
		String[] friends = {"John", "George", "David"};
		
		int [][] golfScoreCards = {
				{3, 2, 4, 2},		// This is John's score card
				{2, 3, 5, 2},		// This is George's score card
				{3, 4, 2, 3}		// This is David's score card
		};
		
		for (int i = 0; i < friends.length; i++) {
			System.out.printf("%s %n--------------%n", friends[i]);
			for(int j = 0; j < golfScoreCards[i].length; j++) {
				System.out.printf("Hole #%d: %d %n", j + 1, golfScoreCards[i][j]);
			}
		}
	}	
}
