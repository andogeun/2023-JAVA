package s0330;

import java.util.Scanner;

public class ForExam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력:");
		a=sc.nextInt();
		for(int i=a; i>0; i--) {
			for(int j=1; j<=i; j++)
				System.out.print("*"+"\t");
			System.out.print("\n");
		}
	}

}
