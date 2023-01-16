package conex;

public class TraLiEx {
	public static void main(String[] args) {
		TraLi t = new TraLi();
		t.ryg("빨간불","노란불","초록불");
		System.out.printf("멈추세요: %s, 기다리세요: %s, 건너가세요: %s", t.getRed() ,t.getYellow(),t.getGreen());
	}
}


class TraLi {
	String red;
	String yellow;
	String green;
	
	
	public void ryg(String red, String yellow, String green) {
		this.red =red;
		this.yellow =yellow;
		this.green =green;
		
	}
	String getRed() {return red; }
	String getYellow() {return yellow; }
	String getGreen() {return green;}
}
