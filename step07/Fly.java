package com.ssafy.hw.step07;

import java.util.Scanner;

public class Fly {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int t=0;t<T;t++) {
			
			int N=sc.nextInt();
			int M=sc.nextInt();
			
			int [][] sum=new int[N-(M-1)][N-(M-1)];
			int [][] arr=new int[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<sum.length;i++) {
				for(int j=0;j<sum.length;j++) {
					for(int a=i;a<M+i;a++) {
						for(int b=j;b<M+j;b++) {
							sum[i][j]+=arr[a][b];
						}
					}
					
					
					
				}
			}
			int result=0;
			for(int i=0;i<sum.length;i++) {
				for(int j=0;j<sum.length;j++) {
					if(result<sum[i][j])
						result=sum[i][j];

				}
				

			}
			System.out.println("#"+ (t+1)+" "+ result);
			
		}
	}

}
