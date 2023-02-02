package interfacegroup;

public class Mobile extends ModuleImpl {
//전원 온/오프/재시작, 볼륨 업/다운, 밝기 업/다운
	ModuleImpl m =new ModuleImpl();
	
	Mobile(){System.out.println("Mobile기능을 시작합니다");}
	
	public void powerOn() {m.powerOn();}
	public void powerOff() {m.powerOff();}
	public void powerRestart() {m.powerRestart();}
	
	public void volumnUp() {m.volumnUp();}
	public void volumnDown() {m.volumnDown();}
	
	public void lightUp(){m.lightUp();}
	public void lightDown(){m.lightDown();}
}
