/*
 * 	@author Elia Renzoni
 * 	@date 27/10/2023
 * 	@brief Client Class
 * */

package ecommerce;

public class ECommerceAdmin {
	public static void main(String[] args) {
		Electronics el = new Electronics(128, "RAM", 34, "Intel");
		Clothing cl = new Clothing(238, "Pants", 56, 67.9);
		
		el.viewInfo();
		System.out.println();
		el.changeBrand("IBM");
		el.viewInfo();
		System.out.println();
		el.changeId(12);
		el.viewInfo();
		System.out.println();
		cl.viewInfo();
	}
}
