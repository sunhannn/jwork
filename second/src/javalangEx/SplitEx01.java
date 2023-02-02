package javalangEx;

public class SplitEx01 {

	public static void main(String[] args) {
		String str = "123::4:67:10::::"; 
		System.out.println(str + "\n==============================\n");
		
		String[] noLimit = str.split(":"); 
		System.out.println("-----noLimit-----" + noLimit.length);
		for (int cnt =0; cnt< noLimit.length; cnt++ ) 
			System.out.print("["+cnt + "]" + noLimit[cnt] + "\t"); 
		System.out.println("\n");
		
		//구분자, 인덱스-1배열까지
		String[] limitTwo = str.split(":", 2); 
		System.out.println("-----limitTwo-----" + limitTwo.length);
		for (int cnt =0; cnt< limitTwo.length; cnt++ ) 
			System.out.print("["+cnt + "]" + limitTwo[cnt] + "\t"); 
		System.out.println("\n");
		
		
		String[] limitPlus = str.split(":", 7); 
		System.out.println("-----limitPlus-----" + limitPlus.length);
		for (int cnt =0; cnt< limitPlus.length; cnt++ ) 
			System.out.print("["+cnt + "]" + limitPlus[cnt] + "\t");
		System.out.println("\n");
		
		
		//구분자 모두 배열로 구분, 값이 없는 이후 구분자와 값은 무시함(디폴트 0임) noLimit와 동일
		String[] limitZero = str.split(":", 0); 
		System.out.println("-----limitZero-----" + limitZero.length);
		for (int cnt =0; cnt< limitZero.length; cnt++ ) 
			System.out.print("["+cnt + "]" + limitZero[cnt] + "\t"); 
		System.out.println("\n");

		
		//구분자가 없을 때까지 값이 없어도 표현
		String[] limitMinus = str.split(":", -1); 
		System.out.println("-----limitMinus-----" + limitMinus.length);
		for (int cnt =0; cnt< limitMinus.length; cnt++ ) 
			System.out.print("["+cnt + "]" + limitMinus[cnt] + "\t"); 
	}

}
