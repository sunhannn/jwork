package methodex;

public class Ex06 {

	static void test() {
		System.out.println("매개변수 없음");}
	static void test(int a, int b) {
		System.out.println("매개변수 int "+a+ "와 int"+b);
	}
	static double test(double a) { //실수이기때문에 100.0으로 받을수있어요
		System.out.println("매개변수 double "+a);
		return a *2; //반환값이 있어요
		
	}
public static void main(String[] args) {
		double result;
		test();
		test(5, 10);
		result = test(100); //정수로 들어가나 double은 받을수있어요 인트보다 더블이 더크니까
		System.out.println("test(100)의 결과 : "+result);
		result = test(4.2);
		System.out.println("test(4.2)의 결과 : "+result);
	}

}
