package discordserver;
import interfaces.Messages;

public class TextChannel implements Messages {
	private int channelId;
	private String channelName;
	protected User user;
	
	public TextChannel(int chId, String chName, int usId, String usName) {
		user = new User(usId, usName);
		this.channelId = chId;
		this.channelName = chName;
	}
	
	public int getChannelId() {
		return this.channelId;
	}
	
	public String getChannelName() {
		return this.channelName;
	}
	
	public void setChannelId(int newId) {
		this.channelId = newId;
	}
	
	public void setChannelName(String newName) {
		this.channelName = newName;
	}
	
	
	public String toString() {
		return "[CHANNEL ID] : " + this.channelId + 
				"\n[CHANNEL NAME] : " + this.channelName;
	}
	
	@Override
	public void sendMessage(String text) {
		System.out.println(text);
		System.out.println("Sent By : "  + user.getUsername());
		System.out.println("Id : " + user.getId());
	}
	
}
