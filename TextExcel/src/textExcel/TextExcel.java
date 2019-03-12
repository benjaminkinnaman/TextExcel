package textExcel;

import java.io.FileNotFoundException;
import java.util.*;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
	    // Add your command loop here
		boolean quitStatus = false;
		Spreadsheet sheet = new Spreadsheet();
	    while(quitStatus == false) {
	    	System.out.println("Enter a command.");
	    	Scanner input = new Scanner(System.in);
	    	String consoleInput = input.nextLine();
	    	if (!consoleInput.equals("quit")) {
	    		System.out.println(sheet.processCommand(consoleInput));
	    	} else {
	    		System.out.println("Program quit.");
	    		quitStatus = true;
	    	}
	}
}

}