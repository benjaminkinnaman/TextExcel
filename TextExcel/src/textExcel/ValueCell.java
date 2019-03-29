package textExcel;

public class ValueCell extends RealCell {
	
	private String value;
	private double rawNumber;
	
	public ValueCell(String text) {
		super(text);
		rawNumber = Double.parseDouble(text);
		value = Double.toString(rawNumber);
	}

	public String abbreviatedCellText() {
	
		String temp = value.substring(1,value.length()-1);
		temp += "          ";
		return temp.substring(0,10);
	}

	public String fullCellText() {
		
		return value;
	}
	
}
