package me.marchewka.bringoldmc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import net.minecraft.client.Minecraft;

public class ModMain {
	public static Minecraft mc = Minecraft.getMinecraft();
	Logger log = new Logger();
	static JFrame CLIENT_UPDATE_FRAME;
	public static final ModMain INSTANCE = new ModMain();
	public static final ModMain getInstance() {
		return INSTANCE;
	}
	private DiscordRP discordRP = new DiscordRP();
	public DiscordRP getDiscordRP() {
		return discordRP;
	}
	
	public void start() {
		UpdateChecker.checkIfAvailable();
		log.log("Loading Mod...");
		log.log("IsUpdateAbailable? " + UpdateChecker.isAvailable());
		if(UpdateChecker.isAvailable()) {
			createAndShowUpdateGUI();
		}else {
			}
		discordRP.start();
		mc.FRAME_CLIENT.setTitle("Minecraft 1.5.2 | Bring Old Mc Versions Back");
	}
	
	public void shutdown() {
		discordRP.shutdown();
	}
	
    private static void createAndShowUpdateGUI() {
    	  JFrame frame = new JFrame("Bring Old Mc Versions Back Updater!");  
          JPanel panel = new JPanel();  
          CLIENT_UPDATE_FRAME = frame;
          panel.setLayout(new FlowLayout());  
          JLabel label = new JLabel("<html><b>Please update your Mod Version!"
          		+ "<br>download it here"
          		+ "<br>https://github.com/marchewaaa333/bring-old-mc-versions-back</b></html>");   
          panel.add(label);  
          frame.add(panel);  
          frame.setSize(500, 140);  
          frame.setLocationRelativeTo(null);  
          frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);  
          frame.setVisible(true);  
    }
}
