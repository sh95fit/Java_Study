package JavaStudy01;

import java.awt.Toolkit;

//Task 1
public class Java50_2 implements Runnable{

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
