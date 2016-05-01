package converter;
	
	/**
	 * This class is an interface, template of other unit class
	 * @author Thanut Sajjakulnukit (5810545416)
	 *
	 */
	public interface Unit {
	/**
	 * 
	 * @return return the value of a standard unit
	 */
	public double getValue();
	
	/**
	 * 
	 * @return return a printable name of the unit
	 */
	public String toString();
}
