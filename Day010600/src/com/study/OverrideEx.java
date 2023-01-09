package com.study;

public class OverrideEx {
	/*
	 * override : 오버라이드 @override 상속관계의 자식 클래스로 부모 클래스에 도이일한 이름의 메소드가 존재할 경우 부모의
	 * 메소드가 가려지고 (Hidding) 자식의 메소드를 재정의되는(덮어쓰기 되는) 현상
	 * 
	 */
	public static void main(String[] args) {

		Ch c = new Ch();
		c.show("상속 오버로딩");
		c.show();

		Pa p = new Ch();
		p.show();
		System.out.println(c.a);
		System.out.println(p.a);
	}

}

class Pa {
	int a = 5;

	void show() {
		System.out.println("상위클래스 메소드 show");
	}

	void show(String str) {
		System.out.println("상위 클래스 메소드 show (String str)" + str);
	}

}

class Ch extends Pa {
	String a = "하하하";

	void show() {
		System.out.println("하위클래스 메소드 show()");
	}

}