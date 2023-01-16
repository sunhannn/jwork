package conex;

class Sub{
	int x;//0
	public Sub() {}
	
	
	public void submd(int x) {
		/*반복문 출력결과: x값을 받아서 x값의 숫자만큼 반복되도록 처리
		 * Sub클래스의 submd메소드 호출
		 * Sub클래스의 submd메소드 호출
		 * Sub클래스의 submd메소드 호출
		 * */
		for(int i=this.x; i<x; i++) 
			System.out.println("Sub클래스의 submd메소드 호출");
		
	}
}


public class SubEx {
	public static void main(String[] args) {
		Sub s1 = new Sub();
		s1.submd(5);
	}

	
}




