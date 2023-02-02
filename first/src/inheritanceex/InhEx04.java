package inheritanceex;

class  Par { int p = 0; }
class Cld extends Par {int c = 1;}
class Bro extends Par {int b = 2;}


public class InhEx04 {
	public static void main(String[] args) {
		Par pa01 = new Par(); Cld ch = new Cld();
		Par pa02 = new Bro(); Bro br = new Bro();
		
		pa01 = ch; //pa01= (par)ch; 와 같으며, 타입 변환을 생략할수있음.
		pa01.p = 2;
		//pa01.c = 2;
		ch.p = 5; br.p =5;
//		pa02.b =6;
		br = (Bro) pa02; //타입 변환을 생략할수없음. 다운케스팅: 다시 자식 자료형으로 돌아오는것
		
		//pa02.b = 7;
		//System.out.println("pa02.b: "+pa02.b);
		
		br.p = 5;  br.b = 7;
		System.out.println("br.p : "+br.p +", br.b : "+ br.b);
//		br = (Bro)ch; //직접적인 상속관계가 아니므로, 오류발생.
	}
}
