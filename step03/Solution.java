 package com.ssafy.hw.step03;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		
		int [][] map ;
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // test 수
		
		for(int t=0;t<T;t++) {
			
			int count=0;
			
			int N = sc.nextInt(); // 연못 크기
			
			map = new int[N][N];
			
			for(int i=0;i<N;i++) {
				for(int j =0; j<N; j++) {
					map[i][j]=0;
				}
			}
			int K = sc.nextInt(); //소금쟁이수
			
			bulrae b[] = new bulrae[K];
			
			for(int i=0; i<K; i++) {
				b[i]=new bulrae(map,sc.nextInt(),sc.nextInt(),sc.nextInt());
			}
			for(int j=0; j<map.length;j++) {
				for(int k=0; k<N;k++) {
						
//						System.out.print(map[j][k]+"");
					}
//					System.out.println();
				}
//				System.out.println();
				
				for (int i = 0 ; i< b.length;i++)
					for( int j= 0;j<3;j++)
						if(b[i] == null || b[i].move() == 4) {
							b[i] = null;
							continue;
			}
				for(int i = 0 ; i<map.length;i++) {
					for (int j= 0;j<map[i].length;j++) {
						

//						System.out.print(map[i][j]+" ");
						if(map[i][j]==5) {
							count++;
						}

					}


		}

		System.out.println("#"+ t+" "+ count);		
	}
}
}
			

		
class bulrae{
	int x;
	int y;
	int mov;
	int arr[][];
	int dis = 3;
	bulrae(int arr[][], int x, int y, int mov) {
		this.x = x;
		this.y = y;
		this.mov = mov;
		this.arr = arr;
		if (arr[x][y] == 5)
			return;
		arr[x][y] = 5;
	}
	int move() { // dis가 3부터 해서 1씩 떨어지면서 3번 이동
		arr[x][y] = 0;
		if (this.mov == 1) {
			this.x-=this.dis;
		}else if(this.mov == 2) {
			this.x+=this.dis;
		}else if(this.mov == 3) {
			this.y-=this.dis;
		}else if(this.mov == 4){
			this.y+=this.dis;
		}
		if (x<0 || x>arr.length-1 || y<0 || y>arr[x].length-1)
			return 4;
		if (arr[x][y] == 5)
			return 4;
		arr[x][y] = 5;
		this.dis--;
		return 0;
	}
}