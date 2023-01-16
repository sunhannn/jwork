
public class Esca {

	public static void main(String[] args) {
		//printf()우와 하나도 모르겠다
		
		String s ="문자열 출력";
		int i =10;
		System.out.println(s+ " " +i);
		System.out.printf("%d\n", 15);//\n은 줄바꿈인데.. %d는 뭐지10진수
		System.out.printf("%o\n", 17);//8진수
		System.out.printf("%x\n", 11);// 핵사..?? 소문자a가 출력..?//16진수 10번째에 알파벳이출력된다
		System.out.printf("%X\n", 10);// 대문자로 쓰게되면 대문자가 출력된다
		System.out.printf("%s\n", s); //오른쪽 문자열을 출력해라
		System.out.printf("%f\n", 3.2582);//%f 는 소수점자리표시인데 숫자로 지정해주지않으면 기본값6자리로표시해준다
		System.out.printf("%010.2f\n", 3.2582); //10자리안에 우측의 숫자를 다 넣어라 근데앞에0을 넣으면 앞에 다 0으로 채워줌.2f는 소수점뒷두자리에서 반올림 
		System.out.printf("%-10d과 %.4f\n", 10, 3.2582);//-는 왼쪽에서부터 시작해서 10번째에 d는 우측에쓴 숫자를나타내.4f는 소수점4자리
		
		
		}

}
