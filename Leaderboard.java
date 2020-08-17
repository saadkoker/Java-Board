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
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		frame.getContentPane().add(panel);
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel nameLabel = new JLabel("Name");
		JLabel scoreLabel = new JLabel("Score");
		panel.add(scoreLabel, c.FIRST_LINE_END);
		panel.add(nameLabel, c.FIRST_LINE_START);
		frame.setVisible(true);
		
	}
}
