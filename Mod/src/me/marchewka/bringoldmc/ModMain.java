import org.lwjgl.opengl.Display;

import net.minecraft.client.Minecraft;

public class ModMain {
	public static Minecraft mc = Minecraft.getMinecraft();
	public static final ModMain INSTANCE = new ModMain();
	public static final ModMain getInstance() {
		return INSTANCE;
	}
	private DiscordRP discordRP = new DiscordRP();
	public DiscordRP getDiscordRP() {
		return discordRP;
	}
	
	public void start() {
		Logger.log("Loading mod...");
		discordRP.start();
		mc.FRAME_CLIENT.setTitle("Minecraft 1.5.2 | Bring Old Mc Versions Back");
	}
	
	public void shutdown() {
		discordRP.shutdown();
	}
}
