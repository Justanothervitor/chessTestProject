package boardGameProperties;

public class Board {

	private int rows;
	private int columns;
	private Piece [][] pieces;
	
	
	public Board () 
	{
		
	}
	
	public Board(int rows, int columns)
	{
		if(rows <1 || columns < 1)
		{
		throw new BoardException("Error creating a board!\n The value of rows and or columns is lower than 1");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	public Piece piece(int row, int column)
	{
		if(!positionExists(row, column))
		{
			throw new BoardException ("Position not exists!");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position)
	{
		if(!positionExists(position))
		{
			throw new BoardException ("Position not exists!");
		}
		return pieces[position.getRow()][position.getCollumn()];
	}
	
	public void placeAPiece (Piece piece, Position position)
	{
		if (thereIsAPiece(position))
		{
			throw new BoardException("There is already a piece in that position");
		}
		pieces [position.getRow()][position.getCollumn()] = piece;
		piece.position = position;
	}
	
	public Piece removeAPiece (Position position)
	{
		if(!positionExists(position))
		{
			throw new BoardException ("Position not exists!");
		}
		
		if (piece(position)== null)
		{
			return  null;
		}
		
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getCollumn()] = null;
		return aux;
	}
	
	public boolean positionExists(int row, int column)
	{
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	public boolean positionExists(Position position) 
	{	
		return positionExists(position.getRow(),position.getCollumn());	
	}

	
	public boolean thereIsAPiece(Position position)
	{
		if(!positionExists(position))
		{
			throw new BoardException ("Position not exists!");
		}
		return piece(position) != null;
	}
	
}
