package eCommerce.interfaces;

public interface ProductI {
	void showProducts();
	int searchProduct(int productId);
	boolean payment(int productId);
}
