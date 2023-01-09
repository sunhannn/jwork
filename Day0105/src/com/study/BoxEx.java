package com.study;
/*
 * 	정적변수 = static 변수 = class변수 : static 키워드가 붙은 변수나 객체
 * 	생성시점 : 클래스가 로드될때 , 소멸시점 : 프로그램이 종료될 때
 * 	
 * 	일반 변수 = 변수 : 값만을 저장하는 변수			스태틱이 안붙을 경우
 * 	참조 변수 = 객체  : 주소값을 저장하는 변수 
 * 	
 * 	생성시점 : 객체나 변수가 생성되는 시점, 소멸시점 : 객체나 변수가 소멸되는 시점
 * 
 * 	지역변수 : 메소드나 생성자와 같은 {} 영역안에 존재하는 변수
 * 		생성 시점 : 객체나 변수가 생성되는 시점 , 소멸시점 : 해당 영역이 종료되는 시점
 * 
 */
public class BoxEx {

	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box();
		Box box3 = new Box();
		Box box4 = new Box();
		System.out.println("box1의 idNum : " + box1.idNum);
		System.out.println("box2의 idNum : " + box2.idNum);
		System.out.println("box3의 idNum : " + box3.idNum);
		System.out.println("box4의 idNum : " + box4.idNum);
		System.out.println("박스 총 개수 : " + Box.boxID);

	}

}

class Box {
	long idNum;
	static long boxID = 0;

	public Box() {
		idNum = boxID++;
	}

}
