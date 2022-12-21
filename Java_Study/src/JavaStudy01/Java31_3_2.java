package JavaStudy01;

public class Java31_3_2 extends Java31_3 {
	public Java31_3_2(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++totalRotation;
		
		if (totalRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명 : " + (maxRotation - totalRotation) + "회");
			return true;
		}
		else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}
