package discordserver;

public class User {
	private int id;
	private String username;
	
	public User(int id, String userName) {
		this.id = id;
		this.username = userName;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setId(int newId) {
		this.id = newId;
	}
	
	public void setUsername(String newUsername) {
		this.username = newUsername;
	}
	
	public String toString() {
		return "[ID] : " + this.id + "\n[USERNAME] : " + this.username;
	}
}
