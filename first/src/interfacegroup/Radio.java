package interfacegroup;

public class Radio extends ModuleImpl {
//전원 온/오프, 볼륨 업/다운
	Radio(){System.out.println("Radio기능을 시작합니다");}
	
	public void powerOn() {super.powerOn();}
	public void powerOff() {super.powerOff();}
	public void volumnUp() {super.volumnUp();}
	public void volumnDown() {super.volumnDown();}
}
