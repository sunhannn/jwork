package getsetex;

import conex.Fruit2; //conex의 Fruit2를 불러온다

   class FruitEx {

	public static void main(String[] args) {
		int total;
		//Fruit2 f = new Fruit2(); //Fruit2에 대한 객체 생성
		/*-> 이걸 conex.Fruit2 f = new conex.Fruit2();로 바꾸면
		     아래 주석 처리 된 것을 해제 하여도 오류가 나지 않음*/
		
		/*Fruit1 f1 = new Fruit1(30, 30, 30);
		total = f1.gettotal();
		//f1.count(); -> count는 private라 호출 안됨 에러남
		//f1.apple -> apple도 private임
		System.out.println("객체 f1의 총개수 = " +total);
		System.out.println("객체 f1의 apple 개수 = " + f1.getApple());
		System.out.println("객체 f1의 straw 개수 = " + f1.getStraw());
		System.out.println("객체 f1의 grape 개수 = " + f1.getGrape());*/
	}
}
