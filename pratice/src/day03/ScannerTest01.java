package day03;

import java.util.Scanner;

public class ScannerTest01 {
	public static void main(String[] args) {
		int firstNum, secondNum = 0;
		int sum = 0 ;
		String first, second = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요 :");
		first = sc.next();
		System.out.print("두 번째 정수를 입력하세요 :");
		second = sc.next();
		firstNum = Integer.parseInt(first);
		secondNum = Integer.parseInt(second);
		sum = firstNum + secondNum;
		System.out.printf("%d + %d = %d " ,firstNum,secondNum, sum);
		
		
	}
}
