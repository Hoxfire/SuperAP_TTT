import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		// KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		// MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		GameState joe = new TTT(); //tbd peram
		GameDriver mary = new GameDriver(joe);
		mary.play();
		// TTT joe = new TTT();
		// System.out.print(joe.toString());
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
