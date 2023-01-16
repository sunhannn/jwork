package javalangEx;

public class MathEx01 {

	public static void main(String[] args) {
		System.out.println("0번: " + ((int)(Math.random() * 6) +1)); //1~6사이 <정수로 다운캐스팅>   Math.random()<-0.0~1.0미만의값이 랜덤으로 나옴
		System.out.println("1번: " + ((int)(Math.random() * 6) +3)); //3~8사이 정수
		System.out.println();
		
		System.out.println(Math.abs(10));// abs는 절대값 양수
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(-3.14));
		System.out.println();
		
		System.out.println("무조건 올림처리 ceil : "+Math.ceil(10.12));//씰 10.01로 되면 11로 올리고 10.0이면 안올림
		System.out.println("무조건 내림처리 floor : "+Math.floor(10.92));//플로어 소수점자리에 뭐가 오든 다 10으로 출력하겠다
		System.out.println("반올림 처리 rint : "+Math.rint(10.52));//린트..0.5까지는 내려요 0.51부터 올림
		System.out.println("PI(원주율)의 값 : "+Math.PI);//상수 파이널
		System.out.println();
		
		System.out.println("10, 20 중에 큰 값 : "+Math.max(10, 20));
		System.out.println("10, 20 중에 작은 값 : "+Math.min(10, 20));
		System.out.println();
	}

}
