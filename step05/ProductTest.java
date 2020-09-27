package com.ssafy.hw.step05;

import java.util.Scanner;

public class ProductTest {
	
	private ProductMgr mgr=ProductMgr.getInstance();
	
	Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		ProductTest pt=new ProductTest();
		pt.service();
		
	}
private void service() {
		
		System.out.println("<<< 상품 관리 프로그램 >>>");
		
		while(true) {
			int menu = showMenu();
			switch(menu) {
			case 1:
				addProduct();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
		}
	}
	private void addProduct() {
	// TODO Auto-generated method stub
		Product p=new Product();
		System.out.print("상품 번호 :");
		int number=Integer.parseInt(sc.nextLine());
		p.setNumber(number);
		
		System.out.print("상품 이름 :");
		String name=sc.nextLine();
		p.setName(name);
		
		System.out.print("상품 가격 :");
		int price=Integer.parseInt(sc.nextLine());
		p.setPrice(price);
		
		System.out.print("상품 수량 :");
		int count=Integer.parseInt(sc.nextLine());
		p.setCount(count);
		mgr.add(p);
		System.out.println("상품이 등록되었습니다.");
		
	
}
	private int showMenu(){
		System.out.println("1.상품 정보 입력");
		System.out.println("2.상품 정보 전체 검색");
		System.out.println("3.상품 번호 검색");
		System.out.println("4.상품 번호로 삭제");
		System.out.println("5.특정가격 이하의 상품만 검색");
		System.out.println("0. 종료");
		System.out.print("원하는 번호를 선택하세요. _");
		int menu=Integer.parseInt(sc.nextLine());
		return menu;
	}
	
	

}
