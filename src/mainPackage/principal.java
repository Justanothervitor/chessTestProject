package mainPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

import chessProperties.ChessException;
import chessProperties.ChessMatchProperties;
import chessProperties.ChessPiece;
import chessProperties.ChessPosition;

public class principal {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);	
	ChessMatchProperties chessMatch = new ChessMatchProperties();
	
	while(true){
		try {
			UserInterface.printBoard(chessMatch.getPieces());
			System.out.println("");
			System.out.print("Source:");
			ChessPosition source = UserInterface.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target:");
			ChessPosition target = UserInterface.readChessPosition(sc);
			UserInterface.cleanScreen();
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
		catch(ChessException e){
			System.out.println(e.getMessage());
			sc.nextLine();
		}
		catch(InputMismatchException e){
			System.out.println(e.getMessage());
			sc.nextLine();
		}
		
		}
	}


}
