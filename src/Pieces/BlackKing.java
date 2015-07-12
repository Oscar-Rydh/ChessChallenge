package Pieces;
import java.awt.Image;
import java.io.IOException;


public class BlackKing extends King{

	public BlackKing() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Image getPieceModell() throws IOException {
		// TODO Auto-generated method stub
		return PieceModells.BLACKKING();
	}

	@Override
	public ChessPiece getPiece() {
		// TODO Auto-generated method stub
		return this;
	}
	

}
