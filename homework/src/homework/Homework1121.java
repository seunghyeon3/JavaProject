package homework;

public class Homework1121 {
	public static void main(String[] args) {

		byte a = 35;
		byte b = 25;
		int c = 463;
		long d = 1000L;

		long result1 = a + c + d;
		System.out.println(result1);

		int result2 = a + b + c;
		System.out.println(result2);

		double e = 45.31;
		double result3 = c + d + e;
		System.out.println(result3);

		/*
		 * 문제5) 아래와 같이 변수가 초기화되어있을 경우 다음과 같이 명시된데로 출력하세요. 
		 * 출력예시) A278번지10.0
		 */
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "번지";
		System.out.println(String.valueOf(charValue) + (intValue1 + 
				intValue2) + intValue3+strValue + (double)intValue4);
		
	    /* 추가문제) 아래와 같이 변수 값이 주어질 경우 각 자리의 합을 구해 출력하세요. 
	    예시) 373 일 경우 3 + 7 + 3 = 13 으로 결과는 13입니다.
	    힌트) 곱하기 연산자 (*), 나누기 연산자( / ) 와 빼기 연산자 ( - ) 를 이용하세요. */
		int value = 485;
		
		int hundred = value / 100; //4
		int ten = (value - (100*hundred)) / 10; //8
		int one = (value -(100*hundred) - (10*ten)); //5
		
		int intResult = hundred + ten + one;
		System.out.println(intResult);
		
		
		
		
		
		
		
		
		
	
	
	}
}
