package interfacegroup;

public interface Module {
	int MIN_VOLUMN =0;     //상수
	int MAX_VOLUMN = 50;
	int MIN_LIGHT =0;
	int MAX_LIGHT =100;
	
	void powerOn();       //추상메소드
	void powerOff();
	void powerRestart();
	void keyPress();
	void keyClick();
	void volumnUp();
	void volumnDown();
	void lightUp();
	void lightDown();
}
