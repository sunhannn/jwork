import java.util.*;
public class Practise001 {

	public static void main(String[] args) {
		
		int a, b =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두개의 수를 입력하세요 : ");
		
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		
		if (a==b) {
			System.out.println("두개의 수는 같습니다.");
		}else if (a != b) {
			System.out.println("두개의 수가 다릅니다.");
		}else {
			System.out.println("모르겠습니다.");
		}
		
		
		
		

	}

}
