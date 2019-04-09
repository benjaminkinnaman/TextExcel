package textExcel;

public class FormulaCell extends RealCell {

	private Spreadsheet sheet;

	public FormulaCell(String text, Spreadsheet sheet) {
		super(text);
		this.sheet = sheet;
	}
	//text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
		String tempText = getDoubleValue() + "          ";
		return tempText.substring(0,10);
	}

	
	

	//converts the calculated value of the cell as a double
	//acts as getter for double field
	
	public double getDoubleValue() {
		String text = fullCellText();
		String[] splitFormula = text.split(" ");
		double answer = Double.parseDouble(splitFormula[1]);
		
		if (splitFormula[1].equals("SUM")) {
			
		} else if (splitFormula[1].equals("AVG")) {
			
		} else {
		for (int i = 2; i < splitFormula.length - 1; i+=2) {
				if (splitFormula[i].equals("+")) {
					answer += Double.parseDouble(splitFormula[i+1]);
				} else if (splitFormula[i].equals("-")) {
					answer -= Double.parseDouble(splitFormula[i+1]);
				} else if (splitFormula[i].equals("*")) {
					answer *= Double.parseDouble(splitFormula[i+1]);
				} else if (splitFormula[i].equals("/")) {
					answer /= Double.parseDouble(splitFormula[i+1]);
				}
			}
		}
			
		return answer;
	}

	public double checkCell (String checkMe) {
		String numbers = ("0123456789");
		if (numbers.contains(checkMe.substring(0))) {
			SpreadsheetLocation loc = new SpreadsheetLocation(checkMe);
		}
		return 0;
	}
}
