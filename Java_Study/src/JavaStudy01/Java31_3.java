package JavaStudy01;

public class Java31_3 {
	public int maxRotation;
	public int totalRotation;
	public String location;
	
	public Java31_3(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++totalRotation;
		
		if (totalRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation - totalRotation) + "회");
			return true;
		}
		else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
