package Pieces;
import java.awt.Image;
import java.io.IOException;


public class WhiteKing extends King{

	public WhiteKing() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Image getPieceModell() throws IOException {
		// TODO Auto-generated method stub
		return PieceModells.WHITEKING();
	}

	@Override
	public ChessPiece getPiece() {
		// TODO Auto-generated method stub
		return this;
	}

}
