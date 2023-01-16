package conex;

public class CarEx {

	public static void main(String[] args) {
		//자료형 객체명 = 뉴 생성자();
		Car c1 = new Car();
		c1.carMd("모닝",2023,350000);
//		System.out.println(c1.type + ", " c1.year + ", " +c1.km);
		System.out.printf("차종: %s, 년식: %d, 주행거리: %,d\n", c1.getType() ,c1.getYear(),c1.getKm());
 }
}
class Car{
	//멤버변수
	String type ;//null예약어 (어떤값이 오는지 모른다)
	int year;
	int km;
	final int con;
	
	Car(){ //class 안에 중괄호만 해서도 들어있으면 초기화 블록
		con =5;
	}
	
	public void carMd(String type,int year,int km) {
		this.type =type;
		this.year =year;
		this.km =km;
	}
	String getType() {return type; }
	int getYear() {return year; }
	int getKm() {return km;}
	
	
}