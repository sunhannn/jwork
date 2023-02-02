package methodex;

public class Ex03 {
    
	public static void main(String[] args) { //메인메소드
		int result =add(3,5); //add호출문 및 반환값 받기 1번째
		System.out.println(result); //8
		
		int[] result2 = {0};
		add(3,5,result2);  //메소드 호출문 2번째
		System.out.println(result2[0]);
		add(3,5,9);
		System.out.println(result);

	}

	//add(3,5)
	static int add (int a, int b) { return a+b;} //add메소드 선언 인트여서 리턴값이 존재
	//오버로딩하려면 이름이 같아야한다
	static void add (int a, int b, int[] result) { result[0] = a+b;} //add메소드선언
	
	static void add (int a, int b, int result) {
		System.out.println(result);
		result =2;
	}
	
}



