package innerEx;

import innerEx.Outer.InstanceInner;

class Outer{
	int data = 0;
	static int data1= 50;
	
	void myMethod() {
		System.out.println("Outer 클래스의 메소드 data : " +data);
		
	}
	
	//내부클래스 1 - 멤버이너 클래스
	class InstanceInner{
		int iv = 100;
		void myMethod() {
			System.out.println("InstanceInner 클래스의 메소드 data : " +data + ", iv:" + iv);
		}
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
		
		void myMethod() {
			System.out.println("StaticInner클래스의 메소드 data1 : "+ data1);
//			System.out.println("StaticInner클래스의 메소드 data : "+ data);
			System.out.println("StaticInner 클래스의 iv : "+ iv+ ", cv: "+cv);
			
		}
	}
}

public class InnerEx01 {
public static void main(String[] args) {
	Outer outer = new Outer();
	//내부클래스 객체 생성
	InstanceInner instanceInner = outer.new InstanceInner();
	System.out.println("instanceInner.iv : "+instanceInner.iv);
	System.out.println();
	System.out.println("Outer.StaticInner.cv : "+ Outer.StaticInner.cv);
	Outer.StaticInner.cv =50;
	System.out.println("Outer.StaticInner.cv : "+Outer.StaticInner.cv);
	
	Outer.StaticInner staticInner = new Outer.StaticInner();
	System.out.println("staticInner.iv : "+staticInner.iv);
	System.out.println("staticInner.cv : "+staticInner.cv);
	System.out.println();
	
	outer.myMethod();
	instanceInner.myMethod();
	staticInner.myMethod();
	
	staticInner.iv = 50;
	System.out.println("staticInner.iv : "+staticInner.iv);
}
}