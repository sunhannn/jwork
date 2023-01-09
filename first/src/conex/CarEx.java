package conex;

public class CarEx {
	public static void main(String[] args) {
		Car a = new Car();
		a.cmd("그랜져", 2022, 10000);
		//System.out.printf("차종 : %s, 연식 : %,d, 주행거리 : %s\n", a.getName(),
		//		a.getYear(), a.getDistance());
	    System.out.println(a.cname + ", " + a.year + ", "+ a.distance);
	}
}


class Car{
	//속성 : 차종, 년식, 주행거리
	String cname; //null(어떤 값이 오는지 모른다.)
	int year; //0
	int distance; //0
	// final int con; -> 에러남
	//final int con=5; -> 에러안남
	
	/*final int con;
	Car(){
		con =5;
	} -> 이거 해주면 에러 안남*/
	
	/*{
	 con =5;	
	} -> 이거해주면 에러 안남*/
	
	public void cmd(String cname, int year, int distance) {
		this.cname=cname;
		this.year=year;
		this.distance=distance;
		System.out.printf("차종 : %s, 연식 : %,d, 주행거리 : %s\n",cname,year,distance);
		
	}
	
	 String getName() {return cname;}
	 int getYear() {return year;}
	 int getDistance() {return distance;}
}
