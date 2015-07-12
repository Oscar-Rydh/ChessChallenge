package Pieces;
import java.awt.Image;
import java.io.IOException;


public class BlackRunner extends Runner{

	public BlackRunner() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Image getPieceModell() throws IOException {
		// TODO Auto-generated method stub
		return PieceModells.BLACKRUNNER();
	}

	@Override
	public ChessPiece getPiece() {
		// TODO Auto-generated method stub
		return this;
	}

}
