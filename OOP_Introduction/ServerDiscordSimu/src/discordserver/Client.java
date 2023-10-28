package discordserver;

public class Client {
	public static void main(String[] args) {
        User user = new User(12, "Elia");
        System.out.println(user.toString());
        TextChannel txt = new TextChannel(33, "Coding", 12, "Elia");
        String text = new String("Ciao a tutti");
        txt.sendMessage(text);
        Member mb = new Member(12, "Elia", "moderator");
        text = "Attenzione !";
        mb.sendMessage(text);
        String[] obj = new String[] {new String("Giovanni"), new String("Franceso")};
        VoiceChannel ch = new VoiceChannel(34, "Art", 23, "Giova", obj);
        ch.getConnectedUsers();
    }
}
