/*
 * 	@author Elia Renzoni
 * 	@date 27/10/2023
 * 	@brief Clothing SubClass
 * */

package ecommerce;

public class Clothing extends Product {
	private double size;
	
	public Clothing(int id, String name, int price, double size) {
		super(id, name, price);
		this.size = size;
	}
	
	@Override
	public void viewInfo() {
		super.viewInfo();
		System.out.println("Size : " + this.size);
	}
	
	public void changeSize(double newSize) {
		this.size = newSize;
	}
	
	public double getSize() {
		return this.size;
	}
}
