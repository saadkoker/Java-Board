public class Test
{
	public static void main(String args[]) throws Exception
	{
		Board board = new Board(10, 10, "MyBoard");

		Peg peggy = new Peg();
		Peg peggy2 = new Peg();

		board.putPeg(peggy, 2, 3);
		board.putPeg(peggy2, 2, 6);


		//board.drawPeg(new Peg(), 3, 3);
	}
}