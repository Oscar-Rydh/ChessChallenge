package Pieces;
import java.awt.Image;
import java.io.IOException;


public class WhiteTower extends Tower{

	public WhiteTower() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Image getPieceModell() throws IOException {
		// TODO Auto-generated method stub
		return PieceModells.WHITETOWER();
	}

	@Override
	public ChessPiece getPiece() {
		// TODO Auto-generated method stub
		return null;
	}

}
