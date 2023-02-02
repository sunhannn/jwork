package second;
import java.util.Scanner;

public class SignalLight {
   
      public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           
              
               while(true) {
            	   String car = null;
            	   car = sc.nextLine();
               
               if(car.equals("자동차")) {
                  System.out.println("==========================");
                 System.out.println("빨간불 : 멈춘다\n노란불 : 준비한다\n파란불 : 출발한다\n" );
               }else if(car.equals("보행자")) {
                  System.out.println("==========================");
                 System.out.println("빨간불 : 멈춘다\n파란불 : 출발한다\n");
               }else if(car.equals("종료")) {
                  System.out.println("프로그램을 종료합니다");
                 System.out.print("==========================");break;
               }else {
                  System.out.println("\"자동차\",\"보행자\",\"종료\" 중에서 입력해주세요");
               }
           }
       }
   }