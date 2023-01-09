package com.inheritance;

public class P {
	int a = 0;
	int b = 5;

	public void md() {
		a = 5;
		System.out.println(a + b);
	}

	public void md2( ) {
		System.out.println("md1() 메소드 호출");
	}
}

class C extends P {
	String a = "오버라이딩"; // 상속 관계에서 자식 메소드가 부모 메소드를 덮어쓰는 현상
	//부모것이 지워지는게 아닌 새롭게 만듬

	public void md() { // 객체를 생성하지 않고 상속받으면 따로 호출가능
		System.out.println(a + b);
		super.md();
		this.md1();
	}

	public void md1() {
		System.out.println("md1() 메소드 호출");

	}
}