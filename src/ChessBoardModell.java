import java.util.Observable;

import Pieces.BlackKing;
import Pieces.BlackKnight;
import Pieces.BlackPawn;
import Pieces.BlackQueen;
import Pieces.BlackRunner;
import Pieces.BlackTower;
import Pieces.ChessPiece;
import Pieces.Empty;
import Pieces.WhiteKing;
import Pieces.WhiteKnight;
import Pieces.WhitePawn;
import Pieces.WhiteQueen;
import Pieces.WhiteRunner;
import Pieces.WhiteTower;


public class ChessBoardModell{
	private ChessPiece[][]  chessBoard;
	
	public ChessBoardModell(){
		chessBoard = new ChessPiece[8][8];
	}
	
	public ChessPiece getChessPiece(int x, int y){
		return chessBoard[x][y];
	}
	
	public void setSquare(ChessPiece square ,int x, int y){
		chessBoard[x][y]  = square;
	}
	
	public void fillBoard(){
		chessBoard[0][0] = new BlackTower();
		chessBoard[0][1] = new BlackKnight();
		chessBoard[0][2] = new BlackRunner();
		chessBoard[0][3] = new BlackQueen();
		chessBoard[0][4] = new BlackKing();
		chessBoard[0][5] = new BlackRunner();
		chessBoard[0][6] = new BlackKnight();
		chessBoard[0][7] = new BlackTower();
		chessBoard[1][0] = new BlackPawn();
		chessBoard[1][1] = new BlackPawn();
		chessBoard[1][2] = new BlackPawn();
		chessBoard[1][3] = new BlackPawn();
		chessBoard[1][4] = new BlackPawn();
		chessBoard[1][5] = new BlackPawn();
		chessBoard[1][6] = new BlackPawn();
		chessBoard[1][7] = new BlackPawn();
		chessBoard[6][0] = new WhitePawn();
		chessBoard[6][1] = new WhitePawn();
		chessBoard[6][2] = new WhitePawn();
		chessBoard[6][3] = new WhitePawn();
		chessBoard[6][4] = new WhitePawn();
		chessBoard[6][5] = new WhitePawn();
		chessBoard[6][6] = new WhitePawn();
		chessBoard[6][7] = new WhitePawn();
		chessBoard[7][0] = new WhiteTower();
		chessBoard[7][1] = new WhiteKnight();
		chessBoard[7][2] = new WhiteRunner();
		chessBoard[7][3] = new WhiteQueen();
		chessBoard[7][4] = new WhiteKing();
		chessBoard[7][5] = new WhiteRunner();
		chessBoard[7][6] = new WhiteKnight();
		chessBoard[7][7] = new WhiteTower();
		
		for(int i = 2; i < 6; i++){
			for(int j = 0; j < 8; j++){
				chessBoard[i][j] = new Empty();
			}
		}
		
		
	}
	
	
}
