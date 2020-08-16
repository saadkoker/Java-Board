import java.awt.color.*;
import javax.swing.*;
import java.awt.Color;

public class Tester{
	
	public static void main(String[] args){
		
		Board board = new Board(10, 10, "No");

		try {
			Thread.sleep(1100);
		} catch (Exception e) {
			//TODO: handle exception
		}

		while (true) {
			
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				//TODO: handle exception
			}
			board.vibrate(10, 50000);
			board.changeBoardColor("red", "blue");
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				//TODO: handle exception
			}
			board.vibrate(10, 50000);
			board.changeBoardColor(new Color(0,0,0), new Color(255,255,255));
		}
	}
}
