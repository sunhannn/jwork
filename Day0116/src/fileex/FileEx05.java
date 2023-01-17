package fileex;

import java.io.*;

public class FileEx05 {

	public static void main(String[] args) throws IOException {

		File f = new File("C:/jwork/Day0116/fileex/FileEx01.java");
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");// 8

		System.out.println("경로를 제외한 파일이름 - " + f.getName());
		System.out.println("확장자를 제외한 파일이름 - " + fileName.substring(0, pos));
		System.out.println("확장자 - " + fileName.substring(pos + 1));
		System.out.println("경로를 포함한 파일이름 - " + f.getPath());
		System.out.println("파일의 절대경로 - " + f.getAbsolutePath());
		System.out.println("파일이 속해있는 디렉토리 - " + f.getParent());
		System.out.println();
		System.out.println("File.separator - " + File.separator);
		System.out.println("File.separatorChar - " + File.separatorChar);
		System.out.println("현재 디렉토리 =  - " + System.getProperty("user.dir"));
		System.out.println("f.exists()" + f.exists());

	}

}
