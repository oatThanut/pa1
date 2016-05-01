package converter;
/**
 * This class is used to convert the value that user input on the field
 * @author Thanut Sajjakulnukit (5810545416)
 *
 */
public class UnitConverter {
	private UnitFactory unitFactory = UnitFactory.getInstance();
	
	/**
	 * 
	 * @param amount is the user's input value that they want to convert to other unit
	 * @param fromUnit is the unit of the value that user type in
	 * @param toUnit is the unit that user want to convert to
	 * @return Value that calculated to the unit that user want to know
	 */
	public double convert(double amount, Unit fromUnit, Unit toUnit){
		return (amount*fromUnit.getValue())/toUnit.getValue(); 
	}
	
	 /**
	  * 
	  * @return array of all unit of unit type that user choose
	  * @param unit is type of unit that user choose
	  */
	public Unit[] getUnits(UnitType unit){
		return unitFactory.getUnits(unit);
	}
	
	
}
