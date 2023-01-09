package JavaStudy01;

public class Java46_1 {
	public String name;
	public int age;
	
	public Java46_1 (String name, int age) {
		this.name= name;
		this.age = age;
	}
	
	@Override
//	데이터가 같은지 다른지 확인
	public boolean equals(Object obj) {
		if (obj instanceof Java46_1) {
			Java46_1 member = (Java46_1) obj;
			return member.name.equals(name) && (member.age == age);
		}
		else {
			return false;
		}
	}

	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
