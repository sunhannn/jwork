package methodex;

public class Ex02 {
    //메소드선언
	static int abs(int x) { //3번으로실행
		int y; //변수선언
		if(x < 0) y = -x;  //조건문
		else y = x;
		return y; 
		
	}
	//메인메소드 선언
	public static void main(String[] args) { //1번으로 실행
		int a=-5 , result;  //2번으로 실행
		result = abs(a); //메소드호출문
		System.out.println(a +"의 절대값은 "+result);
		
		System.out.println(10 + "의 절대값은 "+abs(10)); //메소드호출문+출력문
		
	}

}
