package eCommerce.interfaces;

public interface ShoppingCart {
	void showShoppingCart();
	boolean addProduct(int productId, String desc);
	int searchProduct(int productId);
	boolean remouveProducts(int productId);
}
