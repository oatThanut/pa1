package converter;

public class UnitFactory {
	
	private UnitType[] unit = new UnitType[4];
	
	private static UnitFactory instance;
	
	public static UnitFactory getInstance(){
		if(instance == null) return instance = new UnitFactory();
		else return instance;
	}
	
	public UnitType[] getUnitTypes(){
		return unit;
	}
	
	public Unit[] getUnits(UnitType uType){
		if(uType.equals(UnitType.Length)) return Length.values();
		else if(uType.equals(UnitType.Area)) return Area.values();
		else if(uType.equals(UnitType.Weight)) return Weight.values();
		else return Volume.values();
	}
}
