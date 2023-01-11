package JavaStudy01;

import java.awt.Toolkit;

/*
 멀티 스레드
 
 * 프로세스
  실행 중인 하나의 프로그램
  하나의 프로그램이 다중 프로세스를 만들기도 한다!
  
 * 멀티 태스킹
  두 가지 이상의 작업을 동시에 처리하는 것!
  멀티 프로세스 : 독립적으로 프로그램들을 실행하고 여러 가지 작업 처리
  멀티 스래드 : 한 개의 프로그램을 실행하고 내부적으로 여러 가지 작업 처리
  
  메인 스레드
  모든 자바 프로그램은 메인 스레드가 main() 메서드를 실행시키며 시작
  main() 메서드의 첫 코드부터 아래로 순차적으로 진행
  실행 종료 조건
  - 마지막 코드 실행
  - return문을 만나는 경우
  메인 스레드는 작업 스레드들을 만들어 병렬로 코드를 실행
  - 멀티 스레드를 생성해 멀티 테스킹 수행
  프로세스의 종료
  싱글 스레드 - 메인 스레드가 종료되면 프로세스도 종료
  멀티 스레드 - 실행 중인 스레드가 하나라도 있으면 프로세스는 종료되지 않음!
  
  멀티 스레드로 실행하는 어플리케이션 개발 시 주의사항
  몇 개의 작업을 병렬로 실행할지 결정하는 것이 선행되어야 한다!
  
  Thread 클래스로부터 직접 생성
  -> Runnable을 매개값으로 갖는 생성자 호출
  Thread 하위 클래스로부터 생성
  -> Thread 클래스 상속 후 run 메서드를 재정의하여 스레드가 실행할 코드 작성
 */

public class Java50 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
//		싱글 스레드로 처리하는 경우
		for (int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				
			}
		}

		for (int i=0; i<5; i++) {
			System.out.println("땡");
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				
			}
		}
		
		
		
	}

}
