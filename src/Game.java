import java.io.IOException;

import Pieces.ChessPiece;
import Pieces.Empty;


public class Game {
	private ChessBoardModell board;
	private ChessBoardView boardView;
	
	public Game () throws IOException{
		board = new ChessBoardModell();
		
	}
	
	public void setUp() throws IOException{
		board.fillBoard();
		boardView = new ChessBoardView(board);
		boardView.setVisible(true);
	}
	
	public void printBoard(){
		for (int i = 0; i < 8; i++){
			System.out.println();
			for (int j = 0; j < 8; j++){
				System.out.println(board.getChessPiece(i,j).toString() + '\t');
			}
		}
	}
	
	public void move(int oldX,int oldY,int deltaX, int deltaY){
		ChessPiece toMove = board.getChessPiece(oldX, oldY);
		ChessPiece toSwitch = board.getChessPiece(deltaX, deltaY);
		board.setSquare(toSwitch,oldX,oldY);
		board.setSquare(toMove, deltaX, deltaY);
	}
	
	
	
}
