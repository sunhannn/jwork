package stringex;

public class IndexOfClass {

	public static void main(String[] args) {
		String a = "Good Afternoon!!";//0123 4 57890101112131415 인덱스 오브는 왼쪽에서부터 가장먼저나온 똑같은단어를 찾고 인덱스번호를 가져온다
		System.out.println("1번. "+a.indexOf("noon"));//10
		System.out.println("2번. "+a.indexOf(" Af"));//4//공백부터 시작해서 공백자리의 인덱스부터 가져온다
		
		String hello = "HelloWorld_MyWorld";
		System.out.println("3번. "+hello.indexOf("World"));//5  똑같은 단어가있어도 맨앞자리에 자리부터 알려준다
		System.out.println("4번. "+hello.indexOf("World",10));//13   10번부터 단어를 찾아달라 
		System.out.println("5번. "+hello.lastIndexOf("World"));//13    라스트인덱스는 오른쪽부터 카운트한다 그래서 w가 있는 자리가 마지막..?자리..? 
		System.out.println("6번. "+hello.lastIndexOf("World",14));//13  문자열 검열..?을 오른쪽부터 시작해서 4에서 끊어도 뒤에서부터 읽어들여서 13으로 보여준다<뒤에서부터 있는 단어의자리
		
		hello = "AaBbCc"; //아스키코드 값으로 인덱스 찾기
		System.out.println("7번. "+hello.indexOf(65));
		System.out.println("8번. "+hello.indexOf(99));
		
	}

}
