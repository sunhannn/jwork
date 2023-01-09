package com.study;

public class SwitchPrac02 {

	public static void main(String[] args) {
//		String s = "C"; String str;
//		switch(s) {
//		case "A" : str = "1"; System.out.println(str);
//		case "B" : str = "2"; System.out.println(str);
//		case "C" : str = "3"; System.out.println(str);
//		case "D" : str = "4"; System.out.println(str);
//		case "E" : str = "5"; System.out.println(str);
//		default : str = "6"; System.out.println(str);
//		}// break가 없어서 3이후로 전부 출력된다.
//		
		int i = 3; // 3점 미만인 학생들 명단 모두 출력되도록 수정 -> 박희동 또치 마이콜
		String str = " ";
		switch(i) {
		case 6:   str += "고길동"; break; // str = str + "고길동";
		case 5:   str += "도우너"; break;
		case 4 :   str += "둘리"; break;
		case 3 :   str += "박희동"; 
		case 2 :   str += "또치"; 
		default :   str += "마이콜"; 
		}
		System.out.println(str);
		

	}

}
