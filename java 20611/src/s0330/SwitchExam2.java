package s0330;

import java.util.Scanner;


public class SwitchExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc =new Scanner(System.in);
		System.out.println("정수 입력:");
		a = sc.nextInt();
		
		switch (a%3) {
		case 0: 
			System.out.println(a + "는 3의 배수");
			break;
		default:
			System.out.println(a+"는 3의 배수가 아니다.");
		}
	}
}
