package methodex;

class Point03 {
   private int x;
   private int y;
   public void setX(int x) {
	   //this.x=x; 
	   x=x;
   }
   public void setY(int y) {
	   //this.y=y; 
	   y=y;
   }
   public int getX() {
	   return x;
   }
   public int getY(){
	   return y;
   }
} //3줄부터 18줄까지 인스턴스

public class Ex08{
	public static void main(String[] args) {
		Point03 pt02 = new Point03(); // 자료형 객체명 = 생성자호출문(객체 생성문)
		pt02.setX(10);
		pt02.setY(20);
		System.out.println(pt02.getX()+" " +pt02.getY());
	}
}