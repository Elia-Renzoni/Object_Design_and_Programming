/*
 * 	@author Elia Renzoni
 * 	@date 27/10/2023
 * 	@brief Product Class - SuperClass
 * */

package ecommerce;

public class Product {
	private int codeId;
	private String name;
	private int price;
	
	public Product(int id, String name, int price) {
		this.codeId = id;
		this.name = name;
		this.price = price;
	}
	
	public void viewInfo() {
		System.out.println("Id : " + this.codeId);
		System.out.println("Name : " + this.name);
		System.out.println("Price : " + this.price);
	}
	
	public void changeId(int newId) {
		this.codeId = newId;
	}
	
	public void changeName(String newName) {
		this.name = newName;
	}
	
	public void changePrice(int newPrice) {
		this.price = newPrice;
	}
	
	public int getCodeId() {
		return this.codeId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
}
