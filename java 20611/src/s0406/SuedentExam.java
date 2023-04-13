package s0406;

public class SuedentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student kim = new Student();
		Student an; 
		an = new Student();
		
		
		kim.name = "안도근";
		kim.number = 20611;
		kim.phone = "010-3161-4816";
		kim.School="서로고";
		System.out.println("이름:" + kim.name);
		System.out.println("번호:" + kim.number);
		System.out.println("전화:" + kim.phone);
		System.out.println("학교 이름:"+kim.School);
		
		an.name = "김아무개";
		an.number = 11100;
		an.phone = "011-294-4816";
		System.out.println("이름:" + an.name);
		System.out.println("번호:" + an.number);
		System.out.println("전화:" + an.phone);
		System.out.println("학교 이름:"+an.School);
		System.out.println("총 학생 수:"+Student.count);
		
		
		
		
		
	}

}
