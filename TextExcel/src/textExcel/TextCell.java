package textExcel;

public class TextCell implements Cell {

	private String text;
	
	public TextCell() {
		
	}

	public String abbreviatedCellText() {
		System.out.println();
		String[] textSplit = new String[3];
		textSplit = text.split("\"");
		return textSplit[2];
	}

	public String fullCellText() {
		
		return text;
	}
	
}
