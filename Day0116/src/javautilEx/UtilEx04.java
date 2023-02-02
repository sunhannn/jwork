package javautilEx;

import java.text.SimpleDateFormat;
import java.util.*;

public class UtilEx04 {

	public static void main(String[] args) {
		int nYear;
		int nMonth;
		int nDay;

		// 현재날짜 구하기
		Calendar calendar = new GregorianCalendar();
		nYear = calendar.get(Calendar.YEAR);
		nMonth = calendar.get(calendar.MONTH) + 1;
		nDay = calendar.get(calendar.DAY_OF_MONTH);
		System.out.println("Gregorian Calendar = " + nYear + "년 " + nMonth + "월 " + nDay + "일 ");

		calendar = new GregorianCalendar(2018, 0, 5);
		nYear = calendar.get(Calendar.YEAR);
		nMonth = calendar.get(calendar.MONTH) + 1;
		nDay = calendar.get(calendar.DAY_OF_MONTH);
		System.out.println("Gregorian Calendar = " + nYear + "년 " + nMonth + "월 " + nDay + "일 ");

		// date로 구하기
		SimpleDateFormat fm1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		String date = fm1.format(new Date());
		System.out.println("현재시간 년월일 = " + date);

		SimpleDateFormat fm2 = new SimpleDateFormat("yyyy년 MM월 dd일HH시 mm분 ss.S초 a");
		String date1 = fm1.format(new Date());
		System.out.println("현재시간 시분초 = " + date1);
		fm2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 ww째주");
		date1 = fm2.format(new Date());
		System.out.println("현재는 일년 중 몇째주 = " + date1);
	}

}
