package day04;

import java.util.Scanner;

/*<퀴즈만들기>알고리즘
 * 1>문제-----스트링 변수
 * 2>정답을 받는 ----더블 변수//사용자가 -나 실수값을 입력하는 거 받아줘야 함
 * 3>진짜 정답인 변수---더블변수
 * 정답인 변수---더블변수
 * 출력받기-question
 * 입력받기
 * 4>정답을 판독해주는 변수---스트링변수//삼항 연산자를 사용하기
 * 5>출력
 * 
 */

public class Quiz_Remind {
	public static void main(String[] args) {
		String question = null;
		question = "Q. 다음중 컴퓨터 언어가 아닌 것은\n"
				+ "1.  JAVA\n"
				+ "2. C++\n"
				+ "3. Phyton\n"
				+ "4. Menu\n"
				+ "정답 입력칸 :  ";
		double input  = 0;// 정답을 받는 변수
		double answer = 4; // 정답 변수
		String result = " ";//정답과 정답을 받는 변수를 비교하는 조건
		
		System.out.print(question);
		Scanner  sc = new Scanner(System.in);
		input = sc.nextDouble();
		//result = input == answer ? "정답입니다." : input>=1 && input <4? "오답입니다" : (input-(input%1))==0 ? "1~4 정수만 입력해라 ㅡㅡ" : "?";
		result = input == answer ? "정답입니다." : (input-(input%1))==0 ? "1~4 정수만 입력해라 ㅡㅡ" : "오답입니다";
		System.out.println(result);
		
		
		
	}
}
