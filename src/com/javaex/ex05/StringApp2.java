package com.javaex.ex05;

public class StringApp2 {

	public static void main(String[] args) {
		// String 메소드 : concat trim replace split substring ...등 여러 개가 있어서 상황에 따라 검색해서 쓰면 됨.
		// 메소드 매뉴얼 : http://docs.oracle.com/javase/8/docs/api/
		
		String a=new String(" abcd");
		String b=new String(",efg ");
		
		//concat() : 2개의 문자열을 합침.
		System.out.println(a.concat(b)); //return된 값을 출력해줄 뿐이라 실제 a값이 변하진 않음.
		System.out.println(a);
		
		a=a.concat(b); //대입하면 변경됨.
		System.out.println(a);
		
		//trim() : 공백 삭제
		a=a.trim();
		System.out.println("__"+a+"__"); //앞뒤 공백 확인용
		
		//replace(원하는 문자를, 이 문자로 바꿈)
		a=a.replace("ab","12"); //ab를 12로 바꾸라는 뜻이고 문자 수는 상관없음.
		System.out.println(a);
		
		//split() : 2가지 있음. 파라미터를 기준으로 앞뒤를 나눠서 배열로 return.
		//주민번호 데이터에서 -빼고 관리하는 경우 등에 사용 가능
		System.out.println("----------");
		
		String[] sArr=a.split(","); //new하지 않아도 split 내부에서 메모리에 올려줘서 그냥 대입 가능.
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		//substring() : 2가지 있음. 왼쪽에서 파라미터(int 좌표 0부터 시작)부터 끝까지 추출.
		System.out.println("----------");
		
		String str="Hello java";
		
		String result=str.substring(3); //[3]번값부터 끝까지 추출
		System.out.println(result);
		
		String result2=str.substring(3,5); //[3]번부터(이상) [5]번 이전(미만)까지 추출
		System.out.println(result2);
		
		//charAt() : 자료형 char 추출
		System.out.println("----------");
		
		char c=str.charAt(1); //[1]번값 추출
		System.out.println(c);
		
		String c2=str.substring(1,2);
		System.out.println(c2); ////[1]번부터(이상) [2]번 이전(미만)까지 추출

	}

}
