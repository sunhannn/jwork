package com.inheritance;

public class IhnEx07_01 {

	public static void main(String[] args) {
		C3 c = new C3();

	}

}

class P3 { // 기타제어자 final이 들어가면 상속할수 없다.
	int a = 1;
	private int b = 5; // 상속이 안됨 private는

	private void md() {
		System.out.println("P3");
	}

//	public void md () {
//		System.out.println("P3");
//	}
	public void md1() {
		md();
	}
}

class C3 extends P3 {
	int c = 6;

	C3() {
		md1();
	}

	public void md() {
		System.out.println("C3");
	}
}