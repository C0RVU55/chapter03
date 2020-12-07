package com.javaex.ex06;

public class WrapperApp {

	public static void main(String[] args) {
		// wrapper class : 기본데이터형을 객체형식로 다루기 위한 클래스 --> 박싱, 언박싱

		Integer n1 = new Integer(23);
		Integer n2 = new Integer(100);

		Integer sum = n1 + n2; // int였으면 변수가 스택에서 123 가지고 있는데 Integer라서 sum이 123인게 아니라 주소값 갖고 있음.
		System.out.println(sum); // 이러면 toString 찾아서 출력하는 거.

		// 정석적으로는 이렇게 쓰겠지만 불편함. 메모리 관리에는 편할 수도 있음.
		Integer sum2 = new Integer(50) + new Integer(51);
		System.out.println(sum2);

		// 박싱 언박싱 (자동)
		int num = 123; // 이거는 주소값이 아니라 값을 갖는 거라 .으로 메소드 호출 안 됨.

		// 박싱
		Integer i1 = 23;
		i1.parseInt("12313"); // 박싱 메소드 포함됨

		// 언박싱
		int no = n2;
		// 주소값을 정수형 변수(값만 담을 수 있음)에 담는데 n2도 정수라 가능하긴 함. 근데 박스 뜯고(클래스 없애고) 내용물 100만 담기게 됨.
		// no.parseInt("123"); 그래서 메소드 사용불가능.

		/////////////////////////
		
		// 메소드 사용
		// 문자열 --> 정수로 변경
		int result = i1.parseInt("12345"); // 파라미터에 문자열을 넣었을 때 정수 변환되면 Integer로 return
		System.out.println(result);

		// 이상한 점 : "12345" --> 12345 숫자로 변경
		Integer n3 = 11111; // 박싱돼서 메모리에 올라감.
		int result1 = n3.parseInt("13579"); 
		// parseInt 쓰려고 굳이 변수 쓰는 건 번거로워 보임. 새 변수 없이 parseInt를 쓸 수 있으면 좋겠음.

		// 그래서 매번 Integer 변수 새로 선언할 필요없이 바로 갖다쓰라고 static에 올라가 있음. 
		// (단점 : 1번도 안 쓰는 건데 메모리에 항상 올라가 있는 상황이 될 수도 있음)
		int result2 = Integer.parseInt("13579");
		System.out.println(result2);

		// 정수 --> 문자열로 변경 12345 --> "12345"
		String result3 = String.valueOf(12345);
		System.out.println(result3);

		// 자주 쓰이는 다른 방법
		String result4 = "" + 12334;

	}

}
