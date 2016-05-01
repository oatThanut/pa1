package converter;

/**
 * Enum of volume
 * @author Thanut Sajjakulnukit (5810545416)
 *
 */
public enum Volume implements Unit {
	CUBICMETER("CubicMeter",1.0),
	MILLILITRE("Millilitre            ",0.000001),
	LITRE("Litre",0.001  ),
	GALLON("Gallon(UK)",0.00454609  ),
	PINT("Pint(UK)",0.00056826125 ),
	KWIAN("Kwian",2.0);
	
	/** name of this unit*/
	public final String name;
	
	/** multiplier to convert this unit to std unit*/
	public final double value;
	
	/** Private constructor for enum members */
	Volume(String name, double value){
		this.name = name;
		this.value = value;
	}
	
	/**
	 * @return return the value of area in from of cubic meter unit
	 */
	public double getValue(){return value;}
	
	/**
	 * @return return the name of it's unit
	 */
	public String toString(){return name;}
}
