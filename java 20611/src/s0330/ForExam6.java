package s0330;

import java.util.Scanner;

public class ForExam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력:");
		a=sc.nextInt();
		for(int i=1; i<a; i++) {
			for(int j=1; j<=i; j++)
				System.out.print("*"+"\t");
			System.out.print("\n");
			
		}
		
	}

}
