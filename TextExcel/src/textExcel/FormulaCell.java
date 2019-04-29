package textExcel;

import java.util.ArrayList;

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
		ArrayList<Double> cellValues = new ArrayList<>();
		
		if (splitFormula[1].equals("SUM")) {	//Find the sum of the range of cells added together.
			String tempCell = splitFormula[4].substring(0,2); //Takes the primary cell
			char primaryCol = tempCell.charAt(0);	//Letter	
			int  primaryRow;						//Number
			if (tempCell.substring(2).equals("-")) {	//Removes dash, if it exists, then initializes primaryRow
				tempCell = tempCell.substring(0,1);
				primaryRow = tempCell.charAt(1);
			}	else {
				primaryRow = Integer.parseInt(tempCell.substring(1,2));
			}
			//Now begins decoding the second cell request
			char secondaryCol;
			int  secondaryRow;
			
			if (primaryRow <= 9 && (splitFormula[4].length() == 5)) {	//Primary is single digit, Secondary single
				secondaryCol = splitFormula[4].charAt(3);
				secondaryRow = splitFormula[4].charAt(4);
			}	else if (primaryRow > 9 && (splitFormula[4].length() == 6)) {	//Primary is double digit, Secondary single
				secondaryCol = splitFormula[4].charAt(4);
				secondaryRow = splitFormula[4].charAt(5);
			}	else if (primaryRow <= 9 && (splitFormula[4].length() == 6)) { //Primary is single digit, Secondary Double
				secondaryCol = splitFormula[4].charAt(3);
				secondaryRow = Integer.parseInt(Integer.toString(splitFormula[4].charAt(4)) + Integer.toString(splitFormula[4].charAt(5)));
			}	else if (primaryRow > 9 && (splitFormula[4].length() == 7)) { //Primary is double digit, Secondary Double
				secondaryCol = splitFormula[4].charAt(4);
				secondaryRow = Integer.parseInt(Integer.toString(splitFormula[4].charAt(5)) + Integer.toString(splitFormula[4].charAt(6)));
			}
		/*At this point in the code, we have the two cells stored in piece in variables.*/	
		
			for(int i = 0; i < (cellValues.size() - 1); i++)  {	//Adds together every element on the list.
				   int sum = (int)/*might remove, auto fix*/ (cellValues.get(i) + cellValues.get(i + 1));
				   cellValues.set(i, (double)/*<--might remove, auto fix*/ sum);
				   cellValues.remove(i + 1);
				   answer = sum;
				}
		
		} else if (splitFormula[1].equals("AVG")) {	//Find the average of the cells stated.
			//Logic: Add together, and divide by the number of cells. Code from SUM may be reusable.
			
		} else {
		//This is an arithmetic problem. Find the appropriate function and procedd with execution.
		//REMEMBER! Multiple functions may be usable. Solve in groups of two. May require recalling methods.
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
