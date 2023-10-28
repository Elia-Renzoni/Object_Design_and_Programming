package discordserver;

public class VoiceChannel extends TextChannel {
	private String[] conntectedUsers;
	
	public VoiceChannel(int chId, String chName, int usId, String usName) {
		super(chId, chName, usId, usName);
		// TODO Auto-generated constructor stub
	}	
}
