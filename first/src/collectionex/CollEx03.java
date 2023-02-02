package collectionex;

import java.util.ArrayList;

public class CollEx03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("수박");
		list.add("귤");
		list.add("딸기");
		list.add("체리");
		
		prn(list);//[사과][수박][귤][딸기][체리]
		
		System.out.println(">>인덱스 2인 위치에 키위 삽입<<");
		list.add(2, "키위");//메소드가 오버로딩되어있다
		prn(list);
		
		System.out.println(">>인덱스4인 위치에 데이터를 포도로 변경<<");
		list.set(4,  "포도");
		prn(list);
		
		System.out.println(">>인덱스1인 위치에 데이터를 제거<<");//제거하면 방이 땅겨진다
		list.remove(1);
		prn(list);
		
		System.out.println(">>사과 데이터를 찾아서 제거<<");//중복일경우 맨앞에있는 데이터를 제거한다
		list.remove("사과");
		prn(list);
	}
	static void prn(ArrayList list) {
		for(int i = 0; i <list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println("\n");
	}
}
