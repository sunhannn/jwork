package javalangEx;

public class LangEx01 {

	public static void main(String[] args) {
		char a[] = {'b', ' ','A', '5', '한'};//배열객체 초기화 5칸 length()자료형 char
		
		for (int i =0; i < a.length; i++) {//배열객체
			System.out.println("a["+i+"] 요소 + "+a[i]);
			if(Character.isDigit(a[i])) System.out.println(" : 숫자");//isDigit 숫자이냐 아니냐
			if(Character.isLetter(a[i])) System.out.println(" : 문자"); //isLetter 문자이냐 아니냐
			if(Character.isWhitespace(a[i])) System.out.println(" : 공백문자");// isWhitespace 흰배경 공백이냐아니냐
			if(Character.isUpperCase(a[i])) System.out.println(" : 대문자");
			if(Character.isLowerCase(a[i])) System.out.println(" : 소문자");//해당되는것만 출력된다 배열 0번부터 하나하나 트루퍼스구분해서 출력함
			
		}
	}

}
