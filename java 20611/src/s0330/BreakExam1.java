package s0330;

import java.util.Scanner;

public class BreakExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자 입력:");
		a=sc.nextInt();
		
		for(int i=1; i<=100; i++) {
			System.out.print(i+"\t");
			if(i==a)break;
		}
	}

}
