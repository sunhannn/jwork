
public class Hi {
//3점 미만인 학생들 명단 모두 출력되도록 수정
	//박희동 또치 마이콜 
	public static void main(String[] args) {
	  int i =3;
	  String str="";
	  switch(i) {
	  case 5: str += "고길동 "; // str=str ="고길동";
	  case 4: str += "도우넛 "; 
	  case 3: str += "둘리 "; 
	  case 2: str = "박희동 "; 
	  case 1: str += "또치 "; 
	  default : str += "마이콜 "; 
	  
	  }
	  System.out.print(str);
	}
}
