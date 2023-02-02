package collectionex;
import java.util.*;
public class CollEx06 {
	public static void main(String[] args) {
		HashMap map =new HashMap();
		map.put("castello","1234");
		map.put("java","1111");
		map.put("lang","1234");
		
		Scanner s = new Scanner(System.in);//입력을 받아들일준비가 되어있습니다
		//화면으로부터 라인단위로 입력
		
		while (true) { //무한반복문 제어어가필요
			System.out.println("id와 password를 입력해주세요");
			System.out.print("id : ");
			String id = s.nextLine().trim();//한줄단위로 값을받아서 id로 넘겨주는역할?트림은 맨왼쪽 오른쪽 공백을 지우라는거에요
			
			System.out.print("password : ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
			}else {
				if(!(map.get(id)).equals(password)){
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
				}else {
					System.out.println("id와 비밀번호가 일치합니다");
					break;//자기를 최초의 감싸고있는 와일문을 빠져나간다
				}
			}
		}//와일문의 종료중괄호
	}
}
