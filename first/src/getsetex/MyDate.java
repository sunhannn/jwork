package getsetex;

public class MyDate {
	private int y, m, d;
	private String str;

	public MyDate(int d, int m, int y) {this.y = y; this.m =m; this.d=d;}

	private void setMyDate(int r) {
		if (r == 1)
			str = "유효한 날짜입니다.";
		else
			str = "유효하지 않은 날짜입니다.";
	}

	public String getMyDate() {
		return str;
	}

	public void isValid() {
		int r;
		if (y % 4 == 0) {
			switch (m) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (d <= 31)
					r = 1;
				else
					r = 0;
				break;
			case 2:
				if (d <= 29)
					r = 1;
				else
					r = 0;
				break;
			default:
				if (d <= 30)
					r = 1;
				else
					r = 0;
			}
		} else {
			switch (m) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (d <= 31)
					r = 1;
				else
					r = 0;
				break;
			case 2:
				if (d <= 28)
					r = 1;
				else
					r = 0;
				break;
			default:
				if (d <= 30)
					r = 1;
				else
					r = 0;
			}
		}
		setMyDate(r); //setMyDate()호출문
	}
}