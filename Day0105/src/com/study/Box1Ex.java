package com.study;

public class Box1Ex {

	public static void main(String[] args) {
		Box1 mybox1 = new Box1();
		mybox1.idNum = Box1.getCurrentID();
		// 클래스 명을통해서 클래스 메소드 사용
		
		Box1 mybox2 = new Box1();
		mybox2.idNum = mybox2.getCurrentID();
		// 객체명을 통해서 클래스 메소드 사용
		System.out.println("mybox1의 id 번호 : " + mybox1.idNum);
		System.out.println("mybox2의 id 번호 : " + mybox2.idNum);
		System.out.println("다음 박스의 번호는 " + Box1.boxID + "번 입니다.");

	}

}

class Box1 {
	int width, height, depth;
	long idNum;
	static long boxID = 100;

	// static long boxID
	static long getCurrentID() {
		// long getCurrentID(){}
		return ++boxID;
		// return boxID++;
	}

}