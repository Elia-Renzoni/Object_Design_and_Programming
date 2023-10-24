/*
 * 	@author Elia Renzoni
 * 	@date 24/05/2023
 * 	@brief User Interface
 * */

package eCommerce.interfaces;

public interface UserI {
	boolean logIn();
	int createNewAccount();
	boolean checkUser(int userId);
	int getUserId();
}
