package textExcel;

public class FormulaCell extends RealCell {
	private String valueText;
//	private double value;
	
	//text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
		String tempText = getDoubleValue() + "          ";
		return tempText.substring(0,10);
	}

	public String fullCellText() {	//Use valuetext?	
		return valueText;
	}
	
	public FormulaCell(String text) {
		valueText = text;
//		value = Double.parseDouble(text);
	}

	//converts the calculated value of the cell as a double
	//acts as getter for double field
	
	public double getDoubleValue() {
		return Double.parseDouble(valueText);
	}

}
