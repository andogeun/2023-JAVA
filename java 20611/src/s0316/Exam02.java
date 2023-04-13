package s0316;

public class Exam02 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		if(str1 == str2)
			System.out.println("same");
		else
			System.out.println("defferent"); 
		
		String str3 = "abc";
		String str4 = "abc";
		if(str3==str4)
			System.out.println("same");
		else
			System.out.println("defferent");
		
		str3 ="qqq";
				System.out.println(str4);
	}

}
