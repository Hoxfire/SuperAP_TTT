import pkg.*;
import java.util.ArrayList;

public class Player{
	private String name;

	public Player(String aName) {
		name=aName;
	}

	public String getName() {
		return name;
	}

	public String getNextMove(GameState state) {
		return "hello";
	}
}
