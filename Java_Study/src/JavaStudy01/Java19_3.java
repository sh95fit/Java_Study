package JavaStudy01;

public class Java19_3 {
	public String name;
	public String type;
	public String color;
	public String size;
	public int maxSpeed;

	public Java19_3() {
		this("아반떼");
	}
	
	public Java19_3(String name) {
		this(name, "세단");
	}
	
	public Java19_3(String name, String type) {
		this(name, type, "검정");
	}
	
	public Java19_3(String name, String type, String color) {
		this(name, type, color, "준준형");
	}
	
	public Java19_3(String name, String type, String color, String size) {
		this(name, type, color, size, 250);
	}
	
	public Java19_3(String name, String type, String color, String size, int maxSpeed) {
		this.name = name;
		this.type = type;
		this.color = color;
		this.size = size;
		this.maxSpeed = maxSpeed;
	}
	
	public void ptrCarInfo() {
		System.out.println("차량 이름 : " + this.name);
		System.out.println("차량 종류 : " + this.type);
		System.out.println("차량 크기 : " + this.color);
		System.out.println("차량 색상 : " + size);
		System.out.println("차량 최고속도 : " + maxSpeed);
	}
}
