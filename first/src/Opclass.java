
public class Opclass {
	public static void main(String[] args) {
//3점 미만인 학생들 명단 모두 출력되도록 수정
/*
 * 출력값
 * ---------------------------
 * 박희동 또치 마이콜
 * 
 * ----------------------------		
 */
		
	int i = 3;
	String str = "";
	switch(i) {
	case 5 : str += "고길동 "; break;
	case 4 : str += "도우넛 "; break;
	case 3 : str += "둘리 "; 
//	str = "둘리";
	case 2 : str = "박희동 ";
//	str = "박희동"
	case 1 : str += "또치 "; 
//	str = "박희동 또치"
	default : str += "마이콜 "; 
//	str = "str = 박희동 또치 마이콜"
	
//	이름 뒤에 한칸씩 공백이 있음, 원래+=가 아닌 = 인데 쉽게 힌트 받아서 +=인거임
//	케이스 마이콜부터 0 123 하고 하나씩 끊기니까 브레이크를 지워줌 그럼 둘리는 3미만이라 브레이크를
//	지웠을텐데 둘리가 나옴 그럼 둘리 아래 박희동 +=을 = 으로 바꿔주기
	} System.out.println(str);
	
  }
     	
}
	