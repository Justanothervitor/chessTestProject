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
	
	private void placeNewPiece(char column, int row, ChessPiece piece)
	{
		board.placeAPiece(piece, new ChessPosition (column,row).newPosition());
	}
	
	private void initialSetup()
	{
		placeNewPiece('b',6,new Rook(board,Color.WHITE));
		placeNewPiece('e',8,new King(board,Color.BLACK));
		placeNewPiece('e',1,new King(board,Color.WHITE));
	}
	
}
