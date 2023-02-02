package generic_002_yes;

public class Tv {
	String programeName;
	int channel;
	int volumn;
	int light;
	
public Tv() {}

public Tv(String programeName, int channel, int volumn, int light) {
	super();
	this.programeName = programeName;
	this.channel = channel;
	this.volumn = volumn;
	this.light = light;
}

public String getProgrameName() {return programeName;}

public void setPrograme(String programeName) {this.programeName = programeName;}

public int getChannel() {return channel;}

public void setChannel(int channel) {this.channel = channel;}

public int getVolumn() {return volumn;}

public void setVolumn(int volumn) {this.volumn = volumn;}

public int getLight() {return light;}

public void setLight(int light) {this.light = light;}


@Override
public String toString() {
	return "Tv [programeName=" + programeName + ", channel=" + channel + ", volumn=" + volumn + ", light=" + light + "]";
}

}
