package converter;

/**
 * Enum of area
 * @author Thanut Sajjakulnukit (5810545416)
 *
 */
public enum Area implements Unit {
	SQUAREMETER("SquareMeter",1.0),
	SQUARECENTIMETER("SquareCentimeter",0.0001 ),
	SQUAREKILOMETER("SquareKilometer",1000000.0 ),
	ACRE("Acre",4046.86 ),
	OXGANG("Oxgang",60000.0),
	RAI("Rai",1600.0);
	
	/** name of this unit*/
	public final String name;
	
	/** multiplier to convert this unit to std unit*/
	public final double value;
	
	/** Private constructor for enum members */
	Area(String name, double value){
		this.name = name;
		this.value = value;
	}
	
	/**
	 * @return return the value of area in from of square meter unit
	 */
	public double getValue(){return value;}
	
	/**
	 * @return return the name of it's unit
	 */
	public String toString(){return name;}
}
