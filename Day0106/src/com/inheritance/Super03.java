package com.inheritance;

public class Super03 {

	public static void main(String[] args) {
		
		AA3 super1 = new AA3();
		
		
		
	}

}

class AA1 {
	double d1;
	AA1() {
		System.out.println("AA1 생성자");
		d1 = 10 * 10;
	}
}

class AA2 extends AA1{
	double d2;
	AA2() {
		System.out.println("AA2 생성자");
		d2 = 10 * 10 * 10;
	}
}
class AA3 extends AA2{
	double d3;
	AA3(){
		System.out.println("AA3의 생성자");
		d3 = 10 * 10 * 10 *10;
	}
	
}