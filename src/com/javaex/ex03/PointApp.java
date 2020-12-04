package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		// object class equals() 재정의
		
		Point p=new Point(2,3);
		Point p1=new Point(2,3);
		Point p2=new Point(5,8);
		
		
		//전제 : x,y값이 같으면 "같다"고 재정의하기
		
		System.out.println(p.equals(p1)); 
		//거짓 나옴. Object의 이퀄메소드가 내가 돌리려는 프로그램에 안 맞음. 
		//Point에서 다시 정의할 필요가 있음. --> Point에서 재정의 후 true로 바뀜.
		
		System.out.println(p.equals(p2));
		
		

	}

}
