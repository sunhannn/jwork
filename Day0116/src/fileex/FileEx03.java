package fileex;

import java.io.*;

public class FileEx03 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("stream.txt");
		// 바이트(숫차형) 스트림 파일을 추력하기 위한 객체 fos생성

		for (int i = 0; i < 5; i++) {
			fos.write(i);
		}
		fos.close();
		System.out.println("ByteStreamFile을 생성");

		FileWriter fw = new FileWriter("data1.txt");
		for (int i = 0; i < 5; i++) {
			fw.write(i);
//			String s = i+"";
//			fw.write(s);
		}
		fw.close();
		System.out.println("FileWriter을 생성");
		
		FileInputStream fis = new FileInputStream("stream1.txt");
		// 바이트 스트림 입력을 위한 객체 fis 생성

		int i;
		while ((i = fis.read()) != -1) {
			System.out.println(i);
		}
		System.out.println("ByteStream을 File로부터 입력");
		fis.close();
	}

}
