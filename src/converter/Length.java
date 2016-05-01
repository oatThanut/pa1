package converter;

/**
 * Enum of length
 * @author Thanut Sajjakulnukit (5810545416)
 *
 */
public enum Length implements Unit{
	/* Define the members of the enumeration
	 * The attributes are:
	 * name = a string name for this unit,
	 * value = multiplier to convert to meters.
	 */
	METER("Meter", 1.0),
	CENTIMETER("Centimeter            ", 0.01),
	KILOMETER("Kilometer", 1000.0),
	FOOT("Foot", 0.3048),
	MILE("Mile", 1609.344),
	WA("Wa", 2.0),
	LIGHTYEAR("Light-year", 9460730472580800.0),
	MICRON("Micron", 1.0E-6);
	
	/** name of this unit*/
	public final String name;
	/** multiplier to convert this unit to std unit*/
	public final double value;
	
	/** Private constructor for enum members */
	Length(String name, double value){
		this.name = name;
		this.value = value;
	}
	
	/**
	 * @return return the value of length in from of meter unit
	 */
	public double getValue(){return value;}
	
	/**
	 * @return return the name of it's unit
	 */
	public String toString(){return name;}
}