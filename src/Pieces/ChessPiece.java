package Pieces;
import java.awt.Image;
import java.io.IOException;
import java.util.Observable;


public abstract class ChessPiece extends Observable{
	
	
	public ChessPiece(){
		
	}
	
	public abstract ChessPiece getPiece();
	
	public abstract Image getPieceModell() throws IOException;
	
	
}
