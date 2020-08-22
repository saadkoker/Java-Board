public class Score {

	private String name = " ";
	private int score = 0;

	public Score(String personName, int theScore){

		name = personName;
		score = theScore;
	}
	public void setName(String newName){

		name = newName;
	}
	public String getName(){

		return name;
	}
	public void setScore(int newScore){

		newScore = score;
	}
	public int getScore(){

		return score;
	}

	
}