
public class SUV extends Car{
	
	private String driveMode;
	private boolean sunRoof;

	
	public SUV() {
		super();
	}

	
	public SUV(String carName, String fuelType, double engineCapacity,
			double mileage, double power, String driveMode, boolean sunRoof) {
		super(carName, fuelType, engineCapacity, mileage, power);
		this.driveMode=driveMode;
		this.sunRoof=sunRoof;
	}

	public String getDriveMode() {
		return driveMode;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("In Finalize block of SUV.");
		
	}
	public void setDriveMode(String driveMode) {
		this.driveMode = driveMode;
		if(this.driveMode.equalsIgnoreCase("ECO")) {
			;
			this.setPower(85.25);
		}else if(this.driveMode.equalsIgnoreCase("CITY")) {
			this.setPower(105.2);
		}else if(this.driveMode.equalsIgnoreCase("SPORTS")) {
			this.setPower(145.6);
		}else {
			System.out.println("Invalid Drive Mode Input..!!");
			System.out.println("Exiting the Program..!!!");
			System.exit(0);
		}
		System.out.println("Drive Mode changed to: "+this.driveMode);
		System.out.println("Updated Power of Car is: "+this.getPower()+" BHP");
	}

	public boolean isSunRoof() {
		return sunRoof;
	}

	public void setSunRoof(boolean sunRoof) {
		this.sunRoof = sunRoof;
	}
	

	// Overrided Accelerate Method
	public void accelerate() {
		if(this.driveMode.equalsIgnoreCase("ECO")) {
			System.out.println(getCarName()+" Car is accelerating Slowly in "+driveMode+" Mode");
		} else if(this.driveMode.equalsIgnoreCase("CITY")) {
			System.out.println(getCarName()+" Car is accelerating Moderately in "+driveMode+" Mode");
		} else {
			System.out.println(getCarName()+" Car is accelerating Rapidly in "+driveMode+" Mode");
		}
	}

	@Override
	public String toString() {
		return super.toString()+ ", driveMode=" + driveMode + ", sunRoof=" + sunRoof;
	}
	
	
}
