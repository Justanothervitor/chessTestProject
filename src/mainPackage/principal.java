package mainPackage;

import chessProperties.ChessMatchProperties;

public class principal {
	public static void main(String args[]) {
		
	ChessMatchProperties chessMatch = new ChessMatchProperties();
	UserInterface.printBoard(chessMatch.getPieces());
	
	}
}
