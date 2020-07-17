package dev.codenmore.zentaris.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import dev.codenmore.zentaris.MainGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "Zentaris";
		config.width = 800;
		config.height = 600;
		config.resizable = true;

		// Pack all of our textures into a texture atlas
		// TODO: REMOVE THIS CODE BEFORE RELEASING OUR GAME
		TexturePacker.Settings sets = new TexturePacker.Settings();
		sets.pot = true;
		sets.fast = true;
		sets.combineSubdirectories = true;
		sets.paddingX = 1;
		sets.paddingY = 1;
		sets.edgePadding = true;
		TexturePacker.process(sets, "raw_textures", "./", "textures");

		new LwjglApplication(new MainGame(), config);
	}
}
