package methodex;

public class Ex01 {
//    //메소드 선언문 
//	public static String boyoung(String a) {
//		return "안녕하세요." +a;
//	}
//    public static String hello_func(String s) {
//	System.out.println("안녕하세요."+s);
//	return "안녕하세요." +s;
//	}
//    public static void main(String[] args) {
//	boyoung("사과");
//	String str = hello_func("귤");
//      System.out.println(str);
//	}
	//메소드 선언문
//	static void sum(int a,int b) {
//		int c;
//		c=a+b;
//		System.out.println("a+b = " +c);
//	
//	}
//	//메소드 선언문 ,자바는 메인만 읽을수있다
//	public static void main (String[] args) {
//		int a=10, b=20;
//		//sum 메소드 호출문
//		sum(a, b);  //sum을 한번 불러와라 a와 b를 대입해서
//		sum(4, 5);  //sum을 한번 불러와라 a자리에 4를 넣고 b자리에 5를 넣어서
//		
//	}
    
    static int sum(int x, int y) {
    	int c;
    	return c=x+y;
    	
    }
   public static void main(String[] args) {
		int a =10, b =20;
		
		int i1 = sum(a,b);
		int i2 = sum(4,5);
		
		String c;
		System.out.println("x+y= " +sum(a,b));
		System.out.println("x+y= " + sum(4,5));
	}
	}






