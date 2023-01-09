
public class Operator1 {
/*연산 : 명령문을 실행해서 처리하는 것을 연산이라고 함.
 * 
 * 연산자(오퍼레이터 = operator) : 피연산자를 연산처리하기 위한 기호
 * 피연산자(항 = 오퍼런드=operand) : 연산의 대상이 되는 것을 말함.
 * 
 * 연산자의 종류 및 우선순위
 * 1. 괄호연산자 : () {} []
 * 2. 단항 연산자 (항이 한개인 연산자)
 * - 논리 : ! (부정=아니다=NOT)
 * - 비트 : ~ (NOT)
 * - 전위연산자 : ++ --
 * -접근연산자 : .
 * - 부호연산자 : + -
 * 
 * 3.  이항연산자 (항이 두 개인 연산자)
 * -결합(문자열결합) : +
 * - 산술연산 : *(곱셈) / (나눗셈) %(나눗셈-나머지) +(덧셈) -(뺄셈)
 * - 비교 : == != < <= > >= instanceof
 * - 논리 : 
 * 비트 : & (논리곱 AD -> 모두 참인 경우만 참, 나머지는 거짓)
 * |(논리합 ior -> 모두 거짓인 경우만 거짓, 나머지는 참)
 * ^(배타적논리합 XOR -> 항이 서로 다른 경우만 참, 너머지는 거짓) => 값을 1, 0으로 반환
 * 
 * ------> 조건식에서 사용
 * 논리곱 : && (두 조건이 모두 참인 경우만 참)
 * 논리합 : || (두 조건 중 하나라도 참인 경우 참)
 * => 값을 true, false로 반환함
 * 
 * 4. 삼항 연산자 (항이 세 개인 연산자)
 * => 조건식 ? 참일 때의 실행문이나 값 : 거짓일 때의 실행문이나 값
 * 5. 대입연산자 : = *= /= %= += -=
 * 6. 후위연산자 : ++ --
 * 
 */
	
	
	public static void main(String[] args) {
		 int a = 10;
		 int b = a;
		 System.out.println(b);
		 
		 b+= a;
		 System.out.println(b);
		 
		 b-= a;
		 System.out.println(b);
		 
		 b*= a;
		 System.out.println(b);
		 
		 b /= a;
		 System.out.println(b);
		 
		 b %= a;
		 System.out.println(b);
		
		int x = 10;
		int y = 5;
		// 비교 연산자 : 값으로 true, false를 반환
		System.out.println("x == y : "+ (x==y));
		System.out.println("x > y : "+ (x>y));
		System.out.println("x >= y : "+ (x>=y));
		System.out.println("x < y : "+ (x<y));
		System.out.println("x <= y : "+ (x<=y));
		System.out.println("x != y : "+ (x!=y));
		
		
	}

}
