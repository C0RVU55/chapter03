package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		// object class와 상속관계
		
		Point p1=new Point(2,3);
		System.out.println(p1.toString()); //Point에서 toString을 지우고 실행하면 부모클래스 메소드 갖다 씀.
		
		//Point에는 hashCode 메소드를 안 만들었는데 부모클래스에 있는 메소드라 실행됨.
		System.out.println(p1.hashCode());
		
		/*
		object가 부모라서 object 클래스랑 Point 클래스의 메소드 다 쓸 수 있는데 이름 겹치는 메소드는 주의 필요.
		원래 object에 toString 있는데 이대로 쓰면 이상하게 나오니까 이거 안 쓰고 자식클래스에서 오버라이드시킨 걸로 출력하는 거.
		*/
		
		//섞어썼을 때 메소드 오버라이딩
		Object p2=new Point(5,5);
		System.out.println(p2.toString());
		
		System.out.println(p1); 
		//변수를 그대로 넣으면 주소값이 나와야 되는데 toString이 나옴 : 애초에 println에 주소가 들어오면 toString을 찾아서 실행하라고 돼 있음.
		//역시 자식에 재정의한 toString이 없으면 (오버라이딩이 안 되니까) 부모 toString이 출력되고 부모에도 없으면 오류남.
		
		//getClass()
		System.out.println("getClass-------------");
		System.out.println(p1.getClass());
		
		//hashCode() : 실제주소값(0x333 이런 형태고 개발자는 알 수 없음)에 대응되는 해시코드값으로 알려주는데 변경 가능함.
		//Point에서 public int hashCode() {return 123;} 이렇게 바꾸기 가능.
		System.out.println("hashCode-------------");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		//equals() 같은지 비교
		System.out.println("equals()-------------");
		System.out.println(p1.equals(p2)); 
		//두 변수의 x,y값이 같아도 메모리 위치(주소값)를 비교하기 때문에 다름. 근데 둘이 같게 만들어야 될 경우도 있음. --> ex03
		//int a, b 두 변수에 3을 대입했을 때는 같긴 하겠지만 이게 특수한 경우인 거.
		
		//주소값 비교
		System.out.println(p1==p2); //거짓
		
		//주소 대입해서 같은 곳을 바라보게 만들 수 있음.
		Point p5=p1; 
		System.out.println(p1==p5); //참
		
		/*
		주소값을 비교하는 거라 이렇게 하면 참 안 나옴.
		String str="안녕";
		if(str=="안녕")
		*/
	}

}
