
public class Hello {

	public static void main(String_0[] args) {
		
		
		int x;
		x = 5;
		System.out.println(x);
		float y = 7;
		System.out.println(x+y);//가가 왜 안써질까
//		오 컨트롤+/누르면 주석이걸린다
		/*1줄주석
		 * 2줄주석
//		 * 오 주석안에 주석도 걸린다
		 */
		System.out.println();//한줄을 띄워쓰고싶을땐 빈칸으로 만들면 띄워진다
		System.out.println();
		
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println();
		
		byte value1 = 10;
		short value2 = -10;
		int value3 = 100;
		long value4 =-100L;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println();
		
		float value5 = 1.2F;
		double value6 = -1.5;
		double value7 = 5;
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		
		boolean bool3, bool4;//선언을 먼저 여러개 해도된다 뒤에 내용을써도된다
		bool3 = true;
		bool4 = false;
		System.out.println(bool3);
		System.out.println(bool4);
		
		char value8 = 'A';
		char value9 = '가';
		char value10 = '3';
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
		//정수로대입
		char value11 =65;
		char value12 = 0xac00;//<-아스키코드
		char value13 = 51;
		System.out.println(value11);//A
		System.out.println(value12);//가
		System.out.println(value13);//3
		System.out.println();
		
	
		int b =97;
		char s =(char)b;
		System.out.println(s);
	     x = 3;
		System.out.println(x);
		x =7;
		System.out.println(x);
//묵시적 형변환 업캐스팅	byte<short<int<long<float<double<char
		
		System.out.println();
//명시적 형변환 다운캐스팅 실수에서 정수로바뀔시에 손실이 일어날수있다 캐스트연산자
		double zx =2.7;
		int as =(int)zx;
		System.out.println(as);//2
//	    
	 
				}

}
