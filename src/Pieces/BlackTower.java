package Pieces;
import java.awt.Image;
import java.io.IOException;


public class BlackTower extends Tower{

	public BlackTower() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Image getPieceModell() throws IOException {
		// TODO Auto-generated method stub
		return PieceModells.BLACKTOWER();
	}

	@Override
	public ChessPiece getPiece() {
		// TODO Auto-generated method stub
		return this;
	}

}
