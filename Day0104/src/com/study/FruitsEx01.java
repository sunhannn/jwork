package com.study;
/*
 * 클래스를 만들때 사용할 수 있는 접근제어자 : public, defalut(ex ) class)
 * 
 * 
 */
	// import conex.Fruits1
public class FruitsEx01 {

	public static void main(String[] args) {
		int total;
	//	conex.Fruits1 f = new conex.Fruits1();		
		Fruits1 f1 = new Fruits1(30, 30, 30);
		total = f1.getSum();
		System.out.println("객체 f1의 총 개수 = " + total);
		System.out.println("객체 f1의 apple 개수 = " + f1.getApple());
		System.out.println("객체 f1의 straw 개수 = " + f1.getStraw());
		System.out.println("객체 f1의 grapes 개수 = " + f1.getGrapes());

	}

}

class Fruits1 {
	private int apple;
	private int straw;
	private int grapes;
	private int sum;

	Fruits1(int apple, int straw, int grapes) {
		this.apple = apple;
		this.straw = straw;
		this.grapes = grapes;
		count();
	}

	private void count() {
		// count()라는 메소드를 숨긴다
		sum = apple + straw + grapes;
	}

	public void setApple(int apple) {
		this.apple = apple;
	}

	public void setStraw(int straw) {
		this.straw = straw;
	}

	public void setGrapes(int grapes) {
		this.grapes = grapes;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getApple() {
		return apple;
	}

	public int getStraw() {
		return straw;
	}

	public int getGrapes() {
		return grapes;
	}

	public int getSum() {
		return sum;
	}
}
