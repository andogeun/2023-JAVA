package s0406;

public class Student {
	//멤버 변수: 속성
	String name;
	int number;
	String phone;
	static String School="서울로봇고";
	static int count = 0;
	//생성자
	Student(){
		count++;
		System.out.println("생성자:"+count);
		
	}
	//메소드
}
