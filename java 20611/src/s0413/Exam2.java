package s0413;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----1번-----");
		for(int i = 1; i<=3; i++) {
			for(int j=1; j<=4; j++)
				System.out.print(j);
			System.out.print("\n");
		}
		System.out.println("-----2번-----");	
		for(int i = 1; i<=4; i++) {
			for(int j=1; j<=3; j++)
				System.out.print(i);
			System.out.print("\n");
		}
		System.out.println("-----3번-----");	
		for(int i = 1; i<=4; i++) {
			for(int j=1; j<=i; j++)
				System.out.print(j);
			System.out.print("\n");
		}
		System.out.println("-----4번-----");	
		for(int i = 3; i>=1; i--) {
			for(int j=i; j>=1; j--)
				System.out.print("*");
			System.out.print("\n");
		}
		System.out.println("-----5번-----");	
		for(int i = 3; i>=1; i--) {
			for(int j=1; j<=i; j++)
				System.out.print(j);
			System.out.print("\n");
		}
		System.out.println("-----6번-----");	
		for(int i = 1; i<=3; i++) {
			for(int j=3; j>=i; j--)
				System.out.print(i);
			System.out.print("\n");
		}	
	}
	

}
