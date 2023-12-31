package chessProperties;

import boardGameProperties.Position;

public class ChessPosition {

	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if(isValid(column,row))
		{
			throw new ChessException ("Error while instancing chess position. The positions is not valid!");
		}
		this.column = column;
		this.row = row;
	}
	
	public char getColumn() {
		return column;
	}



	public void setColumn(char column) {
		this.column = column;
	}



	public int getRow() {
		return row;
	}



	public void setRow(int row) {
		this.row = row;
	}


	public boolean isValid(char column, int row)
	{
		return column < 'a' || column > 'h' || row < 1 || row > 8 ;
	}
	
	protected Position newPosition()
	{
		return new Position(8-row,column -'a');
	}
	
	protected static ChessPosition fromPosition (Position position)
	{
		return new ChessPosition((char)('a' - position.getCollumn()),8 - position.getRow());
	}
	
	@Override
	public String toString()
	{
		return "" + column + row;
	}
	
}
