package com.inheritance;

public class InhEx5_1 {

	public static void main(String[] args) {
		CB b2 = new CB();
	}

}

class PB {
	int x;
	PB(){
		System.out.println("부모생성자");
	}
}

class CB extends PB {
	String x;
	CB(){
//		super(); 숨겨져 잇음, 기술이 안돼 있을 경우
		System.out.println("자식생성자");
	}
	CB(int b){
		System.out.println("자식기타생성자 : "+b);
	}
}
