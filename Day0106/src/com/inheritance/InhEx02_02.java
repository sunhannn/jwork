package com.inheritance;

public class InhEx02_02 {

	public static void main(String[] args) {
//		C c = new C();
		P c = new C();
		// 업케스팅 - 하위클래스 (= 서브클래스 = 자식 클래스) 자료형이 상위클래스로 변환 되는 것
		c.md();
		// C c = (C) new P(); 다운 캐스팅
//		((C)c).md1();
		c.md2();
	}

}
