package conex;

public class SubEx {
	public static void main(String[] args) {

		Sub ex01 = new Sub();
		ex01.submd(5);
	}
}

class Sub {
	int x;
    public Sub() {   	
    }

	public void submd(int x) {
		/*
		 * 반복문 출력결과 : x값을 받아서 x값의 숫자만큼 반복되도록 처리 sub클래스의 sub메소드 호출
		 */
		for (int a = this.x; a < x; a++) {
			System.out.println("Sub 클래스의 submd메소드 호출");
		}

	}
}
