
public class Practise001 {

	public static void main(String[] args) {
		int score = 86;
		String grade;
		// {} 중괄호 생략 조건 : 실행문이 한 줄일 경우만 생략 가능하다.
		if (score >= 90) {
			if (score >= 96) grade ="A+";
			else if (score == 95) grade ="A0";
			else grade ="A-";
		
		} else if (score >= 80) {
			if (score >= 86) grade ="B+";
			else if (score == 85) grade ="B0";
			else grade ="B-";
			
		}else if (score >= 70) {
			if (score >= 76) grade ="C+";
			else if (score == 75) grade ="C0";
			else grade ="C-";
			
		}else if (score >= 60) {
			if (score >= 66) grade ="D+";
			else if (score == 65) grade ="D0";
			else grade ="D-";
			
		}else {
			grade = "F";
			
		}
		System.out.println("학점은 "+ grade+ "입니다.");
		
		int i = 3;
		if (i <=5) System.out.println("1번");
		else if ( i <= 4) System.out.println("2번");
		else if (i <= 3) System.out.println("3번");
		else if (i <=2 ) System.out.println("4번");
		else System.out.println("5번");
		
		System.out.println("\n========================\n");
		
		if (i <= 5) System.out.println("1번");
		if ( i <= 4) System.out.println("2번");
		if (i <= 3) System.out.println("3번");
		if (i <= 2 ) System.out.println("4번");
		else System.out.println("5번");
		
		
		
		
		
		
		
		
	}

}
