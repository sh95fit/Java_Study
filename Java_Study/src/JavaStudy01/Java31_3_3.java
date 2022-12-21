package JavaStudy01;

public class Java31_3_3 {
//	Java31_3 frontLeftTire = new Java31_3("앞왼쪽", 6);
//	Java31_3 frontRightTire = new Java31_3("앞오른쪽", 2);
//	Java31_3 backLeftTire = new Java31_3("뒤왼쪽", 3);
//	Java31_3 backRightTire = new Java31_3("뒤오른쪽", 4);
	
	Java31_3[] tires = {
			new Java31_3("앞왼쪽", 6),
			new Java31_3("앞외른쪽", 2),
			new Java31_3("뒤왼쪽", 3),
			new Java31_3("뒤오른쪽", 4)
	};
	
	int run() {
		System.out.println("자동차가 달립니다.");
		
		for (int i=0; i<tires.length; i++) {
			if (tires[i].roll() == false) {
				stop();
				return (i+1);
			}
		}
//		if (frontLeftTire.roll() == false) {
//			stop();
//			return 1;
//		}
//		
//		if (frontRightTire.roll() == false) {
//			stop();
//			return 2;
//		}
//		
//		if (backLeftTire.roll() == false) {
//			stop();
//			return 3;
//		}
//		
//		if (backRightTire.roll() == false) {
//			stop();
//			return 4;
//		}
//		
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
}
