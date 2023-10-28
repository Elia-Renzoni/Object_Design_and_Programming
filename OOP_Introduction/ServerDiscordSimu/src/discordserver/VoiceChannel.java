package discordserver;

public class VoiceChannel extends TextChannel {
	private String[] conntectedUsers;
	
	public VoiceChannel(int chId, String chName, int usId, String usName, String[] objects) {
		super(chId, chName, usId, usName);
		this.conntectedUsers = objects;
	}
	
	public boolean connectNewUser(int userId, String userName) {
		boolean tmp = false;
		try {
			conntectedUsers = new String[] {new String(userName)};
			System.out.println("Nuovo utente collegato !"); 
			System.out.println(super.user.toString());
			tmp = true;
		} catch (Exception ex) {
			System.err.println(ex);
		}
		return tmp;
	}

	public void getConnectedUsers() {
		for (var value : this.conntectedUsers) {
			System.out.println(value);
		}
	}
	
}
