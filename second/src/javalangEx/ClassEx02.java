package javalangEx;
import inheritanceex.VIPCustomer;
//Class.forName 클래스에 들어있는 스테틱메소드 이 주소값에있는 정보를 담아주세요
public class ClassEx02 {

	public static void main(String[] args) throws Exception{
		Class c1 = Class.forName("java.lang.String");//class 는 자료형도 존재해요 (해당자료형을 사용할수있도록 준비해놓으세요)패키지포함해서 정보기술해야해요
		System.out.println(c1.toString());//클래스까지만 출력해줘요
		System.out.println(c1.toGenericString());//포괄적인! 접근제어자 기타제어자... 제네릭까지 다 출력해줘요
		System.out.println();
		
		c1= Class.forName("java.util.List");//ex)프린트 드라이버를 준비하는 과정
		System.out.println(c1.toString());
		System.out.println(c1.toGenericString());
		System.out.println();
		
		c1= Class.forName("java.lang.Object");
		System.out.println(c1.toString());
		System.out.println(c1.toGenericString());
		System.out.println();
		
		c1= Class.forName("java.awt.event.WindowAdapter");
		System.out.println(c1.toString());
		System.out.println(c1.toGenericString());
	
		//클래스 조사 후 클래스 정보를 담는다
		c1= Class.forName(VIPCustomer.class.getName());
		System.out.println(c1);
		System.out.println(c1.toGenericString());
		//newInstance() 반환형이 Object형이므로 다운캐스팅한다
		//자바 9버전 이후에는 사용안함
		VIPCustomer v =(VIPCustomer)c1.newInstance();//(디플리케이티드)
		System.out.println("아이디 : "+ v.getAgentID());
	}

}
