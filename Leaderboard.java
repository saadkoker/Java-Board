import java.awt.*;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Leaderboard {
	
	private static ArrayList<Score> scores = new ArrayList<Score>();

	public void addScore(Score score) {
		
		scores.add(score);
	}
	public void displayLeaderboard(){

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel nameLabel = new JLabel("                           Score");
		JLabel scoreLabel = new JLabel("Name                       ");
		panel.add(scoreLabel);
		panel.add(nameLabel);
		frame.setVisible(true);

		for (Score score : scores) {
			panel.add(new JLabel(score.getName() + "                             "));
			panel.add(new JLabel("                            " + score.getScore()));
		}
		
	}
}
