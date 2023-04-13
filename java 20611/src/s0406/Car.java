package s0406;

public class Car {
	//멤버변수
	String car_name; //차이름
	int price; //차가격
	String brand; //회사
	static int count = 0; //총 소유 차량수
	int velocity = 0;
	boolean running = false;
	
	//생성자
	Car(){
		count++;
	}
	
	//메소드
	void run() {
		running=true;
		System.out.println(car_name + "이 운행 중입니다");
	}
	void stop() {
		running=false;
		System.out.println(car_name + "이 정차 중입니다");
	}
	void vel_up(int value) { //value만큼 속도 증가
		if(!running) {
			System.out.println(car_name + "정차중 ");
			return;
		}
		
		//출력)제네시스 현재속도:50
		velocity += value;
		if(velocity>=100) {
			velocity = 100;
			System.out.println("최대속도는 100입니다.");
		}
		System.out.println(car_name + "현재 속도: " + velocity);
	}
	void vel_down(int value) { //value만큼 속도 감소
		if(!running) {
			System.out.println(car_name + "정차중 ");
			return;
		}
		
		velocity -= value;
		if(velocity<=0) {
			velocity = 0;
			System.out.println("최소속도는 0입니다.");
		}
		System.out.println(car_name + "현재 속도: " + velocity);
	}
}
