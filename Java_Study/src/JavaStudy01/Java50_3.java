package JavaStudy01;

import java.awt.Toolkit;

//Task 2
public class Java50_3 extends Thread{
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				
			}
		}
	}
}
