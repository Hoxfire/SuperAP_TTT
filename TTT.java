import pkg.*;
import java.util.ArrayList;

public class TTT implements GameState {
	private static int[][] board = new int[3][3];
	private static Player winner = null;
	private static Player Player1 = new Player("Player1");
	private static Player Player2 = new Player("Player2");
	private static Player whosMove = Player1;
	public boolean isGameOver() {
		for(int i = 0; i<board.length; i++) {
			if(board[i][0] == 1 && board[i][1] == 1 && board[i][2] == 1) {
				winner = Player1;
				return true;
			}
			else if(board[i][0] == 2 && board[i][1] == 2 && board[i][2] == 2) {
				winner = Player2;
				return true;
			}
			else if(board[0][i] == 1 && board[1][i] == 1 && board[2][i] == 1) {
				winner = Player1;
				return true;
			}
			else if(board[0][i] == 2 && board[1][i] == 2 && board[2][i] == 2) {
				winner = Player2;
				return true;
			}
		}
		if(board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) {
			winner = Player1;
			return true;
		}
		else if(board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2) {
			winner = Player2;
			return true;
		}
		else if(board[2][0] == 1 && board[1][1] == 1 && board[0][2] == 1) {
			winner = Player1;
			return true;
		}
		else if(board[2][0] == 2 && board[1][1] == 2 && board[0][2] == 2) {
			winner = Player2;
			return true;
		}
		return false;
	}
	public Player getWinner() {
		if(isGameOver()) {
			return this.winner;
		}
	}
	public Player getCurrentPlayer() {
		if(!isGameOver()) {
			return this.whosMove;
		}
	}
	public ArrayList<String> getCurrentMoves() {
		ArrayList<String> valid = new ArrayList<String>();
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[0].length; j++) {
				if(board[i][j] == 0) {
					valid.add("("+String.valueOf(i) +"," + String.valueOf(j)+")");
				}
			}
		}
		return valid;
	}
	public void makeMove(String move) {
		/* make sure that whenever a certain player makes a move, it switches the variable whosMove to the opposite player
		Ex:
		If its players 1 turn, they move, then 
		whosMove = Player2;
		board[x][y] = 1 or 2
		*/

	}
	public String toString() {
		String s = "";
		for(int[] i: board) {
			s=s+"\n";
			for(int j: i) {
				s=s+j+" ";
			}
		}
		return s;
	}
}
