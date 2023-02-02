package stringex;

public class CompareEx {

	public static void main(String[] args) {
		String str = new String("abcd");
		System.out.println("원본 문자열 : "+str);
		System.out.println("0-1번. 문자열개수비교: "+ str.length()+"개 -2개 : "+str.compareTo("ab"));
		System.out.println("0-2번. 아스키코드 차 : "+(int)'a'+ "-"+ (int)'b'+" : "+str.compareTo("bc"));
		
		System.out.println("1번. 아스키코드 차 : "+(int)'a'+"-"+(int)'b'+" : "+str.compareTo("bcef"));
		System.out.println("2-1번. 문자열개수비교 : "+ str.compareTo("abcde"));
		System.out.println("2-2번. 아스키코드 차 : "+(int)'a'+ "-"+(int)'u'+" :"+str.compareTo("uvwxyz"));
		
		System.out.println("3번. "+str.compareTo("abcd"));
		System.out.println("4번. "+str.compareTo("adef"));
		System.out.println("5번. "+str.compareTo("Abcd"));
		System.out.println("6-1번. "+str.compareToIgnoreCase("Abcd"));//문자열케이스입니다
		System.out.println("6-2번. "+str.compareToIgnoreCase("ACd"));//왜 이걸써야하지 오름차순?내림차순?
		System.out.println("compareTo() 메소드 호출 후 원본 문자열 : "+str);
		System.out.println("\n===================================\n");
		
		Integer x =3; Integer y =4; Double z =1.0;
		//숫자비교시 -1(<), 0(==), 값 중 1개를 반환함
		System.out.println("7번. x<y의미 : "+x.compareTo(y));
		System.out.println("8번. x==3의미 : "+x.compareTo(3));
		System.out.println("9번. x>2의미 : "+x.compareTo(2));
		System.out.println("10번. z<2.7의미 : "+z.compareTo(2.7));
	}

}
