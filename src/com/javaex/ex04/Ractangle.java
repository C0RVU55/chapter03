package com.javaex.ex04;

public class Ractangle {

	// equals() 예제

	// 필드
	private int width;
	private int height;

	// 생성자
	public Ractangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// 메소드 겟셋
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + width;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		//if문 괄호 안의 내용이 1줄인 경우 괄호 생략가능
		
		if (this == obj) //같은 인스턴스일 때
			return true;
		if (obj == null) //비교대상이 없을 때
			return false;
		if (getClass() != obj.getClass()) //상이한 클래스를 비교할 때
			return false;
		
		Ractangle other = (Ractangle) obj;
		if(this.hashCode() == other.hashCode()) { //"해시코드가 같으면"조건 추가
			if(this.width == other.width && this.height == other.height) { //각 파라미터끼리 비교
				return true;
			}else {
				return false;
			}
		}else { //해시코드가 다르면
			return false;
		}
	}
		/*
		if (height != other.height) 파라미터 각각 비교하는 건 같은데 위에는 "해시태그도 같다"조건을 추가함.
			return false;
		if (width != other.width)
			return false;
		return true;
		*/
		
		/* 파라미터값 하나만 같으면 같음
		@Override
		public boolean equals(Object obj) {
			
			if (this == obj) 
				return true;
			if (obj == null) 
				return false;
			if (getClass() != obj.getClass()) 
				return false;
			
			Ractangle other = (Ractangle) obj; //해시코드 조건 뺌.
			if(this.width == other.width && this.height != other.height) { //"width만 같거나 width,height 둘 다 같은 경우 같다"라서 이거 추가함.
				return true;
			}else if(this.width == other.width && this.height == other.height) { 
				return true;
			}else {
				return false;
			}
			
		}
		*/
	
}
