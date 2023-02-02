package modex;

class Return{
	public void say_nick(String nick) {
		if ("fool".equals(nick)) {
			return; //return키워드의 또 다른 쓰임새, 메소드의 종료 중괄호 빠져나감.
		}
		System.out.println("나의 별명은 "+nick+" 입니다");
	}
}
public class ReturnEx {
	public static void main(String[] args) {
		Return rt = new Return();
		rt.say_nick("fool0123");
		System.out.println("출력결과");
	}
}
