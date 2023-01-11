package JavaStudy01;

public class Java48_1 {
	public int sno;
	public String name;
	
	public Java48_1(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Java48) {
			Java48_1 std = (Java48_1)obj;
			return (sno==std.sno) && (name.equals(std.name));
		}
		else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return sno = name.hashCode();
	}
}