package com.javaex.ex03;

public class Point {
	// object class equals() 재정의
	
	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	//메소드 겟셋
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public void showInfo() {
		System.out.println("점 [x=" + x + ", y=" + y + "]");
	}
	
	//equals 메소드를 재정의 : x,y값이 같으면 true
	public boolean equals(Object obj) { //오브젝트가 모든 코드의 조상이라고 볼 수 있어서 자료형을 저렇게 하면 다 넣을 수 있음(예외 있는데 아직 안 배움)
		if(this.x==((Point)obj).x && this.y==((Point)obj).y) { //(자식 필드 써야 돼서 자식클래스로 형변환한)obj는 입력받는 변수인데 실제로는 주소값을 입력받게 될 것
			return true;
		}else {
			return false;
		}	
	}
	
	//alt+shift+s에서 오버라이드할 메소드 자동생성 가능
	/*
	위 코드 해설
	Point target=(Point)obj; --> 너무 길어지니까 변수에 넣고 씀.
	if(this.x==target.x && this.y==target.y){
		return true;
	}else{
		return false;
	}
	*/
	
	/*
	근데 만약에 위와 같은 비교를 몇십개씩 해야 돼서 연산이 오래 걸린다면? 
	이 절차를 줄여서 효율적으로(속도를 높여서) 할 수 없을까 고민해야 함. --> 해시코드를 이용함.
	*/

}
