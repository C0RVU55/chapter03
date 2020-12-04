package com.javaex.ex04;

public class Point {
	// Object class equals() 성능 향상
	
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
	
	/*
	x+y 주소값(해시코드)이 같으면 (같을 가능성이 높아서) 같다고 정의하는데
	2+3, 3+2 이런 경우 때문에 x=x, y=y를 추가해서 정확도를 높임.
	*/
	
	/*수동으로 하면 이렇고 단축키 쓰면 아래처럼 자동으로 나옴.
	@Override
	public int hashCode() {
		return x+y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.hashCode() == ((Point)obj).hashCode()) {
			if(this.x==((Point)obj).x && this.y==((Point)obj).y) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	*/
	
	//alt+shift+s > generate hashCode() and equals() 하면 "필드값 같으면 같다(성능향상)" 자동 생성됨.
	@Override //y값만 같게 하고 싶다하면 여기를 건드리면 됨.
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //같은 인스턴스일 때
			return true;
		if (obj == null) //비교대상이 없을 때
			return false;
		if (getClass() != obj.getClass()) //상이한 클래스 Point, Circle을 비교할 때
			return false;
		Point other = (Point) obj; //자식클래스로 시야확장
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}
		

