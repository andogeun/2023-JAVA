package s0601;

public class Cafe {
	private int coffee;
	private int suger;
	private int cream;
	
	public void makeTea(int coffee, int suger, int cream) {
		this.coffee = coffee;
		this.suger = suger;
		this.cream = cream;
		
		System.out.println("밀크커피");
		System.out.println("커피 농도:" + (coffee + suger + cream));
		printTeaInfo();
	}
	
	public void makeTea(int coffee, int suger) {
		this.coffee = coffee;
		this.suger = suger;
		
		System.out.println("설탕커피");
		System.out.println("커피 농도:" + (coffee + suger));
		printTeaInfo();
	}
	
	public void makeTea(int coffee) {
		this.coffee = coffee;
		
		System.out.println("블랙커피");
		System.out.println("커피 농도:" + (coffee));
		printTeaInfo();
	}
	
	void printTeaInfo() {
		System.out.println("----[성분]----");
		System.out.println("커피:" + coffee + "       |");
		System.out.println("설탕:" + suger + "       |");
		System.out.println("크림:" + cream + "       |");
		System.out.println("-------------");
	}
}
