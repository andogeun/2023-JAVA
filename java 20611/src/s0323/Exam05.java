package s0323;

public class Exam05 {

	public static void main(String[] args) {
		int a[][] = new int[2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 10;
		a[1][1] = 20;
		a[1][2] = 30;
		
		for(int i =0; i< a.length; i++)
			for(int j =0; j< a[i].length; j++)
				System.out.print(a[i][j] + "\t");
		
		int b[][] = {{1,2},{3,4},{5,6}};  //3��2��
		System.out.println(b.length);
		System.out.println(b[1].length);
		
		System.out.println("---------------------------------");
		
		System.out.println(5.5/2);
		System.out.println(5.5%2);
		System.out.println(5.5!=2);
		
	}

}
