package javautilEx;

import java.util.*;

public class UtilEx02 {

	public static void main(String[] args) {

		String months[] = { "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "1월" };
		String week[] = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
		Calendar calendar = Calendar.getInstance();

		System.out.println("날짜 : " + calendar);
		System.out.println(calendar.get(calendar.YEAR) + "년 ");
		System.out.println(months[calendar.get(calendar.MONTH)]);
		System.out.println(" " + calendar.get(calendar.DATE) + "일 ");
		System.out.println(week[calendar.get(calendar.DAY_OF_WEEK) - 1]);// 1부터 반환함

		System.out.println("시간 : ");
		// get(Calendar.AM_PM) = > 0: 오전, 1: 오후
		if (calendar.get(calendar.AM_PM) == 0)
			System.out.println("오전 ");
		else
			System.out.println("오후 ");
		System.out.print(calendar.get(calendar.HOUR) + "시 ");
		System.out.print(calendar.get(calendar.MINUTE) + "분 ");
		System.out.println(calendar.get(calendar.SECOND) + "초");

		System.out.println(calendar.get(calendar.YEAR));
		System.out.println(". " + calendar.get(calendar.MONTH));// 0부터 리턴
		System.out.println(". " + calendar.get(calendar.DATE));// 0부터 리턴
		System.out.println(". " + calendar.get(calendar.DAY_OF_WEEK));// 요일 : 1부터 리턴
		System.out.println();

		calendar.set(Calendar.YEAR, 2018);
		calendar.set(Calendar.MONTH, calendar.JANUARY);
		calendar.set(Calendar.DATE, 5);
		calendar.set(Calendar.HOUR, 1);
		calendar.set(Calendar.MINUTE, 13);
		calendar.set(Calendar.SECOND, 56);

		System.out.println(calendar.get(calendar.YEAR));
		System.out.println(". " + calendar.get(calendar.MONTH));// 0부터 리턴
		System.out.println(". " + calendar.get(calendar.DATE));// 0부터 리턴
		System.out.println(". " + calendar.get(calendar.DAY_OF_WEEK));// 요일 : 1부터 리턴

	}

}
