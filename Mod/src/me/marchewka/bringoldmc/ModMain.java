package me.marchewka.bringoldmc;

import org.lwjgl.opengl.Display;

import net.minecraft.client.Minecraft;

public class ModMain {
	public static Minecraft mc = Minecraft.getMinecraft();
	Logger log = new Logger();
	public static final ModMain INSTANCE = new ModMain();
	public static final ModMain getInstance() {
		return INSTANCE;
	}
	private DiscordRP discordRP = new DiscordRP();
	public DiscordRP getDiscordRP() {
		return discordRP;
	}
	
	public void start() {
		log.log("Loading Mod...");
		discordRP.start();
		mc.FRAME_CLIENT.setTitle("Minecraft 1.5.2 | Bring Old Mc Versions Back");
	}
	
	public void shutdown() {
		log.log("Shutting down Mod...");
		discordRP.shutdown();
	}
}
