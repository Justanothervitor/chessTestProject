package chessProperties;

import boardGameProperties.Board;
import boardGameProperties.Position;
import chessPiecesProperties.King;
import chessPiecesProperties.Rook;

public class ChessMatchProperties {

	private Board board;

	public ChessMatchProperties() 
	{
		board = new Board(8,8);
		initialSetup();
		
	}
	
	public ChessPiece[][] getPieces()
	{
		ChessPiece [][] mat = new ChessPiece[board.getRows()][board.getColumns()]; 
		for(int i= 0;i < board.getRows();i++){
			for(int j = 0; j < board.getColumns();j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
	
		return mat;
	}
	
	private void initialSetup()
	{
		board.placeAPiece(new Rook(board,Color.WHITE), new Position(2,1));
		board.placeAPiece(new King(board,Color.BLACK), new Position(0,4));
		board.placeAPiece(new King(board,Color.WHITE), new Position(7,4));
	}
	
}
