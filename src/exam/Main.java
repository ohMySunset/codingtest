package exam;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 A : ");
		int a = sc.nextInt();
		System.out.println("정수 B : ");
		int b = sc.nextInt();
		
		System.out.println("A+B : "+ sumAB(a, b));

	}

	public static int sumAB(int a, int b) {
		
	return a+b;

	}


}
