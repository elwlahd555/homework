package com.ssafy.hw.step05;

import java.util.Arrays;

public class ProductMgr {
	
	private static ProductMgr instance;
	
	private ProductMgr(){
		
	}
	public static ProductMgr getInstance(){
		if(instance==null) {
			instance=new ProductMgr();
		}
		return instance;
	}
	
	private Product[] products=new Product[100];
	
	private int index;
	
	public void add(Product p) {
		if(index==products.length) {
			Arrays.copyOf(products, index*2);
		}
		
		products[index]=p;
		index++;
	}
	
	public Product[] search() {
		
		return Arrays.copyOfRange(products, 0, index);
	}
	
	public Product[] searchNumber(int number) {
		Product[] temp=new Product[index];
		int idx=0;
		for(int i=0;i<index;i++) {
			if(products[i].getNumber()==number) {
				temp[idx++]=products[i];
				
			}
		}
		return Arrays.copyOf(temp, idx);
	}
	
	public void deleteNumber(int number) {
		for(int i= 0; i<index; i++) {
			
			if(products[i].getNumber()==number) {
				int movecut = index-i+1;
				if(movecut !=0) {
					System.arraycopy(products, i+1, products, i, movecut);
				}
				
				products[--index]=null;
				
				return;
			}
		}
	}

}
