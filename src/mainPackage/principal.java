package mainPackage;

import java.util.Scanner;

import chessProperties.ChessMatchProperties;
import chessProperties.ChessPiece;
import chessProperties.ChessPosition;

public class principal {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);	
	ChessMatchProperties chessMatch = new ChessMatchProperties();
	
	while(true){
	UserInterface.printBoard(chessMatch.getPieces());
	System.out.println("");
	System.out.print("Source:");
	ChessPosition source = UserInterface.readChessPosition(sc);
	
	System.out.println();
	System.out.print("Target:");
	ChessPosition target = UserInterface.readChessPosition(sc);
	
		ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
	}
	}


}
