package discordserver;
import interfaces.Messages;

public class Member extends User implements Messages {
	private String role;
	
	public Member(int usId, String usName, String role) {
		super(usId, usName);
		this.role = role;
	}
	
	public String getRole() {
		return this.role;
	}
	
	public void setRole(String newRole) {
		this.role = newRole;
	}
	
	@Override
	public void sendMessage(String text) {
		System.out.println(text);
		System.out.println("Sent by : " + super.getUsername());
		System.out.println("Id : " + super.getId());
		System.out.println("Role : " + this.role);
	}

}
