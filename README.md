Kod att testa 

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Game
{
	private GameBoard board;
	private boolean running;
	private boolean turn;
	private int depth;
	private String winner
	public Game(){
		board = new GameBoard();
		turn = true;
		running = true;
		depth = 8;
		winner = "none";
	}
	
	public void run(){
		while(running){
			board.put(System.in(), System.in(), "X");
			minMax(board, depth, true);
			depth = depth--;
			
			if (board.checkForWinner("X") == 1){
				winner = "X"
				running != running;
			}
			if (board.checkForWinner("O") == 1){
				winner = "O"
				running != running;
			}
		}
		System.Out.println("The winner is" + winner);
	}
	
	private int winnerValues(){
		int checkX = checkForWinner("X");
		int checkO = checkForWinner("O");
		if checkX == 1
		return 1;
		else if checkO == 1
		return 1;
		else 
		return 0;
	}
	
	
	
	private int minMax(GameBoard board, int depth, boolean maximizingPlayer){
		if (depth == 0 || board.checkIfFull()){
			return winnerValues();
		}
		ArrayList<GameBoard> possibleStates = board.getAllPossibleState(maximizingPlayer);
		
		if (maximizingPlayer){
			int bestValue = Integer.MIN_VALUE;
			for(GameBoard possibleBoard : possibleStates){
				int value = minMax(possibleBoard, depth - 1, false)
				if bestValue < value
				return value
				else 
				return bestValue
			}
		} else {
			int bestValue = Integer.MAX_VALUE;
			for(GameBoard possibleBoard : possibleState){
				int value = minMax(possibleBoard, depth - 1, true)
				if bestValue > value
				return value
				else 
				return bestValue
		}
	}
	
}


/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class GameBoard
{
	private String[][] gameBoard;
	
	public GameBoard(){
		gameBoard = new String[3][3];
		for (int i = 0; i < 3;i++){
			for(int j = 0; j<3; j++){
				gameBoard[i][j] = ""
			}
		}
	}
	
	public boolean putPiece(int x, int y, String piece){
		if (gameBoard[x][y] != null){
			gameBoard[x][y] = piece;
			return true;
		}
		return false;
	}
	
	public String[][] getBoard(){
		return board;
	}
	
	public int checkForWinner(String piece){
		if (gameBoard[0][0].equals(gameBoard[0],[1]) &&  
			gameBoard[0][0].equals(gameBoard[0],[2] && gameBoard[0][0].equals(piece){
				return 1; 
			}
		else if (gameBoard[1][0].equals(gameBoard[1],[1]) &&  
			gameBoard[1][0].equals(gameBoard[1],[2] && gameBoard[1][0].equals(piece){
				return 1; 
			}
		else if (gameBoard[2][0].equals(gameBoard[2],[1]) &&  
			gameBoard[2][0].equals(gameBoard[2],[2] && gameBoard[2][0].equals(piece){
				return 1; 
			}
		else if (gameBoard[0][0].equals(gameBoard[1],[1]) &&  
			gameBoard[0][0].equals(gameBoard[2],[2] && gameBoard[0][0].equals(piece){
				return 1; 
			}
		else if (gameBoard[2][0].equals(gameBoard[1],[1]) &&  
			gameBoard[2][0].equals(gameBoard[0],[2] && gameBoard[2][0].equals(piece){
				return 1; 
			}
		else if (gameBoard[0][0].equals(gameBoard[1],[0]) &&  
			gameBoard[0][0].equals(gameBoard[2],[0] && gameBoard[0][0].equals(piece){
				return 1; 
			}
		else if (gameBoard[0][1].equals(gameBoard[1],[1]) &&  
			gameBoard[0][1].equals(gameBoard[1],[2] && gameBoard[0][1].equals(piece){
				return 1; 
			}
		else if (gameBoard[0][2].equals(gameBoard[1],[2]) &&  
			gameBoard[0][2].equals(gameBoard[2],[2] && gameBoard[0][2].equals(piece){
				return 1; 
			}
		else 
				return 0;
	}
	public boolean checkIfFull(){
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				if (!gameBoard[i][j].equals("X") || !gameBoard[i][j].equals("O"){
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isEmpty(int x, int y){
		return !gameBoard[x],[y].equals("X") || !gameBoard[x],[y].equals("O")
		
	}
	
	public ArrayList<GameBoard> getAllPossibleMoves(boolean maxPlayer){
		ArrayList<GameBoard> toReturn = new ArrayList<GameBoard>();
			for (int i = 0; i < 3; i++){
				for (int j = 0; j < 3; j++){
					if(isEmpty(i,j)){
						GameBoard possibleState = this;
						if(maxPlayer)
						possibleState.putPiece(i,j, "X");
						else
						possibleState.putPiece(i,j,"O");
					}
				toReturn.add(possibleState);
				}
			}
	return toReturn;
	}
	
	public void printBoard(){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 3; i++){
					sb.append(gameBoard[i][0] + '\t' + gameBoard[i][1] + '\t' + gameBoard[i][2] + '\n')
		}
		
		System.out.print(sb.toString());
}
