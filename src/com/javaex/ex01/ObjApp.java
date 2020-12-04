package com.javaex.ex01;

public class ObjApp {

	public static void main(String[] args) {
		// object class : 최상위 클래스

		// Object에는 어떤 메소드가 있을까
		Object obj = new Object();

		// 메소드에 다 매뉴얼 있음. 우리가 메소드를 만들게 되면 마찬가지로 매뉴얼도 같이 넣어야 됨.
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		System.out.println(obj.equals(obj));

		// public Object getClass() --> 클래스 정보(클래스가 어디에 속해 있는지)
		System.out.println("----------------");
		System.out.println("obj.getClass()");
		System.out.println(obj.getClass());

		// public int hashCode() --> 메모리 주소값(일련의 숫자로 실제 주소값은 아님)
		System.out.println("----------------");
		System.out.println("obj.hashCode()");
		System.out.println(obj.hashCode());

		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();

		System.out.println(obj01.hashCode()); //new로 부른 클래스틀이라 해시코드값 다 다름.
		System.out.println(obj02.hashCode());
		System.out.println(obj03.hashCode());

		// public String toString() --> 객체의 값 정보
		// getClass().getName()+"@"+integer.toHexString(hashCode) 라고 정해져 있음.
		System.out.println("----------------");
		System.out.println("obj.toString()");
		System.out.println(obj.toString());

		// public boolean equals() --> 객체(인스턴스)가 같은지 비교
		System.out.println("----------------");
		System.out.println("obj.equals()");
		System.out.println(obj.equals(obj)); // equals 안에 비교할 파라미터 넣어야 함. 결과는 참거짓.
		System.out.println(obj.equals(obj02));
	}

}
