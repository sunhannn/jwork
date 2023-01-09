package com.study;
class Point02 {
	private int x;
	private int y;
	
	public void setX(int new_x) {x = new_x;}
	public void setY(int new_y) {y = new_y;}
	public int getX() {return x;}
	public int getY() {return y;}
	
}
public class Suup11 {
	/* Heap : 객체(참조변수 = 주소값) 
	 * 
	 * stack : 임시저장, 연산식 필요한 연산 순서, 연산자, 값 (항)
	 * 	
	 * 생성자 : 객체 생성시 필요
	 * 				기본 생성자 : 형식 : [접근제어자] 생성자명() {} (생성자명은 이름이 클래스명과 동일, 대소문자 구분)
	 * 												리턴타입 기술부가 존재하지 않는다.
	 * 												클래스명 뒤에는 메소드처럼 기술된다.
	 * 				기타 생성자 :  [접근제어자] 생성자명 (매개변수...) { 실행문; }
	 * 		멤버 변수(전역변수) : 자동초기화 , 자식클래스나 메소드에서 재선언가능 
	 * 		지역변수  : 자식 클래스에 존재 자동초기화 x, 재선언 x
	 */
	
	
	public static void main(String[] args) {
	Point02 pt02 = new Point02();	//생성자 호출문
		pt02.setX(10);
		pt02.setY(20);
		System.out.println(pt02.getX() + ", "+pt02.getY());
		
	}

}
