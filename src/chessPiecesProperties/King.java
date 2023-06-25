package chessPiecesProperties;

import boardGameProperties.Board;
import chessProperties.ChessPiece;
import chessProperties.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
		
	}
	
	@Override
	public String toString()
	{
		return "K";
	}
	
	
}