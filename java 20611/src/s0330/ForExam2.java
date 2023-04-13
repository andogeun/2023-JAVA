package s0330;

import java.util.Scanner;

public class ForExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력:");
		N=sc.nextInt();
		int even_sum = 0, odd_sum = 0;
		
		for(int i=1; i<=N; i++)
			if(i%2==0) even_sum+=i;
			else odd_sum+=i;
		System.out.println("1부터 " +N+"까지의 짝수 합은"+ even_sum
				+"이고, 홀수 합은"+odd_sum+"입니다.");
		
	}

}
