package com.study;

public class Practice04 {
/*
 *  만양에 아이디가 1111이거나, 비밀번호가 2222인 경우에는 로그인 처리 아니면 입력값이 잘못되었습니다. 처리
 *  
 *  && 논리곱 : 둘다 참인 경우만 참, 나머짓 거짓
 *  || 논리합 : 둘다 거짓인 겅우만 거짓, 나머지 참
 * 
 * 
 */
	public static void main(String[] args) {
	int id =2222;
	int pw = 2222;
	
	if (id == 1111 || pw == 2222) {
		System.out.println("로그인되었습니다.");
	}else {
		System.out.println("입력값이 잘못되었습니다.");
	}
		
	}

}
