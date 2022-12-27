
public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello World");			 // ; 세미콜론 : 콜론
		
		/*
		 *  변수 : 변하는 수,  값을 저장하는 공간
		 *  
		 *  변수 형식 : 자료형 변수명;
		 *  
		 *   변수 초기화 : 자료형 변수명 = 값;
		 *   
		 *   = : 대입연산자
		 *   
		 *   자료형 = 성격, 타입, 성질
		 *   
		 *   숫자형 ->  byte < short < int, long  <  float, double       *long을 사용할 때 정수 뒤에 l명시하기
		 *                  1byte  2byte    4byte  8byte     4byte     8byte
 		 *   문자형 -> char(2byte)
		 *  
		 *  실수 자료형 : float 4byte ex) float x = 1.25f;
		 *  						double 8byte ex) double y = 1.25;
		 *  
		 * char -> '  '  한글자만 가질 수 있다.
		 * 작은 따음표(싱글 쿼테이션)으로 묶어 줘야 한다.
		 *  초기값은 공백 한 칸을 가짐
		 *   
		 *  char c = '가';
		 *  
		 *   byte < short < int < long < float < double
		 *   
		 *  자료형 = 기본자료형 = 클래스
		 *  
		 *  변수 선언 및 초기화 형식 (Syntax) 
		 *  자료형 변수이름 = 값(리터럴);
		 *  
		 *  ※변수 명령 규칙
		 *  
		 *  1. 되도록 영어 소문자로(권장)
		 *  2. 첫글자는 영어 소문자(대문자), _(언더바), $(달러기호)만 올 수 있다.
		 *  3. 2번의 경우가 아니면 숫자는 어느 위치든 가능하다.
		 *  4. 이름안에 공백은 올 수 없다.
		 *  5. 키워드(예약어)를 사용할 수 없다.
		 *   
		 *   논리형 : boolean(참, 거짓)
		 *   false가 디폴트 값
		 *   
		 */
		 
			int x = 5;
			System.out.println(x); // 출력은 문자열이다.
			
			boolean bool1 = true;
			boolean bool2 = false;
			System.out.println(bool1);
			System.out.println(bool2);
			System.out.println();
			
			byte value1 = 10;
			short value2 = -10;
			int value3 = 100;
			long value4 = -100L;
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
			// 클래스안에 지역변수 무조건 값이 대입해줘야함
			/* 변수 선언 및 초기화 형식
			 * 자료형 변수명 = 값;
			 * 자료형 변수명; // 선언
			 *  변수명 = 값; // 초기화
			 * 
			 * 자료형 변수명1 = 값1 , 면수명2 = 값2;
			 * 변수명 1 = 값1;
			 * 변수명2  = 값2;
			 */
			
			char valueA = 'A';
			char valueB= '가';
			char valueC = '3';
			System.out.println(valueA);
			System.out.println(valueB);
			System.out.println(valueC);
			System.out.println();
			
			//정수로 대입
			char valueD = 65;
			char valueE = 0xac00;
			char valueF = 51;
			System.out.println(valueD);
			System.out.println(valueE);
			System.out.println(valueF);
			System.out.println();
			
byte b = 5;
short s = (byte)b;

int d = 97;
char v =(char) d;
			System.out.println(v);
		System.out.println("a"+"+"+"b"+"="+" "+(5+6));
	}

}
