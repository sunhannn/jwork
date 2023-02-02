package collectionex;
import java.util.*;
import java.util.Map.*;

public class CollEx07_01 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(0, "하늘");
		hm.put(1, "바람");
		hm.put(2, "가지");
		hm.put(3, "태양");
		System.out.println(hm+"\n");
		System.out.println("hm.get(3): "+hm.get(3));
//		System.out.println("hm.get(3): "+hm.get("3"));//숫자를 넣는곳인데 문자로 넣으면 null로 표시된다
		for(int key : hm.keySet()) {
			System.out.println("key : "+key + ", value : "+ hm.get(key));
			
		}
		//entrySet 메소드는 key, value를 볼 수 있게 해준다
		for(Entry<Integer, String> s: hm.entrySet()) {
			System.out.println(s.getKey() + ", "+ s.getValue());
		}
	}
}
