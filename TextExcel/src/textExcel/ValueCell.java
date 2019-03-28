package textExcel;

public class ValueCell extends RealCell {
	private String value;
	
	public ValueCell(double value) {
		this.value = Double.toString(value);
		
	}

	public String abbreviatedCellText() {
	
		String temp = text.substring(1,text.length()-1);
		temp += "          ";
		return temp.substring(0,10);
	}

	public String fullCellText() {
		
		return text;
	}
	
}
