/*
 * 	@author Elia Renzoni
 * 	@date 27/10/2023
 * 	@brief Electonics SubClass
 * */

package ecommerce;

public class Electronics extends Product {
	private String brand;
	
	public Electronics(int id, String name, int price, String brand) {
		super(id, name, price);
		this.brand = brand;
	}
	
	@Override
	public void viewInfo() {
		super.viewInfo();
		System.out.println("Brand : " + this.brand);
	}
	
	public void changeBrand(String newBrand) {
		this.brand = newBrand;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
}
