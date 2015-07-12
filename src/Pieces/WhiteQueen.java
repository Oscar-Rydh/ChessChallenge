package Pieces;
import java.awt.Image;
import java.io.IOException;


public class WhiteQueen extends Queen{

	public WhiteQueen() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Image getPieceModell() throws IOException {
		// TODO Auto-generated method stub
		return PieceModells.WHITEQUEEN();
	}

	@Override
	public ChessPiece getPiece() {
		// TODO Auto-generated method stub
		return this;
	}

}
