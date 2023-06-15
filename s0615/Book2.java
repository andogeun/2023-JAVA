package s0615;

public class Book2 {
	String title;
	String writer;
	void printBook() {
		System.out.println("도서명: " + title + " 작가: " + writer);
		
	}
}

class Cartoon extends Book2{
	boolean webtoon;
	
	@Override
	void printBook() {
		super.printBook();
		if(webtoon) {
			System.out.println("이 만화는 웹툰");
		}else {
			System.out.println("웹툰 아님");
		}
	}
}

class Major extends Book2{
	String subject;
	
	@Override
	void printBook() {
		super.printBook();
		System.out.println("전공분야는 " + subject + "입니다");
	}
}