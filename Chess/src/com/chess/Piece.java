package com.chess;

import java.util.List;

public abstract class Piece {

	Color color;
	
	abstract boolean move(CellPosition fromPosition, CellPosition toPosition);
	abstract List<CellPosition> possibleMoves(CellPosition fromPosition, CellPosition toPosition);
	abstract boolean validate(CellPosition fromPosition, CellPosition toPosition);
}
