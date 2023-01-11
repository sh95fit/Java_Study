package JavaStudy01;

public class Java50_1 {

	public static void main(String[] args) {
		
		
//		인터페이스 타입 스레드 생성(Runnable 인터페이스 상속)
		Runnable beepTask = new Java50_2();
		Thread thread = new Thread(beepTask);
		
		thread.start();
		
		
//		클래스 타입 스레드 생성(Thread 클래스 상속)
		Thread thread2 = new Java50_3();
		
		thread2.start();
		
		for (int i=0; i<5; i++) {
			System.out.println("땡");
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				
			}
		}

	}

}
