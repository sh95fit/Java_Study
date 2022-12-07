package JavaStudy01;

public class Java18_1 {
//	기본 정수형
	byte byteField;
	short shortField;
	int intField;
	long longField;
	char charField;
	
//	기본 논리형
	boolean booleanField;
	
//	기본 실수형
	float floatField;
	double doubleField;
	
//	참조형
	int[] arrField;
	String stringField;
	
//	Calculator 
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	int minus(int x, int y) {
		int result = x - y;
		return result;
	}
	
	int multiple(int x, int y) {
		int result = x*y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double) x/ (double) y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}