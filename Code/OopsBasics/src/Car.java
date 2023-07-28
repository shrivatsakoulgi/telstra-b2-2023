
public class Car {	

	private String carName;
	private String fuelType;
	private double engineCapacity;
	private double mileage;
	private double power;	
	
	public Car() {
	}
	public Car(String carName, String fuelType, double engineCapacity, double mileage, double power) {	
		this.carName = carName;
		this.fuelType = fuelType;
		this.engineCapacity = engineCapacity;
		this.mileage = mileage;
		this.power = power;
	}	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("In Finalize block of Car class..");
		System.out.println("Called Before GC..");
	}
	
	public String getCarName() {
		return this.carName;
	}
	
	public void setCarName(String carName) {
		this.carName=carName;
	}
	
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public double getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public static String getBsStage() {
		return bsStage;
	}
	public static void setBsStage(String bsStage) {
		Car.bsStage = bsStage;
	}
	public void accelerate() {
		System.out.println(carName+" Car is accelerating...");
	}	
	public void applyBrakes() {
		System.out.println(carName+" Car is slowing/stopping...");
	}	
	public void changeGears() {
		System.out.println("Shifting the Gears for Car "+carName);
	}	
	public void steer() {
		System.out.println("Changing the directions for Car "+carName);
	}
	

	public static String bsStage="BS6";
	
	public static void someMethod() {
		System.out.println("Inside Static Method of Car..");
	}
	
	@Override
	public String toString() {
		return "carName=" + carName + ", fuelType=" + fuelType + ", engineCapacity=" + engineCapacity
				+ ", mileage=" + mileage + ", power=" + power;
	}
	
	
}
