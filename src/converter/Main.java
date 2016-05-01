package converter;

public class Main {
	
	/**
	 * main method for run the program's UI
	 * @param args is not use
	 */
	public static void main(String[] args) {
		UnitConverter unitconverter = new UnitConverter();
		ConverterUI form = new ConverterUI(unitconverter);
		form.setVisible(true);
	}
}
