package com.boondoggames.tappicle.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.badlogic.gdx.graphics.Texture;
import com.boondoggames.tappicle.Tappicle;

public class DesktopLauncher {
	static final String assets_general = "../../assets/";
	static final String assets_android = "";

	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		TexturePacker.Settings settings = new TexturePacker.Settings();

		// Set the maximum size of our textures. This is a good size to support rather old devices.
		settings.maxWidth = 1024;
		settings.maxHeight = 1024;

		// These help prevent nasty anti-aliasing looking stuff
		settings.filterMin = Texture.TextureFilter.MipMapLinearNearest;
		settings.filterMag = Texture.TextureFilter.Nearest;

		// Padding stops weirdness from the texture filters, otherwise you'll get overlaps
		settings.paddingX = 5;
		settings.paddingY = 5;

		boolean packTextures = false;

		if (packTextures) {
			TexturePacker.process(settings, assets_general, assets_android + "atlas", "assets");
		}

		new LwjglApplication(new Tappicle(), config);
	}
}
