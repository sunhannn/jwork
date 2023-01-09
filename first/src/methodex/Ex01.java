package methodex;

public class Ex01 {
   
	static int sum(int x, int y) { 
		int c; 
		c = x + y; 
		return c; //or return c = x + y;
				
	}
	
	public static void main(String[] args) { 
		int a = 10, b = 20;
		
		//sum(a, b); -> sum(10, 20);
		//sum(4, 5); -> sum(4,5);
		//sum(a, b); -> int i1 = sum(a, b); 로 설정
		//sum(4, 5); -> int i2 = sum(4, 5);로 설정
		
		System.out.println("x + y =" + sum(a, b)); //c를 sum(a, b)로 교체 or int i1
		System.out.println("x + y =" + sum(4, 5)); //c를 sum(4, 5)로 교체 or int i2
		
	}
}
