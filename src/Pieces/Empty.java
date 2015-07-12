package Pieces;
import java.awt.Image;
import java.io.IOException;


public class Empty extends ChessPiece{

	public Empty() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Image getPieceModell() throws IOException {
		// TODO Auto-generated method stub
		return PieceModells.EMPTY();
	}

	@Override
	public ChessPiece getPiece() {
		return this;
	}

	public String toString(){
		return "EMPTY";
	}
}
