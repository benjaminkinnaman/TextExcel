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
		
		return "";
	}

	public int getRows()
	{
	
		return 20;
	}

	public int getCols()
	{
		
		return 12;
	}

	public Cell getCell(Location loc)
	{
		int row = loc.getRow();
		int col = loc.getCol();
		return sheet [row][col];	
	}

	public String getGridText()
	{
		String gridText = "   |";
		for (int i = 1; i < numColumns; i++) {							//Run this loop for each column.
			char conversion = (char)(i + 64);							//Convert Numeric value to a char (probably won't work)
			gridText = gridText + conversion + "         " + "|";		//Adds the char and nine spaces, as well as a blockade
		}
		gridText = gridText + "/n";
		for (int i = 1; i < numRows; i++) {						//TODO: We need to check the length of the row number and fix issues there
			gridText = gridText + Integer.toString(i);
			//Add as many spaces as needed
			gridText = gridText + "|";
			for (int columnCount = 1; columnCount < numColumns; columnCount++) {	//Checks for each column of this row
				
			}
		}
		
		return null;
	}

}
