package com.javaex.ex04;

public class RactangleApp {

	public static void main(String[] args) {
		// equals() 예제

		Ractangle a=new Ractangle(6,4);
		Ractangle b=new Ractangle(6,4);
		Ractangle c=new Ractangle(12,2);
		
		//System.out.println(a.toString());
		
		System.out.println(a.hashCode()); //1091
		System.out.println(b.hashCode()); //1091
		System.out.println(c.hashCode()); //1035
		/*
		Ractangle에 있는 해시코드 공식대로 계산됨.
		result = 31 * 1 + 4;
		result = 31 * 35 + 6;
		return 1091; 
		*/
		
		//조건 : 해시코드값도 같고 각 파라미터값도 같음.
		System.out.println("==equals()값 비교"); 
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		
		/*
		//조건 : width값만 같거나 각 파라미터값이 같으면 같음. c를 (6,2)로 바꾸고 실행.
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		*/
	}

}
