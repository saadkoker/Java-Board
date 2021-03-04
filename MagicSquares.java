import java.util.*;

public class MagicSquares{

	public static Board staticBoard = new Board(3, 3, "Magic Squares");
	public static Board playBoard = new Board(3, 3, "Magic Squares");

	public static void main(String[] args) throws Exception {
		
		//variables
		boolean won = false;
		int sameCount = 0;
		int clicks = 0;
		Random random = new Random();
		boolean[][] staticBoardState = new boolean[3][3];
		boolean[][] playBoardState = new boolean[3][3];
		
		//initial board setup
		for(int i = 0; i<staticBoardState.length; i++){
			for(int j = 0; j<staticBoardState[i].length; j++){
				staticBoardState[i][j] = random.nextBoolean();
				if(staticBoardState[i][j])
					staticBoard.putPeg(new Peg("default.png"), i, j);
				playBoardState[i][j] = random.nextBoolean();
				if(playBoardState[i][j])
					playBoard.putPeg(new Peg("default.png"), i, j);
			}
		}
		staticBoard.displayMessage("Match this pattern");
		
		//game play
		while(!won){
			
			//get click
			Coordinate currentClick = playBoard.getClick();
			clicks++;
			playBoard.displayMessage("Number of Clicks: " + clicks);
			
			//middle
			if(currentClick.getRow() == 1 && currentClick.getCol() == 1){
				if(!playBoardState[currentClick.getRow()][currentClick.getCol()]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow(), currentClick.getCol());
					playBoardState[currentClick.getRow()][currentClick.getCol()] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow(), currentClick.getCol());
					playBoardState[currentClick.getRow()][currentClick.getCol()] = false;
				}
				if(!playBoardState[currentClick.getRow()-1][currentClick.getCol()]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow()-1, currentClick.getCol());
					playBoardState[currentClick.getRow()-1][currentClick.getCol()] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow()-1, currentClick.getCol());
					playBoardState[currentClick.getRow()-1][currentClick.getCol()] = false;
				}
				if(!playBoardState[currentClick.getRow()+1][currentClick.getCol()]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow()+1, currentClick.getCol());
					playBoardState[currentClick.getRow()+1][currentClick.getCol()] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow()+1, currentClick.getCol());
					playBoardState[currentClick.getRow()+1][currentClick.getCol()] = false;
				}
				if(!playBoardState[currentClick.getRow()][currentClick.getCol()-1]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow(), currentClick.getCol()-1);
					playBoardState[currentClick.getRow()][currentClick.getCol()-1] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow(), currentClick.getCol()-1);
					playBoardState[currentClick.getRow()][currentClick.getCol()-1] = false;
				}
				if(!playBoardState[currentClick.getRow()][currentClick.getCol()+1]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow(), currentClick.getCol()+1);
					playBoardState[currentClick.getRow()][currentClick.getCol()+1] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow(), currentClick.getCol()+1);
					playBoardState[currentClick.getRow()][currentClick.getCol()+1] = false;
				}
			}
			
			//top left
			else if(currentClick.getRow() == 0 && currentClick.getCol() == 0){
				if(!playBoardState[currentClick.getRow()][currentClick.getCol()]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow(), currentClick.getCol());
					playBoardState[currentClick.getRow()][currentClick.getCol()] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow(), currentClick.getCol());
					playBoardState[currentClick.getRow()][currentClick.getCol()] = false;
				}
				if(!playBoardState[currentClick.getRow()+1][currentClick.getCol()]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow()+1, currentClick.getCol());
					playBoardState[currentClick.getRow()+1][currentClick.getCol()] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow()+1, currentClick.getCol());
					playBoardState[currentClick.getRow()+1][currentClick.getCol()] = false;
				}
				if(!playBoardState[currentClick.getRow()][currentClick.getCol()+1]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow(), currentClick.getCol()+1);
					playBoardState[currentClick.getRow()][currentClick.getCol()+1] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow(), currentClick.getCol()+1);
					playBoardState[currentClick.getRow()][currentClick.getCol()+1] = false;
				}
			}
			
			//top right
			else if(currentClick.getRow() == 0 && currentClick.getCol() == 2){
				if(!playBoardState[currentClick.getRow()][currentClick.getCol()]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow(), currentClick.getCol());
					playBoardState[currentClick.getRow()][currentClick.getCol()] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow(), currentClick.getCol());
					playBoardState[currentClick.getRow()][currentClick.getCol()] = false;
				}
				if(!playBoardState[currentClick.getRow()+1][currentClick.getCol()]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow()+1, currentClick.getCol());
					playBoardState[currentClick.getRow()+1][currentClick.getCol()] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow()+1, currentClick.getCol());
					playBoardState[currentClick.getRow()+1][currentClick.getCol()] = false;
				}
				if(!playBoardState[currentClick.getRow()][currentClick.getCol()-1]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow(), currentClick.getCol()-1);
					playBoardState[currentClick.getRow()][currentClick.getCol()-1] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow(), currentClick.getCol()-1);
					playBoardState[currentClick.getRow()][currentClick.getCol()-1] = false;
				}
			}
			
			//bottom left
			else if(currentClick.getRow() == 2 && currentClick.getCol() == 0){
				if(!playBoardState[currentClick.getRow()][currentClick.getCol()]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow(), currentClick.getCol());
					playBoardState[currentClick.getRow()][currentClick.getCol()] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow(), currentClick.getCol());
					playBoardState[currentClick.getRow()][currentClick.getCol()] = false;
				}
				if(!playBoardState[currentClick.getRow()-1][currentClick.getCol()]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow()-1, currentClick.getCol());
					playBoardState[currentClick.getRow()-1][currentClick.getCol()] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow()-1, currentClick.getCol());
					playBoardState[currentClick.getRow()-1][currentClick.getCol()] = false;
				}
				if(!playBoardState[currentClick.getRow()][currentClick.getCol()+1]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow(), currentClick.getCol()+1);
					playBoardState[currentClick.getRow()][currentClick.getCol()+1] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow(), currentClick.getCol()+1);
					playBoardState[currentClick.getRow()][currentClick.getCol()+1] = false;
				}
			}
			
			//bottom right
			else if(currentClick.getRow() == 2 && currentClick.getCol() == 2){
				if(!playBoardState[currentClick.getRow()][currentClick.getCol()]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow(), currentClick.getCol());
					playBoardState[currentClick.getRow()][currentClick.getCol()] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow(), currentClick.getCol());
					playBoardState[currentClick.getRow()][currentClick.getCol()] = false;
				}
				if(!playBoardState[currentClick.getRow()-1][currentClick.getCol()]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow()-1, currentClick.getCol());
					playBoardState[currentClick.getRow()-1][currentClick.getCol()] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow()-1, currentClick.getCol());
					playBoardState[currentClick.getRow()-1][currentClick.getCol()] = false;
				}
				if(!playBoardState[currentClick.getRow()][currentClick.getCol()-1]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow(), currentClick.getCol()-1);
					playBoardState[currentClick.getRow()][currentClick.getCol()-1] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow(), currentClick.getCol()-1);
					playBoardState[currentClick.getRow()][currentClick.getCol()-1] = false;
				}
			}
			
			//middle row
			else if(currentClick.getRow() == 1){
				if(!playBoardState[currentClick.getRow()][currentClick.getCol()]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow(), currentClick.getCol());
					playBoardState[currentClick.getRow()][currentClick.getCol()] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow(), currentClick.getCol());
					playBoardState[currentClick.getRow()][currentClick.getCol()] = false;
				}
				if(!playBoardState[currentClick.getRow()-1][currentClick.getCol()]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow()-1, currentClick.getCol());
					playBoardState[currentClick.getRow()-1][currentClick.getCol()] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow()-1, currentClick.getCol());
					playBoardState[currentClick.getRow()-1][currentClick.getCol()] = false;
				}
				if(!playBoardState[currentClick.getRow()+1][currentClick.getCol()]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow()+1, currentClick.getCol());
					playBoardState[currentClick.getRow()+1][currentClick.getCol()] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow()+1, currentClick.getCol());
					playBoardState[currentClick.getRow()+1][currentClick.getCol()] = false;
				}
			}
			
			//middle col
			else{
				if(!playBoardState[currentClick.getRow()][currentClick.getCol()]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow(), currentClick.getCol());
					playBoardState[currentClick.getRow()][currentClick.getCol()] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow(), currentClick.getCol());
					playBoardState[currentClick.getRow()][currentClick.getCol()] = false;
				}
				if(!playBoardState[currentClick.getRow()][currentClick.getCol()-1]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow(), currentClick.getCol()-1);
					playBoardState[currentClick.getRow()][currentClick.getCol()-1] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow(), currentClick.getCol()-1);
					playBoardState[currentClick.getRow()][currentClick.getCol()-1] = false;
				}
				if(!playBoardState[currentClick.getRow()][currentClick.getCol()+1]){
					playBoard.putPeg(new Peg("default.png"), currentClick.getRow(), currentClick.getCol()+1);
					playBoardState[currentClick.getRow()][currentClick.getCol()+1] = true;
				}
				else{
					playBoard.removePeg(currentClick.getRow(), currentClick.getCol()+1);
					playBoardState[currentClick.getRow()][currentClick.getCol()+1] = false;
				}
			}
			
			//check if the boards are in the same state
			sameCount = 0;
			for(int i = 0; i<staticBoardState.length; i++){
				for(int j = 0; j<staticBoardState[i].length; j++){
					if(playBoardState[i][j] == staticBoardState[i][j])
						sameCount++;
				}
			}
			if(sameCount == 9)
				won = true;
		}
		
		//print when won, signalling end of game
		playBoard.displayMessage("Winner! " + clicks + " clicks.");
	}
}