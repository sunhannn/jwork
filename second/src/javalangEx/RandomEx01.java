package javalangEx;

import java.util.Random;

public class RandomEx01 {

	public static void main(String[] args) {
		Random random =new Random();
		int num = random.nextInt();//이것만 출력하면 음수가 나온다
//		int num = random.nextInt(11);//<-음수로 지정하면 오류가난다 
//		//nextInt에 값 지정이 안되면 int 의 유효범위 내의 <정수>가 임의 출력
		System.out.println("0부터 10 사이의 임의의 정수 값 : "+num);
//		
//		float f = random.nextFloat();
//		System.out.println("0.0부터 1.0사이의 임의의 실수 값 : "+f);
//		f = (random.nextFloat()*10);
//		System.out.println("0.0부터 10.0사이의 임의의 실수 값 : "+f);
//		
//		boolean b = random.nextBoolean();
//		System.out.println("임의의 논리값 : "+ b);
	}

}
