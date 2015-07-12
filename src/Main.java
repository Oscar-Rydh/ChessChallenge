import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		Game game = new Game();
		game.setUp();
		game.printBoard();
		game.move(0, 3, 4, 4);
		game.printBoard();
		

	}

}
