package s0601;

public class TruckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck mytruck = new Truck();
		mytruck.carname = "프론티어";
		mytruck.ton = 3;
		mytruck.speedUp();
		mytruck.speedUp();
		mytruck.speedUp();
		System.out.println("나의 트럭은 " + mytruck.color + "이다.");
		System.out.println(mytruck.carname + "는 " + mytruck.ton + "톤을 실을 수 있다.");
		
	}

}
