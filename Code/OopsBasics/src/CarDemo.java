
public class CarDemo {

	public static void main(String[] args) {

		Car swift = new Car("Suzuki Swift","Petrol",1198.6,23.2,96.3);

		//swift.displayCarFeatures();
		System.out.println(swift);
		swift.accelerate();
		swift.changeGears();
		swift.steer();
		swift.applyBrakes();
		System.out.println();
		
		Car nexon = new Car("Tata Nexon","Diesel",1496.8,17.6,125.6);
	//	nexon.displayCarFeatures();
		System.out.println(nexon);
		nexon.accelerate();
		nexon.changeGears();
		nexon.steer();
		nexon.applyBrakes();
		
		// Using Getter-Setter
		nexon.setFuelType("Power Diesel");
		nexon.setMileage(nexon.getMileage()+1.5);
		System.out.println("\n\n After Modification...");
		//nexon.displayCarFeatures();
		System.out.println(nexon);
		
	}

}
