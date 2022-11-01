import pkg.*;
import java.util.ArrayList;

public class TTT implements GameState {
	int [] [] moves = new int[3][3];
	boolean isGameOver() {
	
	}
	Player getWinner() {
		if(!isGameOver) {
			if(winner==Player1) {
				return Player1;
			}
			else if(winner==Player2) {
				return Player2;
			}
			else {
				return null;
			}
		}
	}
	Player getCurrentPlayer() {

	}
	ArrayList<String> getCurrentMoves() {

	}
	void makeMove(String move) {

	}
	String toString() {

	}
}
