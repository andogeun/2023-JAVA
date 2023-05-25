package s0525;

public class Student {
	
	//멤버변수
	String name;
	int grade;
	
	//생성자 : 오버로딩
	Student(){}
	Student(String n){
		name = n;
	}
	Student(String n, int g){
		name = n;
		grade = g;
	}
	
	//메소드
	void print1() {
		System.out.println("학생 이름은 " + name
				+ ", 학년은 " + grade + "학년 입니다.");
	}
	void print2() {
		System.out.println("학생 이름은 " + getName()
				+ ", 학년은 " + getGrade() + "학년 입니다.");
	}
	
	//get
	String getName() {
		return name;
	}
	int getGrade() {
		return grade;
	}
	
	//set
	void setName(String name) {
		this.name = name;
	}
	void setGrade(int grade) {
		this.grade = grade;
	}
}
