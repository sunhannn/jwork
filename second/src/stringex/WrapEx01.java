package stringex;

public class WrapEx01 {

	public static void main(String[] args) {

		String str = new String("Java");
		System.out.println("원본 문자열 : " + str);
		System.out.print("charAt() 메소드 호출 후 원본 문자열 : ");
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println("\ncharAt(0) 메소드 호출 후 원본 문자열 : " + str.charAt(0));
		System.out.println("=====================================");

		String s = "50";
		int i = Integer.parseInt(s);
		System.out.println(i);
		System.out.println(Integer.valueOf(s).getClass());
//		System.out.println(Integer.parseInt(s).getClass().getName());	
		
		s = "3.14";
		System.out.println(Double.parseDouble(s));
		System.out.println(Double.valueOf(s).getClass().getName());
		float f = Float.parseFloat(s);
		System.out.println(f);
		System.out.println(Float.valueOf(s).getClass().getName());
		System.out.println("=====================================");


		double d = 3.141592;
		s = String.valueOf(d);
		System.out.println(s);

		i = 50; //int
		Integer i1 = 50; //int
		System.out.println(Integer.toString(i));
		System.out.println(i1.toString());
		f = 3.141592f;
		System.out.println(Float.toString(f));
		long l = 329L;
		System.out.println(Long.toString(l));
		System.out.println("=====================================");

	}

}
