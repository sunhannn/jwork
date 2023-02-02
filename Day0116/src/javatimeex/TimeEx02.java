package javatimeex;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class TimeEx02 {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm.ss.SSS a");
		String date = LocalDate.now().atStartOfDay().format(formatter);
		System.out.println("금일 자정 : " + date + "\n");

		LocalDateTime tomorrow = LocalDateTime.now().plusDays(1);
		date = tomorrow.format(formatter);
		System.out.println("내일 현재 시간 : " + date + "\n");

		tomorrow = LocalDateTime.now().plusDays(1).with(LocalTime.MAX);
		date = tomorrow.format(formatter);
		System.out.println("내일 마지막 시간 : " + date + "\n");

		tomorrow = LocalDateTime.now().plusDays(1).with(LocalTime.MIN);
		date = tomorrow.format(formatter);
		System.out.println("내일 처음 시간 : " + date + "\n");

		LocalDateTime todate = LocalDateTime.now().plusDays(1).with(LocalTime.NOON);
		date = tomorrow.format(formatter);
		System.out.println("오늘 정오 시간 : " + date + "\n");

		todate = LocalDateTime.now();
		String dayOfWeek = todate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
		date = tomorrow.format(formatter);
		System.out.println(date + " " + dayOfWeek);

	}

}
