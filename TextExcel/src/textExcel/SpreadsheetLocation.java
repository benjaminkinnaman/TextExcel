package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
    private int row;
    private int column;
       
    public SpreadsheetLocation(String cellName)
    {
    	
    	char letter = Character.toUpperCase(cellName.charAt(0));
    	int number = Integer.parseInt(cellName.substring(1));
    	column = letter - 65;
    	row = number - 1;	
    	
    }
    
    
	public int getRow()
    {
        
        return row;
    }

    public int getCol()
    {
        
        return column;
    }
    


}
