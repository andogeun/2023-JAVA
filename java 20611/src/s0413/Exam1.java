package s0413;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int [] num = new int[5];
	    int max =0;
	    
	    System.out.println("���� 5���� �Է����ּ���");
	    int i =0;
	    while(i<5) {
	    	System.out.print((i+1)+"��° ����:");
	    	num[i]=sc.nextInt();
	    	if(num[i] > max)
	    		max = num[i];
	    	i++;
	    }
	    
	    System.out.println("�Է��� ���� �� �ִ밪��"+ max +"�Դϴ�.");
	}

}
