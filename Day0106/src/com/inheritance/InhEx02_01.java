package com.inheritance;

public class InhEx02_01 {

	public static void main(String[] args) {
		BB sub0b = new BB();

		sub0b.setij(10, 12);
		sub0b.sum();
		System.out.println("합계 : " + sub0b.total);

	}

}

class AA {
	int i;
	int j;

	public void setij(int x, int y) {
		i = x;
		j = y;
	}
}

class BB extends AA {
	int total;

	public void sum() {
		total = i + j;
	}

}