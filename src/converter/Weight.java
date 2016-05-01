package converter;

/**
 * Enum of weight
 * @author Thanut Sajjakulnukit (5810545416)
 *
 */
public enum Weight implements Unit {
	GRAM("Gram",1.0),
	MILLIGRAM("Milligram             ",0.001 ),
	KILOGRAM("Kilogram",1000.0 ),
	OUNCE("Ounce(UK)",28.0 ),
	Pound("Pound(UK)",454.0 ),
	SALUENG("Salueng",3.75);
	
	/** name of this unit*/
	public final String name;
	
	/** multiplier to convert this unit to std unit*/
	public final double value;
	
	/** Private constructor for enum members */
	Weight(String name, double value){
		this.name = name;
		this.value = value;
	}
	
	/**
	 * @return return the value of area in from of gram unit
	 */
	public double getValue(){return value;}
	
	/**
	 * @return return the name of it's unit
	 */
	public String toString(){return name;}
}
