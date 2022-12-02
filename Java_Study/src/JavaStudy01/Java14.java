package JavaStudy01;

/*
 배열
 하나의 변수 이름으로 여러 개의 데이터를 저장
 Index로 데이터 구분
 동일한 데이터 타입만 저장 가능
 
 데이터 타입[] 배열명 = {데이터1, 데이터2, ... };
 데이터 타입[] 배열명 = new 타입[크기];
 
 호출
 배열명[인덱스];
 
 저장
 배열명[인덱스] = 데이터
 
 배열의 길이
 배열명.length
 
 
 다차원 배열
 2차원 이상의 배열
 ex> 1차원 배열 : 배열의 요소가 데이터[값]인 배열
     2차원 배열 : 배열의 요소가 1차원 배열인 배열
	  ...

 배열은 1번 만들어지면 크기 변경이 되지 않는다!
 더 큰 배열을 생성하기 위해서는 삭제 후 다시 생성해야한다
 

 */

public class Java14 {

	public static void main(String[] args) {
		//배열 만들기
		
		int[] intArray1 = {10,20,30,40,50};
		int[] intArray2 = new int[5];
		
		intArray2[0] = 10;
		intArray2[1] = 20;
		intArray2[2] = 30;
		intArray2[3] = 40;
		intArray2[4] = 50;
		
		System.out.println(intArray1[0]);
		
		
		// 오류가 나는 경우!
		
		// int intArray3;	
		// intArray3 = {10,20,30,40,50}; 	// 이런 형태는 불가능! 크기를 알 수 없으므로 맞지 않음
		
		
		int[] intArray4;
		intArray4 = new int[5];	// 크기를 지정해주는 경우에는 적용 가능!

		System.out.println("intArray1의 크기 : " + intArray1.length);
		
		for(int i=0; i<intArray1.length; i++) {
			System.out.println("intArray1["+i+"] : " + intArray1[i]);
		}
		
		for (int i = 0; i<args.length; i++) {
			System.out.println("args[" + i + "] : " + args[i]);
		}
		
		int[] single_arr = {10,20,30,40,50};
		int[][] double_arr = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}
		};
		
		// 2차원 배열의 행 크기
		System.out.println(double_arr.length);
		// 2차원 배열의 열 크기
		System.out.println(double_arr[0].length);
		
		
		for(int i=0; i<double_arr.length; i++) {
			for(int j=0; j<double_arr[0].length; j++) {
				System.out.println("arr["+i+"]["+j+"] = "+double_arr[i][j]);
			}
		}
		

		// 3차원 배열 : 배열의 요소로 2차원 배열을 가지는 배열
		int[][][] triple_arr = {
				{
					{1,2,3},
					{4,5,6}
				},
				{
					{7,8,9},
					{10,11,12}
				},
				{
					{13,14,15},
					{16,17,18}
				}
		};
		
		for(int i=0; i<triple_arr.length; i++) {
			for(int j=0; j<triple_arr[0].length; j++) {
				for (int k=0; k<triple_arr[0][0].length; k++) {
					System.out.println("arr["+i+"]["+j+"]["+k+"] = "+triple_arr[i][j][k]);
				}
			}
		}
		
		
		//String은 기본 타입이 아닌 참조 타입이다! 참조 타입에 문자열을 넣으면 메모리 주소가 저장된다!  
		// 즉, 기본 타입의 배열 생성 시 배열의 요소에 값(데이터 자체)가 저장, But 참조 타입으로 배열 생성 시 배열 요소에 주소가 저장
		String[] strArr = new String[3];
		strArr[0] = "Java";
		strArr[1] = "Java";	//문자열이 동일하면 같은 주소가 지정된다
		strArr[2] = new String("Java"); //메모리 주소가 새로 생성이된다!
		
		System.out.println(strArr[0] == strArr[1]);	// 동일한 문자열이 같은 주소를 가리키므로 true
		System.out.println(strArr[0] == strArr[2]); // 주소가 다르므로 false
		System.out.println(strArr[0].equals(strArr[2])); // 데이터 자체를 비교하는 방법 : .equals  / 데이터 자체를 비교하므로 true

		
		// 기본 데이터 타입은 값을 저장하고 있으며 대입 연산 시 주소가 아닌 값을 복사하여 전달
		
		int num1 = 10;
		int num2 = 0;
		
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		num2 = num1;
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		num1 = 100;
		System.out.println("num1 : " + num1 + ", num2 : " + num2);	// 서로 간섭이 발생하지 않는다!
		
		int[] arr1 = {10,20,30};
		int[] arr2 = new int[3];
		
		for (int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		for (int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		// 배열 arr2에 배열 arr1을 대입
		arr2 = arr1;
		
		for (int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		for (int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		
		// 주소가 복사된 것이므로 arr1만 값을 바꿔도 arr2의 값까지 바뀌게 된다
		for (int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		for (int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		// 값을 복사하는 방법
		// 1. 배열의 모든 요소를 하나씩 대입하여 복사
		// 2. System.arrayCopy() 함수 이용
		// 3. Arrays 클래스 이용
		
		int[] arr3 =  {10,20,30};
		int[] arr4 = new int[3];
		
		for (int i=0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		for (int i=0; i<arr4.length; i++) {
			System.out.println("arr4["+i+"] : "+arr4[i]);
		}
		
		System.out.println("for문 이용 각 요소 복사");
		
		// 1. for문을 이용한 모든 요소 각각 복사
		for (int i=0; i<arr3.length; i++) {
			arr4[i] = arr3[i];
		}

		for (int i=0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		for (int i=0; i<arr4.length; i++) {
			System.out.println("arr4["+i+"] : "+arr4[i]);
		}
		
		System.out.println("arr3 변경 후 ");
		
		for (int i=0; i<arr3.length; i++) {
			arr3[i] = arr3[i]*10;
		}
		
		for (int i=0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		for (int i=0; i<arr4.length; i++) {
			System.out.println("arr4["+i+"] : "+arr4[i]);
		}
		
		// 2. System.arrayCopy() 함수 이용
		System.out.println("\n\narrayCopy() 사용\n\n");
		
		arr3 = new int[] {10,20,30};
		arr4 = new int[3];
		
		for (int i=0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		for (int i=0; i<arr4.length; i++) {
			System.out.println("arr4["+i+"] : "+arr4[i]);
		}
		
		System.out.println("arrayCopy() 사용 후 ");
		
		System.arraycopy(arr3, 0, arr4, 0, arr3.length);
		
		for (int i=0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		for (int i=0; i<arr4.length; i++) {
			System.out.println("arr4["+i+"] : "+arr4[i]);
		}
		
		
		for (int i=0; i<arr3.length; i++) {
			arr3[i] = arr3[i]*10;
		}
		
		System.out.println("arr3 변경 후 ");
		
		for (int i=0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		for (int i=0; i<arr4.length; i++) {
			System.out.println("arr4["+i+"] : "+arr4[i]);
		}
		
	}

}
