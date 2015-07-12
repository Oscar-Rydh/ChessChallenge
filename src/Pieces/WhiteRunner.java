package Pieces;
import java.awt.Image;
import java.io.IOException;


public class WhiteRunner extends Runner{

	public WhiteRunner() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Image getPieceModell() throws IOException {
		// TODO Auto-generated method stub
		return PieceModells.WHITERUNNER();
	}

	@Override
	public ChessPiece getPiece() {
		// TODO Auto-generated method stub
		return this;
	}

}
