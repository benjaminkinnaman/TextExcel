//@author Benjamin Kinnaman
//@version March 4, 2019

package textExcel;

public class EmptyCell implements Cell{
	
	//constructor
	public  EmptyCell() {}
	
	
	//text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
		return "          ";
	}
	
	//text for individual cell
	
	public String fullCellText() {
	
		return "";
	}
	
	
	
	
	
	
}
