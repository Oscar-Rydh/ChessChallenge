package Pieces;
import java.awt.Image;
import java.io.IOException;


public class BlackPawn extends Pawn{

	public BlackPawn() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Image getPieceModell() throws IOException {
		// TODO Auto-generated method stub
		return PieceModells.BLACKPAWN();
	}

	@Override
	public ChessPiece getPiece() {
		// TODO Auto-generated method stub
		return this;
	}

}
