package s0330;

import java.util.Scanner;

public class ForExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�:");
		N=sc.nextInt();
		int even_sum = 0, odd_sum = 0;
		
		for(int i=1; i<=N; i++)
			if(i%2==0) even_sum+=i;
			else odd_sum+=i;
		System.out.println("1���� " +N+"������ ¦�� ����"+ even_sum
				+"�̰�, Ȧ�� ����"+odd_sum+"�Դϴ�.");
		
	}

}
