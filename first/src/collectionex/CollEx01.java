package collectionex;
//컨트롤 쉬프트 o
import java.util.*;
//import java.util.Arraylist
//import java.util.Iterator;
//import java.util.List;

public class CollEx01 {

	public static void main(String[] args) {
		//리스트생성
		/*<클래스급>배열요소를 스트링으로 넣겠다*/
		ArrayList<String>arrList =new ArrayList<String>();//리스트를 상속받음 공간만 할당받음
		
		//리스트에 요소의 저장
		arrList.add("넷");//.add는 방을 늘림 인덱스0
		arrList.add("둘");//인덱스1
		arrList.add("셋");//인덱스2
		arrList.add("하나");//인덱스3
		
		//리스트 요소의 출력
		for (String s: arrList)/*<-배열객체이다 다른건 주소값을나타내지만 얘는 배열을보여줌*/ 
		{System.out.println(s);}
		
		List<String> lst = new ArrayList<String>();
		lst.add("alpha");//인덱스0
		lst.add("beta");//인덱스1
		lst.add("charlie");//인덱스2
		System.out.println("1st객체: "+lst);//배열객체를 불러줌
		
		Iterator<String>iter = lst.iterator();
		//Iterator iter =lst.iterator();
		while (iter.hasNext()) /* 트루나 펄스로 나눠진다*/{ //hasNext는 추상메소드이다
			String str =iter.next();
			System.out.println(str);
		}
		for(String str : lst) {System.out.println(str);}
		
	}
}
