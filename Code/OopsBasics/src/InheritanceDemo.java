
public class InheritanceDemo {

	public static void main(String[] args) {
		Car car=new Car();
		System.out.println("Car HashCode: "+car.hashCode());
		System.out.println();
		Sedan verna = new Sedan
				("Hyundai Verna", "Diesel",
				1500, 15.6, 125.3, 450, 6);
		
		//verna.displayCarFeatures();
		System.out.println(verna);
		verna.accelerate();
		verna.applyBrakes();
		verna.changeGears();
		System.out.println("Verna HashCode: "+verna.hashCode());
		
		
		System.out.println();
		SUV harrier = new SUV("Tata Harrier", "Diesel", 2200, 9.5, 145.6, "Sports", true);
	//	harrier.displayCarFeatures();
		harrier.accelerate();
		harrier.setDriveMode("ECO");
		harrier.accelerate();
		System.out.println("Harrier HashCode: "+harrier.hashCode());
		System.out.println(harrier); // toString() method of Object class
		
	}

}
