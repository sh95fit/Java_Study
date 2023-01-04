package JavaStudy01;

public class Java41_1 implements AutoCloseable {

	private String file;

//	생성자
	public Java41_1(String file) {
		this.file = file;
	}
	
//	AutoCloseable 인터페이스를 상속받아 구현한 파일을 닫을 때 실행하는 메서드
	@Override
	public void close() throws Exception {		//close가 무조건 실행된다!
		System.out.println(file + "을 닫습니다.");
	}
	
//	지정한 파일을 읽을 때 출력될 내용
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}

	
}
