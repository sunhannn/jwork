package stringex;

public class TrimEx {

	public static void main(String[] args) {
		//공백 제거: trim()
		String str4 = "   공백  제거    공백  제거   ";
		// 3 공백 2 제거 4 공백 2 제거 3
		System.out.println("["+str4+"]");
		System.out.println("["+str4.trim()+"]");//맨왼쪽 오른쪽의 공백 제거만 가능
		System.out.println("["+str4.replace(" ","")+"]");//문자열 치환으로 가운데 공백 제거
	}

}
