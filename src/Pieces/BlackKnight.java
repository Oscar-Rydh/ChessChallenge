package Pieces;
import java.awt.Image;
import java.io.IOException;


public class BlackKnight extends Knight{

	public BlackKnight() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Image getPieceModell() throws IOException {
		// TODO Auto-generated method stub
		return PieceModells.BLACKKNIGHT();
	}

	@Override
	public ChessPiece getPiece() {
		// TODO Auto-generated method stub
		return this;
	}

}
