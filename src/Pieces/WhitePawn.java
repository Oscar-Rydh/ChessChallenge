package Pieces;
import java.awt.Image;
import java.io.IOException;


public class WhitePawn extends Pawn{

	public WhitePawn() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Image getPieceModell() throws IOException {
		// TODO Auto-generated method stub
		return PieceModells.WHITEPAWN();
	}

	@Override
	public ChessPiece getPiece() {
		// TODO Auto-generated method stub
		return this;
	}

}
