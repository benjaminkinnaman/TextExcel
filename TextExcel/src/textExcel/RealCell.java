// @author Benjamin Kinnaman
// @version March 2019



package textExcel;

public class RealCell implements Cell {

	private String valueText;

	public RealCell(String text) {
		valueText = text;

	}
	
	//text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
		String tempText = getDoubleValue() + "          ";
		return tempText.substring(0,10);
	}

	public String fullCellText() {	//Use valuetext?	
		return valueText;
	}
	
	

	//converts the calculated value of the cell as a double
	//acts as getter for double field
	
	public double getDoubleValue() {
		return Double.parseDouble(valueText);
	}

}
