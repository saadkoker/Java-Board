import java.lang.Object;
import java.net.URL;

public class Test
{
	public static void main(String args[]) throws Exception
	{
		Board board = new Board(10, 10, "MyBoard");

		URL url = new URL("https://i.redd.it/0mmg7qs06nq21.jpg");

		Peg peggy = new Peg();
		Peg peggy2 = new Peg();
		Peg peggy3 = new Peg(url);

		board.putPeg(peggy, 2, 3);
		board.putPeg(peggy2, 2, 6);

		board.putPeg(peggy3, 2, 5);


		//board.drawPeg(new Peg(), 3, 3);
	}
}