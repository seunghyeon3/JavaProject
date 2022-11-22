package com.yedam.loop;

public class Exam01 {
	public static void main(String[] args) {
		int sum = 0;
		// 1) 규칙
//		sum = sum + 1; // sum = 0 + 1
//		sum = sum + 2; // sum = 1 + 2
//		sum = sum + 3; // sum = 2 + 3
//		sum = sum + 4;
//		sum = sum + 5;

		// 1~5까지의 합을 구하는 반복문
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
		}

		// 1~100사이에서 짝수 구하는 반복문
		// 1) 규칙
		// 2 4 6 8 10 12 14.....
		// i % 2 == 0
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) { // 짝수
				System.out.println(i);
			}
		}

		// 1~100사이에서 홀수 구하는 반복문
		// 1) 규칙
		// 1 3 5 7 9 11 13 15 17 19.....
		// i % 2 == 1
		for (int i = 100; i >= 1; i--) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		// 1~100사이에서 2의 배수 또는 3의 배수 찾기(||)
		// 1~100사이에서 2의 배수 이거나 3의 배수 찾기(&&) => 6의 배수
		// 규칙
		// 2의 배수
		// 2 4 6 8 10 12 ....
		// i % 2 == 0
		// 3의 배수
		// 3 6 9 12 15...
		// i % 3 == 0

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println(i + "는 2의 배수 또는 3의 배수입니다.");
			}
		}

		// 구구단 출력
		// 만약, 2단 출력
		// 2*1, 2*2, 2*3, 2*4.....2*9
		// 2*i
		for (int i = 1; i < 10; i++) {
			System.out.println("2 x " + i + " = " + (2 * i));
		}

		// for문 안에 for문
		// 초기화식에 들어가는 변수를 두개를 고려
		// 구구단 출력(2~9단)

		for (int i = 2; i <= 9; i++) {
			// i = 2일때, i = 3일때..
			//아래 반복문은 9번 돌아감.
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		// 2단 -> 2*1, 2*2...
		// 3단 -> 3*1, 3*2...
		// 4단 -> 4*1, 4*2...
		// 9단 -> 9*1, 9*2....
		
		//공포의 별 찍기

		//*****
		//*****
		//*****
		//*****
		//*****
		//int a = 0;
		//한칸씩 내려 갈 때 쓰는 반복문
		for(int i = 0; i<5; i++) {
			String star = "";
			//별을 만드는 반복문
			for(int j =0; j<5; j++) {
				//+ 연산자를 활용하여 *****를 만듬.
				star = star + "*";
			}
			System.out.println(star);
		}
		
		//*
		//**
		//***
		//****
		//*****
		for(int i=1; i<=5; i++) {
			String star = "";
			for(int j=0; i>j; j++) {
				star = star+"*";
			}
			System.out.println(star);
		}
		
		//*****
		//****
		//***
		//**
		//*
		for(int i=5; i>0; i--) {
			String star = "";
			for(int j=i; j>0; j--) {
				star = star + "*";
			}
			System.out.println(star);
		}
		//    * 4 , 1
		//   ** 3 , 2 
		//  *** 2 , 3
		// **** 1 , 4
		//***** 0 , 5
		for(int i=5; i>0; i--) {
			String star = "";
			for(int j=0; j<=5; j++) {
				if(i>j) {
					star = star + " ";
				}else if(j>=i){
					star = star + "*";
				}
			}
			System.out.println(star);
		}
	}
}
