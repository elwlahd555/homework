package com.ssafy.hw.step10;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Stack<Character> st=new Stack<>();
		
		for(int t=1;t<=10;t++) {
			
			int num=sc.nextInt();
			
			String result="";
			String s=sc.next();
			char[]srr=s.toCharArray();
			
//			for(int i=0;i<num;i++) {
//				System.out.print(srr[i]);
//			}
			result+=srr[0];
			st.push(srr[1]);
			for(int i=2;i<num;i++) {
				if(srr[i]>='0'&&srr[i]<='9') {
					result+=srr[i];
				}else if(!st.isEmpty()&&getPrority(srr[i])<=getPrority(st.peek())) {
						result+=st.pop();	
						
						st.push(srr[i]);
				}else{st.push(srr[i]);}
				
			}
			while(!st.isEmpty()) {
				result+=st.pop();
			}
//			while(!st.isEmpty()) {
//				
//				result+=st.pop();
//			}
//			System.out.println(result);
			
			int resultnum = doCalc(result);
			
			System.out.println("#"+ t +" "+resultnum);
			
		}
	}

	private static int doCalc(String result) {
		// TODO Auto-generated method stub
		
		char[]arr=result.toCharArray();
		Stack<Integer> stack = new Stack<Integer>();
		int num1, num2,num3;
		for(char ch:arr) {
			if(ch>='0'&&ch<='9') {
				stack.push(ch-'0');
			}else {
				num2=stack.pop();
				num1=stack.pop();
				num3=calc(ch,num1,num2);
				stack.push(num3);
			}
		}
		
		return stack.pop();
	}

	private static int calc(char ch, int num1, int num2) {
		// TODO Auto-generated method stub
		int result=0;
		switch(ch){
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
		}
		
		return result;
	}

	private static int getPrority(char ch) {
		// TODO Auto-generated method stub
		int result=0;
		switch(ch) {
		case'*':
		case'/':
			result=2;
			break;
		case'+':
		case'-':
			result=1;
			break;
		}
		return result;
	}

}
