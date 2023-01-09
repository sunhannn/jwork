package com.study;

public class OneEx {
	
	
	
	public static void main(String[] args) {
		One t1 = new One();
		System.out.println("t1의 주소값 : " + System.identityHashCode(t1));
		System.out.println("기본값 : " + t1.value);

	}

}

class One {
	int value;

	public One() {
		this.value = 5;
		System.out.println("디폴트생성자");
	}

	public One(int value) {
		// 자신의 value 변수에 매개변수로 받은 값을 저장
		this.value = value;
		// 클래스 메소드를 호출. 매개변수로 자신의 객체를 전달
		 Another.methodA(this);
	}

	public void md() {
		// this();
	}
}

class Another {
/*
 *  static(키워드) 제어자 
 *  객체를 생성하지 않고 클래스명을 통해 접근 가능하도록 해줌
 *  메모리 공유가 됨 (같은 클래스내에서만)
 */
	static void methodA(One ins) { // One ins 객체 => 객체 복사
		System.out.println("메소드A에서의 값 : " + ins.value);
		System.out.println("ins의 주소값 : " + System.identityHashCode(ins));
	}

}