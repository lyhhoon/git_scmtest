package testest;

import java.util.Scanner;

public class examTest {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		for (int i = 1; i <= num1; i++) {
			sum1 += i;
		}
		
		for (int n = 1; n <= num2; n++) {
			sum2 += n;
		}
		
		System.out.println("1 ~ " + num1 + " 사이의 정수 : " + sum1);
		System.out.println("1 ~ " + num2 + " 사이의 정수 : " + sum2);
	}
}
