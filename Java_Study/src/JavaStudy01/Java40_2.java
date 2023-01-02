package JavaStudy01;

public class Java40_2 {

	public static void main(String[] args) {
//		멀티 catch를 적용
//		지정한 예외끼리 동일한 예외처리를 하도록 하는 것
		try {
			String data5 = args[0];
			String data6 = args[1];
			System.out.println("data5 = " + data5);
			System.out.println("data6 = " + data6);
			int value5 = Integer.parseInt(data5);
			int value6 = Integer.parseInt(data6);
			int result = value5 + value6;
			System.out.println(data5 + " + " + data6 + " = " + result);
		}
		catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("매개값의 수가 부족하거나 숫자로 변환할 수 없는 값이 입력되었습니다.");
		}
//		catch (NumberFormatException e) {
//			System.out.println("숫자로 변환할 수 없습니다.");
//		}
		catch (ArithmeticException e) {
			System.out.println("숫자를 0으로 나눌 수 없습니다.");
		}
		catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
		}
		finally {
			System.out.println("다시 실행하세요");
		}
		
		System.out.println("\n----- 프로그램 정상 실행 완료 -----\n");

	}

}
