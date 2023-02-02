
public class Apple {

	public static void main(String[] args) {
    
	/* System.out.println("라벨 분기문 for문");
    gugudan: //머리를 선언
	for(int i =2;i<=9; i++) {
		System.out.println("구구단"+i+"단"); //브레이크 걸리고 머리로갔다가 다시 for첫번째까지만 돌아감 그래서 4단제목만출력됨
		for(int j=1; j<=9; j++) {
			if(i==4)break gugudan;//브레이크 다음 다시 머리로 돌아가세요
			System.out.println(i+"*"+j+"="+(i * j));
		}
		System.out.println();
	   }
    System.out.println("\n====================\n");
	*/
		
		
		
		
		
		System.out.println("라벨 분기문 for문");
	    gugudan: //머리를 선언 라벨
		for(int i =2;i<=9; i++) {
			System.out.println("구구단"+i+"단"); 
			for(int j=1; j<=9; j++) {
				if(i%2==0)continue gugudan;//짝수마다 컨티뉴에 걸려서 프린트를 못한상태에서 다시 라벨로감(건너뛰기느낌)
				System.out.println(i+"*"+j+"="+(i * j));
			}
			System.out.println();
		   }
	    System.out.println("\n====================\n");
		
    }
}