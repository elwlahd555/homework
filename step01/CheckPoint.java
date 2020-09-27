package com.ssafy.hw.step01;

import java.util.Scanner;

public class CheckPoint {
public static void main(String[] args) {
	
	Scanner keyboard = new Scanner(System.in);
	
	int height = keyboard.nextInt();
	
	int weight = keyboard.nextInt();
	
	System.out.println("비만수치는 " + (weight+100-height) +"입니다.");
	
	
	
}
}
