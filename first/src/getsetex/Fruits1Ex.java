package getsetex;

public class Fruits1Ex {//디폴트

	public static void main(String[] args) {
		int total;
		conex.Fruits1 f =new conex.Fruits1();
		Fruits1 f1 =new Fruits1(30,30,30);
		total = f1.gettotal();
		System.out.println("객체 f1의 총 개수= "+ total);
		System.out.println("객체 f1의 apple 개수= "+f1.getApple());
		System.out.println("객체 f1의 straw 개수= "+f1.getStraw());
		System.out.println("객체 f1의 grapes 개수= "+f1.getGrapes());
		

	}

}
