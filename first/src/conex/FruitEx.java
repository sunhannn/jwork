package conex;

class Fruits{
	  String fname;
	  int fprice;
	  String fspace;
	  public void fmd(String fname, int fprice, String fspace) {
		  this.fname=fname;
		  this.fprice=fprice;
		  this.fspace=fspace;
		System.out.printf("과일명 : %s, 금액 : %,d, 원산진 : %s\n", fname, fprice, fspace);
	  }
	 String getName() { return fname; }
     int getPrice() { return fprice; }
     String getSpace() { return fspace; }
	 
     
     
}

public class FruitEx {
  public static void main(String[] args) {
	  
	  Fruits fe = new Fruits();
	  fe.fmd("사과", 20000, "청송");
	 // System.out.print("과일명 :"+fe.getName() + "금액:" + 
	 // fe.getPrice() + "원산지 + " + fe.getSpace());
	  
	 // System.out.printf("과일명 : %s, 금액 : %,d, 원산진 : %s\n",fe.getName(),
	 //		  fe.getPrice(), fe.getSpace());
  }
}
