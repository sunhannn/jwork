package generic_004_bounded;

public class Grandchild extends Father{//Ancestor도 가지고있음

	@Override
	public void ancestor() {
		System.out.println("손주 또는 자식 메소드 호출");
	}

}
