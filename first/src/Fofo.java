
public class Fofo {

	public static void main(String[] args) {
		
		System.out.println("무한루트 for문");
	    int i =1;
	    for(; ;) {
			System.out.print((i!=1 ?" ":"") + i); //i가 1이랑 같지않으면 (!) "" :빈문자열
				if(++i >10)break;
			}
			System.out.println("\n종료후 i의 값:"+i);
			System.out.println("\n====================\n");
			
			System.out.println("무한루트 while문");
		i =1;
		while (true) {
			System.out.print((i!=1?" ": "")+i);
			if(++i >10)break;
		   }
		System.out.println("\n종료후 i의 값:"+i);
		System.out.println("\n====================\n");
		
		System.out.println("무한루트do ~ while문");
	    i =1;
		do {
			System.out.print((i!=1 ?" ":"") + i);
		if (i++ >10) break; //전위와 후위일때 값이다르다
		}while (true);
		System.out.println("\n종료후 i의 값:"+i);
	}

}
