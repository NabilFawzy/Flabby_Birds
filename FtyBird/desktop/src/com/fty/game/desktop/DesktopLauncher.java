package com.fty.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.fty.game.Ftyflabby;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width=Ftyflabby.WIDTH;
		config.height=Ftyflabby.HEIGHT;
		config.title=Ftyflabby.TITLE;
		new LwjglApplication(new Ftyflabby(), config);
	}
}
