package collectionex;

import java.util.Hashtable;
import java.util.Map.Entry;

public class CollEx08 {
	public static void main(String[] args) {
		Hashtable<String, Integer> ht =new Hashtable<>();
		ht.put("hello", 123);
		ht.put("wolrd", 321);
		//key, value 각각에 null을 허용하지 않는다.
		//ht.put("hello",null); //null은 해쉬테이블에서 안쓰인다
		//ht.put(null,123);
		for(String key : ht.keySet()) {
			System.out.println(ht.get(key));
		}
		for(Entry<String, Integer> entry : ht.entrySet()) {
			System.out.println("key:"+entry.getKey() + "  value:"+ entry.getValue());
		}
	}

}
