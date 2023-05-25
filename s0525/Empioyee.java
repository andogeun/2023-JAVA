package s0525;

public class Empioyee {
	private String name;
	private int no;
	private int age;
	
	public Empioyee() {}
	public Empioyee(String name, int no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNo() {
		return no;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "[이름]: " + name + "[번호]: " + no + "[나이]: " + age;
	}
	
	void print() {
		System.out.println("직원 정보: "+ toString());
	}
}
