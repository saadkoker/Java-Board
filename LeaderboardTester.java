import java.util.Random;

public class LeaderboardTester {
	
	public static void main(String[] args) {
		
		Leaderboard board = new Leaderboard();
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			board.addScore(new Score("Saad", random.nextInt(100)));
		}
		board.displayLeaderboard();
	}
}