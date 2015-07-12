package Pieces;
import java.awt.Image;
import java.io.IOException;


public class WhiteKnight extends Knight{

	public WhiteKnight() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Image getPieceModell() throws IOException {
		// TODO Auto-generated method stub
		return PieceModells.WHITEKNIGHT();
	}

	@Override
	public ChessPiece getPiece() {
		// TODO Auto-generated method stub
		return this;
	}

}
