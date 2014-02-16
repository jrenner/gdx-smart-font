package org.jrenner.smartfont.example;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Example {

	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.height = 720;
		cfg.width = 1280;
		cfg.resizable = false;

		new LwjglApplication(new ExampleMain(), cfg);
	}
}
