package interfacegroup;

public class ModuleImpl implements Module{
 int volume = 0;
 int light =0;
@Override
public void powerOn() {System.out.println("전원이 켜졌습니다");	}
@Override
public void powerOff() {System.out.println("전원이 꺼졌습니다");}
@Override
public void powerRestart() {System.out.println("핸드폰을 재시작하겠습니다");}
@Override
public void keyPress() {System.out.println("키보드를 눌렀습니다");}
@Override
public void keyClick() {System.out.println("키보드를 눌렀다 떼었습니다");}
@Override
public void volumnUp() {
	if(volume < MAX_VOLUMN) {
		this.volume++;
		System.out.println("볼륨: "+volume);
	}else {
		System.out.println("최대 볼륨입니다");
	}
	
}
@Override
public void volumnDown() {
	if(volume > MIN_VOLUMN) {
		this.volume--;
		System.out.println("볼륨: "+volume);
	}else {
		System.out.println("최소 볼륨입니다");
	}
}
@Override
public void lightUp() {
	if(light < MAX_LIGHT) {
		this.light++;
		System.out.println("밝기: "+light);
	}else {
		System.out.println("최대 밝기입니다");
	}
}
@Override
public void lightDown() {
	if(light > MIN_LIGHT) {
		this.light--;
		System.out.println("밝기: "+light);
	}else {
		System.out.println("최소 밝기입니다");
	}
}
}
