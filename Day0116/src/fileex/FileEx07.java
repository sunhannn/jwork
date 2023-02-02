package fileex;

import java.io.*;

public class FileEx07 {

	public static void main(String[] args) {
		try {
			OutputStream output = new FileOutputStream("C:/jowrk/Output.txt");
			String str = "오늘 날시는 아주 덥습니다.";
			byte[] by = str.getBytes();
			output.write(by);
			output.close();

			FileInputStream fis = new FileInputStream("c:/jwork/Output.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			int c;
			while ((c = isr.read()) != -1) {
				System.out.println((char) c);
			}
			isr.close();
			fis.close();
			System.out.println();
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

	
}
