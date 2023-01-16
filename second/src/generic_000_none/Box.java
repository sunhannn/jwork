package generic_000_none;

public class Box {
	private Object object;
	public Object get() {
		return object;
		
	}
	public void set(Object object) { //오브젝트로 하면 나중에 다운캐스팅 신경써야한다
		this.object=object;
	}
}


