package methodex;

public class Ex03 {
    
    public static void main(String[] args) { //메인메소드 선언
    	int result = add(3, 5); //메소드 호출문 및 반환값 받기
    	System.out.println(result); 
    	
    	int[] result2 = {0}; //[] = 배열임 배열은 기차그려서 이해 
    	                     //길이는 1 인덱스 0의 값은 0 result2의 값을 출력하면 주소값이 나옴
    	add(3, 5, result2); //메소드 호출문
    	System.out.println(result2[0]);
    	}
    
    static int add(int a, int b) {return a + b;} //add 메소드 선언
    
    static void add(int a, int b, int[] result){result[0] = a + b;} // add 메소드 선언
    	
}
