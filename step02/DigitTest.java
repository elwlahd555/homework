package com.ssafy.hw.step02;


import java.util.Scanner;

public class DigitTest {
	public static void main(String[] args) {
		int count[] = new int[10];
		int num[];
		//count[] 0 으로 초기
		int i = 0;
		System.out.println("please input");
		Scanner input = new Scanner(System.in);
		String data = input.nextLine();
		String words[] = data.split(" ");
		num = new int[words.length];
		for (int j=0; j<words.length;j++)
			num[j]=Integer.parseInt(words[j]);
		//입력값정
		do {
			if(num[i] == 0)
				break;
			count[num[i]/10]++;
			i++;
		}while(num[i] < 100);
		
		
		// 출력 여기다 출력 순서 비교만 해서 출력해줌
		int flag[] = new int[count.length];
		for(int j=0;j<flag.length;j++) {
			flag[j] = 0;
		}
		
		for (int j = 0; j<11;j++)
			for (int k = 0 ; k<count.length;k++) {
				if(flag[k]==0 && count[k]==j && count[k]!=0) {
					System.out.println(k + " : " + count[k] + "개");
					flag[k]++;
				}
			}
	}
}