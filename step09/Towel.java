package com.ssafy.hw.step09;

import java.util.Scanner;
import java.util.Stack;

public class Towel {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Stack<Integer> st=new Stack<>();
		Stack<Integer> result=new Stack<>();
		
		int N=sc.nextInt();

		for(int i=0;i<N;i++) {
			st.push(sc.nextInt());
		}

		for(int i=0;i<N;i++) {
			int tem = st.pop();
			int [] arr=new int[st.size()];
			
			for(int j=0; j<arr.length;j++) {
				arr[j]=st.pop();
			}
			for(int j=arr.length-1;j>=0;j--) {
				st.push(arr[j]);
				
			}

			for(int j=0;j<arr.length;j++) {
				
				if(tem<arr[j]) {
					result.push(st.size()-j);
					break;
				}else if(j==arr.length-1&&tem>arr[j]) {
					
					result.push(0);
				}else if(tem>arr[j]) {
					continue;
				}
				
			}

			
			
		}
		result.push(0);
		for(int j=0;j<N;j++) {
			
			System.out.println(result.pop());
		}
		
	}

}
