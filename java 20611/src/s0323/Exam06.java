package s0323;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		//if (a % 2 ==0) System.out.println(a+"은(는) 짝수입니다.");
		//else System.out.println(a+"은(는) 홀수입니다.");
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("a:");
		a = sc.nextInt();
		
		System.out.print("b:");
		b = sc.nextInt();
		
		System.out.print("연산자:");
		char c = (char)sc.next().charAt(0);
		
		if(c == '+')
			System.out.println(a +"+"+b+"="+(a+b));
		else if(c == '-')
			System.out.println(a +"-"+b+"="+(a-b));
		else if(c == '*')
			System.out.println(a +"*"+b+"="+(a*b));
		else if(c == '/')
			System.out.println(a +"/"+b+"="+(a/b));
		else
			System.out.println("사칙연산자가 아닙니다.");	
	}

}
