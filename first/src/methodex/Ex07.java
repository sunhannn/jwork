package methodex;

public class Ex07 {
	static void md() {
		System.out.println("메소드");
	}
    public static void main(String[] args) { //객체생성문
    	Point01 pt01 = new Point01();
    	pt01.x = 10; //.은 접근연산자
    	pt01.y = 20;
    	System.out.println(pt01.x + ", " + pt01.y);
    	Point02 add = new Point02(); /*메인 메소드만 읽기 때문에 
                                       이걸(객체 생성문) 입력 해줘야 Point2에 대한 출력문 나옴*/   	                             
    }
}

class Point01{
	int x, y; 
	  public Point01(){}     //-> 기본생성자 얘만 있을경우 써도 되고 안써도 됨
      public Point01(int a){} //기타 생성자가 있기에 위에 기본생성자를 기술 해줘야 함	
}

class Point02{
	int x, y; // 멤버변수 -> 자동초기화 값이 있다. 전역변수는 메소드나 생성자 안에서는 재선언 가능(클래스 안에서는 안됨)
	public Point02() { // 기본생성자
		int b; // 지역변수 -> 자동초기화 값이 없다.
     // System.out.println(b); -> 자동초기화 값이 없어서 에러
		System.out.println(x); // -> 자동초기화 값이 존재, int이기 때문에 0
		int y = 1;
		System.out.println(y); //여기서는 1
	}
	public void Point02() { //메소드
		int c;
		//System.out.println(c); -> 자동초기화 값이 없어서 에러
		System.out.println(y); //여기서는 0
	}
}
