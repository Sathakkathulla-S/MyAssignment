package assignment.day1;

public class Car {
	
	public void driveCar() {
		System.out.println("Car is Running");
	}
	public void applyBrake() {
		System.out.println("Car is Stopped");
	}
	
	public void soundHorn() {
		System.out.println("Apply Horn");
	}
	
	public void isPuncture() {
		System.out.println("Is Puncture");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car vehicle=new Car();
		vehicle.applyBrake();
		vehicle.driveCar();
		vehicle.isPuncture();
		vehicle.soundHorn();
	}

}


