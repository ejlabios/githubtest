package test3pckage;

import java.util.Scanner;

public class Test3Class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First input number: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();	
		System.out.println("Second input number: ");
		int b = scan.nextInt();
		int c = a+b;
		int d=a+b+c;
		System.out.println("Sum = "+ d);

	}

}
