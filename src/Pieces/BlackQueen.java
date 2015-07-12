package Pieces;
import java.awt.Image;
import java.io.IOException;


public class BlackQueen extends Queen{

	public BlackQueen() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Image getPieceModell() throws IOException {
		// TODO Auto-generated method stub
		return PieceModells.BLACKQUEEN();
	}

	@Override
	public ChessPiece getPiece() {
		// TODO Auto-generated method stub
		return this;
	}

}
