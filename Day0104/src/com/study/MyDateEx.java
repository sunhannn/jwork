package com.study;

/* import 문을 사용하고 있는 패키지안에 있는 클래스와 import 할 패키지 안에 동일한 이름의 클래쓰가
 * 없는 경우나 만약 동일한 이름의 클래스가 존재할 때 *사용 불가능
 * 
 */
public class MyDateEx {

	public static void main(String[] args) {
		MyDate id = new MyDate(31, 1, 2023);
		id.isValid();
		System.out.println(id.getMydate());
		
	}

}

class MyDate {
	private int y, m, d;
	private String str;
	public MyDate(int d, int m, int y) {this.y = y; this.m= m; this.d = d;}
	private void setMyDate(int r) {
		if (r == 1) str = "유효한 날짜입니다.";
		else str = "유효하지 않은 날짜입니다.";
	}
	
public String getMydate() {return str;}

	public void isValid() {
		int r;
		if (y % 4 ==0) {
			switch(m) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if (d <= 31) r=1;
				else r =0;
				break;
			case 2:
			if (d <= 29) r = 1;
			else r =0;
			break;
			default :
				if (d <= 30) r= 1;
				else r = 0;
		}
	}else {
		switch (m) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if (d <= 31) r = 1;
			else r = 0;
			break;
		case 2: 
			if (d <= 28) r= 1;
			else r = 0;
			break;
			default :
				if (d <= 30) r = 1;
				else r = 0;
		}
	}
		setMyDate (r);
	
}
	
}
