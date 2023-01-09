package com.practice;

public class LottoPro {

	// 전역 변수

	private boolean duplicate = false;
	private boolean can_bonus;
	private int[] numbers;

	public LottoPro() {
		System.out.println("(System)보너스추첨은 불가합니다.");
		this.can_bonus = false;
	}

	public LottoPro(boolean can_bouns) {
		System.out.println("(System)보너스추첨도 가능합니다.");
		this.can_bonus = can_bouns;
	}

	public void printNumber() {
		if (numbers == null || numbers[0] == 0) {
			System.out.println("(System)Empty Value");
			return;
		}
		for (int i = 0; i < numbers.length; i++) {
			if (i == 6) {
				System.out.println("(Bonus)>>>" + numbers[i]);
			} else {
				System.out.println(">>>" + numbers[i]);
			}
		}
	}

	public int[] start_recommandation() {
		if (can_bonus) {
			numbers = new int[7];
		} else {
			numbers = new int[6];
		}
		int[] imsi = getNormalNumber();
		for (int i = 0; i < numbers.length; i++) {
			if (i == 6) {
				numbers[i] = getBounusNumber(numbers);
			} else {
				numbers[i] = imsi[i];
			}
		}
		return numbers;
	}

	private int getBounusNumber(int[] normal_number) {
		int bonus = 0;
		int imsi = 0;

		while (true) {
			imsi = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < normal_number.length; j++) {
				if (normal_number[j] == imsi) {
					duplicate = true;
				}
			}
			if (duplicate) {
				duplicate = false;
				continue;
			} else {
				break;
			}
		}
		bonus = imsi;
		System.out.println("(System)Success Create Bonus Number");
		return bonus;
	}

	private int[] getNormalNumber() {
		int[] normal_number = new int[6];
		int imsi = 0;
		for (int i = 0; i < normal_number.length; i++) {
			imsi = (int) (Math.random() * 45 + 1); // random 함수는 0.0~0.999까지 난수 생성

			for (int j = 0; j < i; j++) {
				if (normal_number[j] == imsi) {
					duplicate = true;
				}
			}
			if (!duplicate) {
				normal_number[i] = imsi;
			} else {
				duplicate = false;
				i--;
			}
		}
		System.out.println("(System)Success Create Normal Number");
		return normal_number;
	}

}
