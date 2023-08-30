package s0830;


class BeepTask implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.print(".");
			try {Thread.sleep(1);}
			catch(InterruptedException e) {}
		}
		
	}
	
}

public class BeepPrintEx2 {


	public static void main(String[] args) {
		//runnable을 구현한 클래스의 인스턴스 생성
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i=0; i<10;i++) {
			System.out.print("*");
			try {Thread.sleep(1);}
			catch(InterruptedException e) {}
	}	
	}

}
