package com.practice;
import java.util.*;
public class Practice003 {
/* 다음은 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를
 * 구하는 프로그램입니다. 실행 결과를 보고, 알맞게 작성해보세요
 * (참고로 16라인에서 Scanner의 nextInt() 메소드는 콘솔에 입력된 숫자를 읽고 리턴합니다.)
 */
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int  studentNum = 0;
		int [] scores = null;
		
		while(run) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = sc.nextInt();
			
			
			if (selectNo == 1) {
				System.out.print("학생수> "); studentNum = sc.nextInt();  continue;
			}else if (selectNo == 2) {
				scores = new int [studentNum]; 
				for (int i = 0; i < studentNum; i++) {
				System.out.print("scores["+i+"]>");
				scores[i] = sc.nextInt();
				}  continue;
			}else if (selectNo == 3) {
				for (int i =0;i < studentNum; i++ ) {
						System.out.println("scores["+i+"]>"+scores[i]);
				} continue;
			}else if (selectNo == 4) {
				int max = 0, sum = 0;
				double avg =0.0;
				for(int i = 0; i < studentNum; i++) {
					if (scores[i] >scores[0] ) {
						max = scores[i];
					}else {
						max = scores[0];
					}
					sum +=scores[i];
				}
					System.out.println("최고 점수 : "+max);
					avg = (double)sum / studentNum;
					System.out.println("평균 점수 :"+avg );
					continue;
			}else if (selectNo == 5) { 
				run = false;
			}
			}
		System.out.println("프로그램 종료");
	
		}
		
		
		
		
		
	}

