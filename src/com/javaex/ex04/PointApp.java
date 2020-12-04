package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
		// Object class equals() 성능 향상
		
		Point p1=new Point(2,3);
		Point p2=new Point(2,3);
		Point p3=new Point(5,8);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p1.equals(p2));
		
		//빨라진? 코드
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}

}
