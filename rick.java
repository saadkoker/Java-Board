import java.lang.Object;
import java.net.URL;
import java.io.File;

public class Rick
{
	public static void main(String args[]) throws Exception
	{
		Board board = new Board(10, 10, "ricky");
		board.playBackground("background.wav");

		String filePath = "rick/rickastley_";
		String tempFilePath = " ";

		for(int i = 1; i <= 10; i++)
		{	
			
			filePath = "rick/rickastley_";

			if(i < 10)
				filePath = filePath.concat("0" + i + "_");

			else 
				filePath = filePath.concat(i + "_");

			tempFilePath = filePath;

			for(int j = 1; j <= 10; j++)
			{
				if(j < 10)
				{
					filePath = filePath.concat("0" + j + ".png");
				}

				else 
					filePath = filePath.concat(j + ".png");

				
				System.out.println(filePath);
				board.putPeg(new Peg(new File(filePath)), i - 1, j - 1);
				board.texturePack("brainfuck", 100);
				Thread.sleep(466);
				filePath = tempFilePath;
			}
			
		}
		
		board.vibrate(100, 10);

	}
}
