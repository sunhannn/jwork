package innerEx;
interface Ramda4{
	public void showString(String string); //
	
}
public class RamdaEx04 {
	public static void main(String[] args) {
		Ramda4 lamda4 = s -> System.out.println(s);
		lamda4.showString("매개변수로 람다식 전달하기");
		
		showMyString(lamda4);
		
	}
public static void showMyString(Ramda4 r) {
	r.showString("전달한 람다식 이용하여 출력");
}
}
