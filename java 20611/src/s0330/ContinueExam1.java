package s0330;

import java.util.Scanner;

public class ContinueExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�:");
		a=sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			if(i==a)continue;
			System.out.print(i+"\t");
		}
	}

}
