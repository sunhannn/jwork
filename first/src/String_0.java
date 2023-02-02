
public class String_0 {

	public static void main(String[] args) {
		//27일 복습
		double pi = 3.141592;
		double r =5.0;//자료형을 int 보다는 다른자료형이랑 동일하게 해준다
		double area;
		
		area = r*r*pi;
		System.out.println("반지름이"+ r +"인 원의 면적은"+ area);
//전위연산자 항 앞에 ++ --가 붙는 연산자 <먼저 처리하겠다>
		int a = 3;
		
		++a; // a= a+1 4가된다
		System.out.println("1: "+a);
		a--; //후위연산자 a가 첫번째 계산 --가 두번째계산 4에서 --를 적용하면 3이된다 
		System.out.println("2: "+a); //out 자리에 err(에러객체)이 들어가면 에러가 들어갔을때를 보여주는 객체이다 순서가 왔다갔다함
		
		int x =5;
		int y =++x; //x는 ++를 먼저 적용해서 6이 된다
		System.out.println("3: "+x + " " +y); //x=6 y=6 
		
		int x2 = 5; //첫번째로(x2=y2),두번째로(x2+1)계산한다
		int y2 = x2++; //후위연산이여서 y2는 5가 되고 ++이 나중에 오니까 x2는 6이된다
		System.out.println("4: "+x2+" "+ y2);
		
		System.out.println();
		
		int c =10, d= 10;
		int e = c;
		System.out.println("c : " + c + ", e : "+ e);
		e = ++c +d;
		System.out.println("c : " + c + ", e : "+ e);
		e = c++ +d;
		System.out.println("c : " + c + ", e : "+ e);
		
//조건문
		
		
		
	}

}
