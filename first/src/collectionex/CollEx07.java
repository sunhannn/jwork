package collectionex;

import java.util.*;
import java.util.Map.*;
public class CollEx07 {
	public static void main(String[] args) {
		HashMap<String,Integer>hm = new HashMap<>();//1.7이상부터는 생략이 가능하다
		//key, value 로 입력이 가능
		hm.put("hello", 123);
		hm.put("world", 345);
		//key를 null로 할 수 있고 value도 null로 할 수 있다
		hm.put(null, 555);
		hm.put("nullkey", null);
		System.out.println(hm+"\n");//주소값이아니라 나열해준다
		for(String key : hm.keySet()) {
			System.out.println("key : "+key + "   value : "+hm.get(key));
		}
		//entrySet메소드는 key, value를 볼 수 잇게 해준다
		for (Entry<String, Integer> s : hm.entrySet()) {//엔트리는 키랑 벨류랑 묶음별로 하나씩뜯어서 객체에 던져준다
			System.out.println(s.getKey()+ ", "+ s.getValue());
		}
		
		LinkedHashMap<String,Integer>lhm = new LinkedHashMap<>();//링크드(최하위 클래스) 는 내가넣는 순서대로 출력된다
		lhm.put("hello", 123);
		lhm.put("world", 345);
		//key를 null로 할 수 있고 value도 null로 할 수 있다
		lhm.put(null, 555);
		lhm.put("nullkey", null);
		System.out.println(lhm+"\n");
		
		for(String key : lhm.keySet()) {
			System.out.println("key : "+key+ "   value : "+hm.get(key));
		}
		//entrySet메소드는 key, value를 볼 수 잇게 해준다
		for (Entry<String, Integer> s : lhm.entrySet()) {//엔트리도 인터페이스이다
			System.out.println(s.getKey()+ ", "+ s.getValue());
		
	}
	}
}
