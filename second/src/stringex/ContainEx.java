package stringex;

public class ContainEx {

	public static void main(String[] args) {
		
		String str = "my java test";
		
		System.out.println(str.contains("java"));//문자열중에 단어가있니없니
		System.out.println(str.contains(" my"));//<-앞에 공백이 있어도 문자로 포함한다 그래서 false
		System.out.println(str.contains("JAVA"));//대문자도 같지않다고 함
		System.out.println(str.contains("java test"));
		
	}

}
