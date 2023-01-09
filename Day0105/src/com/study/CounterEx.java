package com.study;

public class CounterEx {
	/*
	 *  힙메모리 : 인스턴스 값들을 저장하는 공간
	 *  static 메모리 : static을 넣어준 값들을 저장하는 공간, 꺼질때까지 저장하고 있음
	 * 
	 * static 메소드 안에 올 수 있는 변수
	 * 멤버필드는 static 멤버필드만 가능
	 * 일반변수는 지역변수만 올 수 있다.
	 * 
	 * static 메소드는 static멤버변수만 써야한다(지역변수는 가능)
	 * 
	 * static 값은 같은 클래스 내에서만 공유됨
	 * 
	 */
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		System.out.println(Counter.getCount());
		System.out.println(c1.getCount());
		System.out.println(c2.getCount());
	}

}

class Counter {
	 static int count = 0;

	Counter() {this.count++;}

	public static int getCount() {
		return count;
	}

}
