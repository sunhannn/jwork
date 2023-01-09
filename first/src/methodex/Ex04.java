package methodex;

public class Ex04 {
    static void prn(int x, int y, int z) { //prn 메소드 선언, int xyz는 매개변수
    	System.out.println(x + "\t"  + y + "\t" + z);
    }
    
    static void prn(int x, int y) { //prn 메소드 선언
    	System.out.println(x + "\t" + y);
    	} 
    static void prn(int x) { //prn 메소드 선언
    	System.out.println(x); 
    	}
    
    public static void main(String[] args) { //메인 메소드 선언
    	prn(10, 20, 30);
    	prn(40, 50);
    	prn(60);
    }
}
