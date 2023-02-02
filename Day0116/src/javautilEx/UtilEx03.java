package javautilEx;

import java.util.*;
import java.text.*;

public class UtilEx03 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE));

		Date day = cal.getTime();
		System.out.println("day : " + day);
		System.out.println();
		Date nowday = new Date();
		System.out.println("nowday : " + nowday);

		SimpleDateFormat sdf1, sdf2, sdf3;
		sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일"); // 대문자 M으로 표기
		sdf2 = new SimpleDateFormat("yyyy- MM-dd HH:mm:ss"); // 대문자 H24시간으로 표시 h12시간으로 표시
		sdf3 = new SimpleDateFormat("yyyy-MM dd hh:MM a");

		System.out.println("sdf1 : " + sdf1.format(day));
		System.out.println("sdf2 : " + sdf2.format(day));
		System.out.println("sdf3: " + sdf3.format(day));
		sdf2 = new SimpleDateFormat("yy-M-d h:m");
		System.out.println("sdf2 : " + sdf2.format(day));

	}

}
