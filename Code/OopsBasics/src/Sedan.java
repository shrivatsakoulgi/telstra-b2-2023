
public class Sedan extends Car{

	private int bootSpace;
	private int airBags;
	
	public Sedan() {
		super();
		
	}
	public Sedan(String carName, String fuelType, double engineCapacity, 
			double mileage, double power, int bootSpace, int airBags ) {
		
		super(carName, fuelType, engineCapacity, mileage, power);	// super class constructor
		this.bootSpace=bootSpace;
		this.airBags = airBags;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("In Finalize block of Sedan.");
		
	}
	
	
	//getter-setter
	public int getBootSpace() {
		return bootSpace;
	}
	public void setBootSpace(int bootSpace) {
		this.bootSpace = bootSpace;
	}
	public int getAirBags() {
		return airBags;
	}
	public void setAirBags(int airBags) {
		this.airBags = airBags;
	}
	@Override
	public String toString() {
		return super.toString()+", bootSpace=" + bootSpace + ", airBags=" + airBags;
	}
	
	@Override
	public void accelerate() {
		System.out.println("Accelerating Sedan Car / with Cruise Control..");
	}
	
	
	
}
