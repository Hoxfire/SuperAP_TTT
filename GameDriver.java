import pkg.*;
import java.util.ArrayList;

public class GameDriver {

	private GameState state;
	private Player X;
	private Player O;
	private EasyReader er;
	private String player1;
	private String player2;

	public GameDriver(GameState initial) {
		state = intial;
		er = new EasyReader();
		System.out.print("Who is player 1: ");
		player1 = er.readWord();
		X = new Player(player1);
		
		System.out.println("");
		
		System.out.print("Who is player 2: ");
		player2 = er.readWord();
		O = new Player(player2);
	}

	public void play() {
		System.out.println(state);
		while (!(state.isGameOver())) {
			state.getCurrentPlayer();
			System.out.println(player.getName());
			player.getNextMove(state);
			System.out.println((state.getCurrentPlayer()).getNextMove(state));
			state.makeMove((state.getCurrentPlayer()).getNextMove(state));
			System.out.println(state);
		}
		if (state.makeMove(player.getNextMove(state)).equals("no move")) {
			System.out.println("Game ends in a draw");
		}
		else {
			System.out.println(state.getWinner());
		}

	}
}