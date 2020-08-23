import java.awt.*;
import java.util.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Leaderboard {
	
	private static ArrayList<Score> scores = new ArrayList<Score>();

	public void addScore(Score score) {
		
		scores.add(score);
	}
	public void displayLeaderboard(){

		JFrame frame = new JFrame();
		JPanel mainPanel = new JPanel(new GridLayout(1, 1, 5, 5));
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setSize(300, 400);
		JPanel namePanel = new JPanel(new GridLayout(5, 1, 1, 1));
		JPanel scorePanel = new JPanel(new GridLayout(5, 1, 1, 1));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel scoreLabel = new JLabel("Score");
		JLabel nameLabel = new JLabel("Name");
		namePanel.add(nameLabel);
		//namePanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		scorePanel.add(scoreLabel);
		//scorePanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		frame.setVisible(true);
		mainPanel.add(namePanel);
		mainPanel.add(scorePanel);
		frame.add(mainPanel);

		for (Score score : scores) {
			namePanel.add(new JLabel(score.getName()));
			scorePanel.add(new JLabel(Integer.toString(score.getScore())));
		}
		
	}
}
