package s0525;

public class EmpioyeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empioyee e1 = new Empioyee();
		e1.setName("이도령");
		e1.setNo(100);
		e1.setAge(25);
		System.out.println("[직원 정보] " + e1.toString());
		
		Empioyee e2 = new Empioyee("성춘향", 200 ,18);
		System.out.println("[직원 정보] " + e2.toString());
		
		e1.setNo(300);
		System.out.println(e1.getName() + "님의 사번이 "
				+ e1.getNo() + "으로 변경됨.");
		System.out.println("[직원 정보] " + e1.toString());
		
		e2.setNo(20);
		System.out.println(e2.getName() + "님의 사번이 "
				+ e2.getNo() + "으로 변경됨.");
		System.out.println("[직원 정보] " + e2.toString());
	}

}
