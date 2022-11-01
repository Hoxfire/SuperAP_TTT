import pkg.*;
import java.util.ArrayList;

public class TTT implements GameState {
	public static int[][] board = new int[3][3];
	public boolean isGameOver() {

	}
	public Player getWinner() {

	}
	public Player getCurrentPlayer() {

	}
	public ArrayList<String> getCurrentMoves() {

	}
	public void makeMove(String move) {

	}
	public String toString() {
		String s = "";
		for(int[] i: board) {
			s=s+"\n";
			for(int j: i) {
				s=s+j;
			}
		}
		return s;
	}
}
