package stringex;

public class ReplaceEx {

	public static void main(String[] args) {
		String b = "Welcome to Java World";
		System.out.println(b.replace("Java", "Computer"));//기존문자열,바꿀문자열
		System.out.println(b.replaceAll("Java", "Computer"));//정규표현식? 해당되는 패턴으로 바꾼다..?
		
		String str = "abcdefghijk";
		System.out.println("result ===> "+str.replaceAll("[abchij]", "굿"));//좀더 효율적입니다
		System.out.println("result ===> "+str.replaceAll("[^abchij]", "굿"));//^는 부정입니다 그 문자열을 제외한걸 바꿔주세요
		
		System.out.println("result ===> "+str.replace("a", "굿").replace("b", "굿").replace("c", "굿").replace("h", "굿").replace("i", "굿").replace("j", "굿"));
		System.out.println("result ===> "+str.replace("abc", "굿~").replace("hij", "럭키~"));
	}

}
