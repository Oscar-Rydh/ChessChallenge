import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;

import Pieces.ChessPiece;


public class ChessPieceView extends JButton implements Observer{
	private ChessPiece chessSquare;
	
	public ChessPieceView(ChessPiece chessSquare){
		this.chessSquare = chessSquare;
		chessSquare.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		
		
	}

}
