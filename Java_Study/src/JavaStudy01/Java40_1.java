package JavaStudy01;

public class Java40_1 {

	public static void main(String[] args) {
//		다중 catch
		try {
			String data5 = args[0];
			String data6 = args[1];
			System.out.println("data5 = " + data5);
			System.out.println("data6 = " + data6);
			int value5 = Integer.parseInt(data5);
			int value6 = Integer.parseInt(data6);
			int result = value5 / value6;
			System.out.println(data5 + " / " + data6 + " = " + result);
		}
//		예외 상위 클래스가 위쪽에 위치하면 에러가 발생한다
//		catch (Exception e) {
//			System.out.println("오류가 발생했습니다.");
//		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatch3 num1 num2");
		}
		catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
//		catch (ArithmeticException e) {
//			System.out.println("숫자를 0으로 나눌 수 없습니다.");
//		}
		catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
		}
		finally {
			System.out.println("다시 실행하세요");
		}
		
		
		System.out.println("\n----- 프로그램 정상 실행 완료 -----\n");

	}

}
