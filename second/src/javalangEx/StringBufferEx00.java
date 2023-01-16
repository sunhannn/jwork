package javalangEx;
//StringBuffer-가변형  스트링은 내용이 방대해질때 메모리를 많이 잡아먹는다 너무쉽게 자주변경해야하는건 스트링버퍼가 좋다 문자열주소가 1개로 이용되니까 메모리적게씀
public class StringBufferEx00 {
	public static void main(String[] args) {
		String str = new String("Java");
		System.out.println("str문자열 주소1: "+System.identityHashCode(str));
		str = str +" 수업";
		System.out.println("str문자열 주소2: "+System.identityHashCode(str));
		str = str +" 시간";
		System.out.println("str문자열 주소3: "+System.identityHashCode(str)+"\n");
		
		StringBuffer strb = new StringBuffer("");//가변형
		//strb = "가나다라마바사";(X)
		System.out.println(strb);
		System.out.println("strb 문자열 주소1: "+System.identityHashCode(strb));
		System.out.println("길이1: "+strb.length());
		System.out.println("공간1: "+strb.capacity()+ "\n");//공간은 문자를 입력할수있는 공간 자기맘대로 늘렸다 줄였다함
		
		strb = strb.append("Java 수업");
		System.out.println("strb 문자열 주소2: "+System.identityHashCode(strb));
		System.out.println(strb);
		System.out.println("길이2: "+strb.length());
		System.out.println("공간2: "+strb.capacity()+ "\n");
		
		strb = strb.append(" 수업 수업 수업");
		System.out.println("strb 문자열 주소3: "+System.identityHashCode(strb));
		System.out.println(strb);
		System.out.println("길이3: "+strb.length());
		System.out.println("공간3: "+strb.capacity()+ "\n");
		
		strb = strb.append(" 수업");
		System.out.println("strb 문자열 주소4: "+System.identityHashCode(strb));
		System.out.println(strb);
		System.out.println("길이4: "+strb.length());
		System.out.println("공간4: "+strb.capacity()+ "\n");
		
	}

}
