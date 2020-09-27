package com.ssafy.hw.step04;

public class ProductTest {
	
	public static void main(String[] args) {
		
		TV tv = new TV("삼성TV",125,2500000,5,65,"QLED");
		
//		tv.setName("삼성TV");
//		tv.setNum(125);
//		tv.setPrice(2500000);
//		tv.setCount(5);
//		tv.setInch(65);
//		tv.setType("QLED");
//		
		System.out.println(tv.toString());
		
		Refrigerator re= new Refrigerator("삼성냉장고",421,1250000,2,200);
//		re.setName("삼성냉장고");
//		re.setNum(421);
//		re.setPrice(1250000);
//		re.setCount(2);
//		re.setVolume(200);
//		
		System.out.println(re.toString());
	}

}
