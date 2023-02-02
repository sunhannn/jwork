package conex;

public class FruitsEx {
	public static void main(String[] args) {
		//자료형 객체명 = 뉴 생성자();
		Fruits f = new Fruits();
		f.fmd("사과",20000,"청송");
//		System.out.println("과일명: " f.getName() +", 금액: " f.getPrice()+", 원산지: "+f.getSpace());
		System.out.printf("과일명: %s, 금액: %d, 원산지: %s\n", f.getName() ,f.getPrice(),f.getSpace());
 }
}




class Fruits{
	
	String name ;
	int price;
	String space;
	
	public void fmd(String name,int price,String space) {
		this.name =name;
		this.price =price;
		this.space =space;
	}
	
	String getName() {return name; }
	int getPrice() {return price; }
	String getSpace() {return space;}
	
	
}