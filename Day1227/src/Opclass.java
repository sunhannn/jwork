
public class Opclass {
/* 전위 ++항, --항
 * 후위 : 항++, 항--
 * 
 */
	public static void main(String[] args) {
//		int a = 3;
//		++a;	// a = a+1;
//		System.out.println("1 : "+a);
//		a--;	// 대입 연산자가 우선이니깐 후위 연산자를 나중에 계산함.
//		System.err.println("2: "+a); 	// 우선순위를 랜덤으로 정함, 글씨는 빨간색으로 출력
//		
//		int x = 5;
//		int y = ++x;
//		System.out.println("3: "+x+" "+y);
//		
//		int x2 = 5;
//		int y2 = x2++;
//		System.out.println("4: "+x2+" "+y2);
	
		int a = 10, b = 10;
		int c = a;
		System.out.println("a : "+ a + ", c : "+ c);
		c = ++a + b;
		System.out.println("a : " + a + ", c : "+ c);
		c = a++ +b; // 후위연산자는 a와 a+1로 나누어서 계산
		System.out.println("a : "+ a + ", c : "+ c);
		
		
	}

}
