package s0525;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		kim.name = "김로봇";
		kim.grade = 1;
		
		Student lee = new Student("이로봇");
		lee.grade = 2;
		
		Student an = new Student("안로봇", 3);
		
		kim.print1();
		lee.print1();
		an.print1();
	}

}
