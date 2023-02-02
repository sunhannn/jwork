package interfaceex;
class Triangle implements Color{
	int color = 0;
	public int getColor() {return color;}
	public void setColor(int c) {color = c;}
	
}
public class ColorInterfaceEx03 {
	public static void main(String[] args) {
		Triangle ref = new Triangle();
		ref.setColor(Color.RED);
		switch(ref.getColor()) {
		case 1: System.out.println("  빨간색");break;
		case 2: System.out.println("  초록색");break;
		case 3: System.out.println("  파란색");break;
		}
		System.out.println("  삼각형");
	}
	

}
