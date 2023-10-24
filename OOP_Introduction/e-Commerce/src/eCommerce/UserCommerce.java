/*
 * 	@author Elia Renzoni
 * 	@date 24/05/2023
 * 	@brief User Class
 * */

package eCommerce;
import java.io.File;
import java.io.FileWriter;
import eCommerce.interfaces.UserI;

public class UserCommerce implements UserI {
	private final int userId;
	private static File users;
	private boolean connectionStatus;
	private boolean channelStatus;
	
	public UserCommerce(int id) {
		this.userId = id;
	}
	
	public boolean logIn() {
		return false;
	}
	
	public int createNewAccount() {
		return 0;
	}
	
	public boolean checkUser(int userId) {
		return false;
	}
	
	public int getUserId() {
		return 0;
	}
	
	private boolean openConnection() {
		try {
			File users = new File("users.txt");
			this.connectionStatus = true;
		} catch (Exception ex) {
			System.err.println("Errore : " + ex);
			this.connectionStatus = false;
		}
		return this.connectionStatus;
	}
	
	private boolean createChannelAndWrite() {
		try {
			FileWriter channel = new FileWriter(this.users);
			channel.write(this.userId);
			channel.write("\n");
			this.channelStatus = true;
		} catch(Exception ex) {
			System.err.println("Errore : " + ex);
			this.channelStatus = false;
		}
		return this.channelStatus;
	}
}
