package me.marchewka.bringoldmc;

import java.awt.Color;

import net.java.games.input.Keyboard;
import net.minecraft.client.Minecraft;
import net.minecraft.src.FontRenderer;
import net.minecraft.src.Gui;
import net.minecraft.src.ScaledResolution;

public class ModdedGuiInGame {
	
	static FontRenderer fr = Minecraft.getMinecraft().fontRenderer;
	static Minecraft mc = Minecraft.getMinecraft();
	static ScaledResolution sr = new ScaledResolution(
			mc.gameSettings, mc.displayWidth, mc.displayHeight);
	
	public static void Draw() {
		int wAlpha = (org.lwjgl.input.Keyboard.isKeyDown(mc.gameSettings.keyBindForward.keyCode) ? new Color(255,255,255,100).getRGB() : new Color(255,255,255,255).getRGB());
		int aAlpha = (org.lwjgl.input.Keyboard.isKeyDown(mc.gameSettings.keyBindLeft.keyCode) ? new Color(255,255,255,100).getRGB() : new Color(255,255,255,255).getRGB());
		int sAlpha = (org.lwjgl.input.Keyboard.isKeyDown(mc.gameSettings.keyBindBack.keyCode) ? new Color(255,255,255,100).getRGB() : new Color(255,255,255,255).getRGB());
		int dAlpha = (org.lwjgl.input.Keyboard.isKeyDown(mc.gameSettings.keyBindRight.keyCode) ? new Color(255,255,255,100).getRGB() : new Color(255,255,255,255).getRGB());

		fr.drawString("W", sr.getScaledWidth() - 48, sr.getScaledHeight() - 49, wAlpha);
		fr.drawString("A", sr.getScaledWidth() - 77, sr.getScaledHeight() - 20, aAlpha);
		fr.drawString("S", sr.getScaledWidth() - 48, sr.getScaledHeight() - 20, sAlpha);
		fr.drawString("D", sr.getScaledWidth() - 19, sr.getScaledHeight() - 20, dAlpha);
	}

}
