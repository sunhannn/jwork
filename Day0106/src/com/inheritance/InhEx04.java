package com.inheritance;

public class InhEx04 {
public static void main (String[] args) {
	Par pa01 = new Par(); Cld ch = new Cld();
	Par pa02 = new Bro(); Bro br = new Bro();
	
	pa01 = ch; // pa01 = (Par)ch; 와 같으면, 타입 변환을 생략할 수 있음
	pa01.p = 2;
//	pa01.c = 2;
	ch.p = 5; br.p = 5;
//	pa02.b = 6
	br = (Bro) pa02; // 타입 변환을 생략할 수 없음. 다운 케스팅 : 다시 자식 자료형으로 돌아오는 것
	
//	pa02.b = 7;
//	System.out.println("pa02. :"+pa02.b);
	
	br.p = 5; br.b = 7;
	System.out.println("br.p : "+br.p + " , br.b : "+br.b);
}
}

class Par {int p =0;}
class Cld extends Par {
	int c = 1;
}

class Bro extends Par {
	int b =2 ;
}

