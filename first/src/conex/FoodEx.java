package conex;

public class FoodEx {
  public static void main(String[] args) {
	  // 김치 1년 20000원
      Food a = new Food();
      a.fmd("김치", 1, 20000); //fmd를 받지말고 따로 해보기
      
    //System.out.println(a.fname + ", " + a.fyear + ", "+ a.fprice);

      System.out.println(a.getName() + ", " + a.fyear() + "년, "+ a.fprice() + "원");
      //출력문을 이렇게 작성하고 아래에리턴값 메소드를 작성한 이유는 이거 위에 출력문에서 food클래스에 직접 개입하는게 안좋기때문
  }
}


class Food {
	String fname; //김치
	int fyear; //1
	int fprice;//20000
	void fmd(String fname, int fyear, int fprice){ //a.fmd("김치", 1, 20000);
		this.fname = fname;
		this.fyear = fyear;
		this.fprice = fprice;
	//	System.out.println(fname + ", " + fyear + ", "+ fprice);
		
	if(fyear > 1) fprice = 30000;
	if(fyear > 2) fprice = 40000; fname = "묵은지";	
	//fmd를 받지말고 따로 해보기
	} 
			
	String getName() {
		return fname;
	}
	int fyear() {
		return fyear;
	}
	int fprice() {
		return fprice;
	}
	
}