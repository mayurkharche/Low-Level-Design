package com.chess;

import java.util.List;

public class Chess {

	ChessBoard chessBoard;
	Player[] players;
	Player currentPlayer;
	List<Move> moves;
	GameStatus gameStatus;
	
	public boolean playerMove(CellPosition fromPosition, CellPosition toPosition, Piece piece) {
		
		//Implement the logic
		
		changeTurn();
		return true;}
	public boolean endGame() {return false;}
	private void changeTurn() {};
}
