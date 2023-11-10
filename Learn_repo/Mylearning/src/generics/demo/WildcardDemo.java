package generics.demo;
import java.util.*;

class Vehicle {
	private int vehicleId ;

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + "]";
	}

	public Vehicle(int vehicleId) {
		super();
		this.vehicleId = vehicleId;
	}

	public int getVehicleId() {
		return vehicleId;
	}
	
}

class Car extends Vehicle{
	private  int carId;

	@Override
	public String toString() {
		return "car [carId=" + carId + "]";
	}

	public Car(int id,int carId) {
		super(id);
		this.carId = carId;
	}

	public int getCarId() {
		return carId;
	}

	
}


public class WildcardDemo {
	public static void main(String arg[]) {
		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle(1));
		list.add(new Car(12,2));
		list.add(new Vehicle(10));
		list.add(new Car(4,5));
		
		new WildcardDemo().printList(list);
	}
//	public void printList(List<? extends Vehicle>list) {//upperbound
//		for(Object o : list) {
//			System.out.println(o);
//		}
//	}
	
	public void printList(List<? super Car>list) {//lowerbound
	for(Object o : list) {
		System.out.println(o);
	}
}
}
