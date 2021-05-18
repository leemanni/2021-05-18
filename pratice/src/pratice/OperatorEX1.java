package pratice;

public class OperatorEX1 {
	//연산자 복습하기
	public static void main(String[] args) {
		System.out.println("1) 산술 연산자");
		int a = 100;
		System.out.println(a%7);
		
		System.out.println("2) 비트연산자");
		int b = 3;
		int c = 5;
		System.out.println("b And c = " +(b&c));
		System.out.println("b XOR c = " +(b^c));
		System.out.println("b OR c = " +(b|c));
		System.out.println(~10+15+4);
		System.out.println(~10+15+4<<~-2);
	}
}
