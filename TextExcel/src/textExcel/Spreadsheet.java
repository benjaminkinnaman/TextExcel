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
		//make instance of location
		//call inspection
		//assign value
		//clear sheet
		//clear cell
		return getGridText();//"";
	}

	public int getRows()
	{
	
		return 20;
	}

	public int getCols()
	{
		
		return 12;
	}

	public Cell getCell(Location loc)	//completed for 
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
		gridText = gridText + "\n";
		
		for (int i = 0; i < numRows; i++) {	//for numRows	//TODO: We need to check the length of the row number and fix issues there
			
			gridText = gridText + Integer.toString(i + 1);	//adds the row number. adds 1 since the count falls behind
			
			int spacesNeededAfterRowNum = 3 - Integer.toString(i).length(); //Subtracts calculation of how long the row number is from 3
			
			for (int spaceNeedLoopCount = 0; spaceNeedLoopCount < spacesNeededAfterRowNum; spaceNeedLoopCount++) {	//loop to add spaces
				gridText = gridText + " ";		//Loops adds spaces specified by variable.
			}	//end of adding spaces
			
			gridText = gridText + "|";
			for (int columnCount = 1; columnCount < numColumns; columnCount++) {	//Checks for each column of this row
				gridText = gridText +  sheet[i][columnCount].abbreviatedCellText() + "|";	//use abbreviatedCellText to get value
			}	//endOf column check
			
			gridText = gridText + "\n";
		}	//for numRows
		
		return gridText;
	}

}
