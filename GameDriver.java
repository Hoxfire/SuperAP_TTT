import pkg.*;
import java.util.ArrayList;

public class GameDriver {
	
	private GameState state;
	private Player player;
	
	public GameDriver(GameState initial) {
		state = intial;
		player = new Player(state.getCurrentPlayer());
	}
	
	public void play() {
		System.out.println(state);
		while (!isGameOver()) {
			state.getCurrentPlayer();
			System.out.println(state.getCurrentPlayer());
			player.getNextMove(state);
			System.out.println(player.getNextMove(state);
			state.makeMove(player.getNextMove(state));
		}
		if (state.makeMove(player.getNextMove(state)).equals("no move")) {
			System.out.println("Game ends in a draw");
		}
		else {
			System.out.println(state.getWinner());
		}
		
	}
}
