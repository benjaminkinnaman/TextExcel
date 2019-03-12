package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private Cell[][] sheet;
	private int numColumns;
	private int numRows;
	
//constructor
	public Spreadsheet() {
		//Initialize a 2d array of EmptyCells
		numColumns = 12;
		numRows = 20;
		sheet = new Cell [numRows][numColumns];
		for(int row = 0; row < numRows; row++) {
			for (int col = 0; col < numColumns; col++) {
				sheet[row][col] = new EmptyCell();
			}
		}
	}

	public String processCommand(String command)
	{
		
		return null;
	}

	public int getRows()
	{
	
		return 0;
	}

	public int getCols()
	{
		
		return 0;
	}

	public Cell getCell(Location loc)
	{
		
		return null;
	}

	public String getGridText()
	{
		
		return null;
	}

}
