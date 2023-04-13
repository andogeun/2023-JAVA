package s0406;

public class CarExam {

	public static void main(String[] args) {
		Car redCar = new Car();
		Car blueCar = new Car();
		
		redCar.car_name = "genesis";
		redCar.price = 5000;
		redCar.brand = "Çö´ë";
		redCar.velocity = 30;
		
		blueCar.car_name = "510D";
		blueCar.price = 8000;
		blueCar.brand = "BMW";
		blueCar.velocity = 40;
		
		redCar.run();
		redCar.vel_up(10);
		redCar.vel_up(10);
		redCar.vel_down(40);
		redCar.vel_up(130);
		redCar.vel_down(40);
		redCar.stop();
		redCar.vel_down(40);
		redCar.vel_down(40);
		redCar.stop();
	}

}
