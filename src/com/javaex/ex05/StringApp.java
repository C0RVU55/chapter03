package com.javaex.ex05;

public class StringApp {

	public static void main(String[] args) {
		// String class
		
		String str=new String();
		str="안녕하세요";
		System.out.println(str); 
		/*
		원래 이렇게 출력하면 주소값이 나와야 되는데 println은 파라미터에 주소값이 들어오면 toString을 찾아가게 돼 있음.
		java.lang.String@3432424 원래 이렇게 나와야 됨. String extends Object인데 String에서 toString을 재정의해서 오버라이딩된 거니까.
		String 클래스에 일반 메소드가 여러가지 있음.
		String 클래스 필드에는 □안□녕□하□세□요 이렇게 자리를 차지하게 될 것.
		*/
		
		//String값 비교
		String s1=new String("hi");
		String s2=new String("hi");
		
		System.out.println(s1==s2); 
		//각각 새로 메모리에 올라갔기 때문에 주소값을 비교하게 됨 --> false
		System.out.println(s1.hashCode()==s2.hashCode()); 
		//해시코드비교는 둘 다 데이터값이 같아서(딱 보기에도 같으니까) 해시코드도 같도록 조정해서 나옴 --> true
		System.out.println(s1.equals(s2)); 
		//그래서 문자열 비교할 때는 ==말고 equals() 써야 됨.

		if(s1.equals("hi")) { //nullPoint가 되는 경우 발생
			//문자열이 같은 경우
		}
		if("hi".equals(s1)) { //nullPoint가 발생되지 않게 함
			//문자열이 같은 경우
		}
		
		/////////////////////////
		
		System.out.println("---특수케이스 new 연산자 안 썼을 때---");
		String s3="hello"; //메모리에 올라감.
		String s4="hello"; //약식으로 쓰면 같은 데이터를 대입할 경우 메모리에 먼저 올리는 게 아니라 같은 데이터가 있는 메모리공간을 찾아서 그 주소값을 가짐.
		
		System.out.println(s3==s4); //같은 주소값을 가져서 true
		
		//hashCode값도 같음.
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//두 변수가 같은 주소값을 가진 상태에서 원래 변수값을 바꿨을 때
		s3="hello!!!!!!"; //이러면 s4도 바뀌어야 되지만 안 바뀜.
		System.out.println(s3);
		System.out.println(s4); //주소값은 같은데 변경된 값은 반영 안 됨 --> 약식일 때 값을 바꾸면 메모리에 새로 올려버리기 때문.
		
		System.out.println(s3==s4); //주소값 달라진 거 확인.
	}

}
