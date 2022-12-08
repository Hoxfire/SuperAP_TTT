import pkg.*;
import java.util.ArrayList;

public class GameDriver {

	private GameState state;
	private EasyReader er;
	private String player1;
	private String player2;
	private String move;

	public GameDriver(GameState initial) {
		state = initial;
		er = new EasyReader();
		System.out.print("Who is player 1: ");
		player1 = er.readWord();
		
		System.out.println("");
		
		System.out.print("Who is player 2: ");
		player2 = er.readWord();
	}

	public void play() {
		while (!(state.isGameOver())) {
			System.out.println(state);
			System.out.println("");
			if ((state.getCurrentPlayer()).getName().equals("x")) {
				System.out.println(player1 + "'s turn");
			}
			else {
				System.out.println(player2 + "'s turn");
			}
			System.out.println("Make a move: ");
			move = er.readWord();
			state.makeMove(move);
		}
		System.out.println(state);
		if ((state.getWinner()).getName().equals("x")) {
			System.out.println(player1 + " Wins!");
		}
		else if ((state.getWinner()).getName().equals("o")) {
			System.out.println(player2 + " Wins!");
		}
		else {
			System.out.println("Game ends in a draw");
			play();
		}

	}
}
