package methodex;

public class Ex04 {
//메소드 오버로드 이름이 같아야한다
	static void prn(int x, int y, int z) {System.out.println(x+"\t"+y+"\t"+z);	} //10	20	30 줄내림
	static void prn(int x, int y) {System.out.println(x+"\t"+y);} //40	50 줄내림
	static void prn(int x) {System.out.println(x);}//60
	
	
    public static void main(String[] args) {
		prn(10, 20, 30); //메소드 호출문 반환값없어요 5번줄에 보이드가 들어가서 리턴이 필요없어요
		prn(40,50);
		prn(60);

	}

}
