package com.ssafy.hw.step01;

import java.util.Scanner;

public class Compute {
	public static void main(String[] args)  {
		
		Scanner keyboard = new Scanner(System.in);
		
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		
		System.out.println("곱 =" + a*b);
		System.out.println("몫 =" + (a / b) );
	}

}
