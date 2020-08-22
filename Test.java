import java.awt.Color;
import java.lang.Object;
import java.net.URL;

public class Test
{
	public static void main(String args[]) throws Exception
	{

		//Peg peggy3 = new Peg();
		//Peg peggy = new Peg("https://lh3.googleusercontent.com/proxy/Q1SZo2U3fGdNE0zJ3AL_BrVeHzQwD_Q5wkl1WyD3bgkegqfry90ou9hZAZFCaRseqlgNSub1ok8wq39hiBuR7NndPu1CHgYetvszsf_aweBPUDwTAg");
		
		Board board = new Board(400, 400, "MyBoard");

		//URL url = new URL("https://i.redd.it/0mmg7qs06nq21.jpg");

		//board.putPeg(peggy3, 2, 5);
		board.playBackground("background.wav");
		board.putPeg(new Peg(), 2, 3);
		Thread.sleep(1000);
		board.putPeg(new Peg("https://i.redd.it/0mmg7qs06nq21.jpg", "pokePeg"), 3, 6);
		board.displayMessage("Pee poo check");
		Thread.sleep(1000);	
		board.putPeg(new Peg(), 2, 8);
		Thread.sleep(1000);
		board.displayMessage("Pee poo check", "red");
		Thread.sleep(1000);	
		board.displayMessage("Pee poo check", new Color(192, 41, 108));
		Thread.sleep(1000);	
		board.displayMessage("LMAO");

		board.texturePack("wood");

		Thread.sleep(3000);
		board.texturePack("classic");
		Thread.sleep(3000);
		board.texturePack("alien");
		Thread.sleep(1000);
		board.texturePack("brainFuck");

		


		//board.drawPeg(new Peg(), 3, 3);
	}
}