package s0615;

public class BookMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cartoon c1 = new Cartoon();
		c1.title = "순정만화";
		c1.writer = "강플";
		c1.webtoon = true;
		c1.printBook();
		
		Major m1 = new Major();
		m1.subject = "프로그래밍";
		m1.title = "자바의 정석";
		m1.writer = "남궁성";
		m1.printBook();
	}

}
