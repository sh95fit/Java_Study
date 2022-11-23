package JavaStudy01;

/*
 break문, continue문
 for문, while문, do-while문 switch문에서 사용
 
 break문 
 반복문 내에서 break문을 만나면 즉시 종료
 
 continue문
 반복문 내에서 continue문을 만나면 현재 루프를 종료 후 다음 루프로 넘어감
 */

public class Java11 {

	public static void main(String[] args) {
		System.out.println("-----break/continue-----");
		System.out.println("-----break");
		
		for(int i=0;i<10;i++) {
			if(i==5) {
				break;
			}
			System.out.println("현재 i의 값 : " + i);
		}
		
		System.out.println("-----continue");
		
		for(int i=0;i<10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println("현재 i의 값 : " + i);
		}
		
		System.out.println("-----while문 내 break/continue-----");
		
		System.out.println("-----break");
		
		int count = 0;
		
		while (count<10) {
			count++;
			if(count==5) {
				break;
			}
			else {
				System.out.println("현재 count의 값 : " + count);
			}
		}
		
		System.out.println("-----continue");
		
		int count1 = 0;
		
		while (count1<10) {
			count1++;    //증감 위치 주의!! while문 내에서는 continue문 밑에 증감식이 존재하면 무한루프 발생
			if(count1==5) {
				continue;
			}
			else {
				System.out.println("현재 count의 값 : " + count1);
			}
		}
		
	}

}
