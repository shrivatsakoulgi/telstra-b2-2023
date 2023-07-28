
public class PolymorphismDemo {

	public static void main(String[] args) {
		
		Car car = new Car("My Car","Petrol",1198.6,23.2,96.3);
		System.out.println(car.getClass());
		System.out.println(car.hashCode());
		car.accelerate();
		
		Sedan sedan = new Sedan("Sedan Car", "Diesel",1500, 15.6, 125.3, 450, 6);
		System.out.println(sedan.getClass());
		//System.out.println(car.hashCode());
		sedan.accelerate();
		
		SUV suv = new SUV("My SUV", "Diesel", 2200, 9.5, 145.6, "Sports", true);
		System.out.println(suv.getClass());
		//System.out.println(car.hashCode());
		suv.accelerate();
		
		System.out.println();
		car = new Sedan("Another Sedan Car", "Diesel",1500, 15.6, 125.3, 450, 6);
		System.out.println(car.getClass());
		System.out.println(car.hashCode());
		car.accelerate();
		
		car = new SUV("Another SUV", "Diesel", 2200, 9.5, 145.6, "Sports", true);
		System.out.println(car.hashCode());
		System.out.println(car.getClass());
		car.accelerate();
		
		for(int i=0;i<10;i++) {
			car=new SUV();
			System.out.println(car.hashCode());
		}
		System.gc();
	}

}
