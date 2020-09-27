package com.ssafy.hw.Algo01;


import java.util.Scanner;

public class Snail {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		

		int T=sc.nextInt();
		for (int t=0;t<T;t++) {
			
			int N=sc.nextInt();
			int [][] result=new int[N][N];

			int num=1;
			int K=N;
			int d=1;
			int nx=0;
			int ny=-1;
			while(K!=0) {
				
				for(int i=0;i<K;i++) {
					ny+=d;
					result[nx][ny]=num++;
				}
				K--;
				for(int i=0;i<K;i++) {
					nx+=d;
					result[nx][ny]=num++;
					
				}
				d*=-1;
				
				}
			
				System.out.println("#"+(t+1));
				for(int i=0;i<N;i++) {
					for(int j=0;j<N;j++) {
						
						System.out.print(result[i][j]+" ");
					}
					System.out.println(" ");
				}
			}
			

				
				
	}
		
}


