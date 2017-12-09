package com.hiraishin.rain.entity.item;

import com.hiraishin.rain.graphics.Sprite;
import com.hiraishin.rain.level.Level;
import com.hiraishin.rain.util.ImageLoader;

import javafx.scene.image.Image;

public class Shield extends Item {

	/*
	 * Definitions
	 */
	public static final double WIDTH = 20;
	public static final double HEIGHT = 30;

	public static final Image IMAGE = ImageLoader.DEFAULT.requestImage("entity/armor");
	public static final int IMAGE_ROWS = 1;
	public static final int IMAGE_COLS = 1;
	public static final double SPRITE_X_OFFSET = 0;
	public static final double SPRITE_Y_OFFSET = 0;

	/*
	 * Constructors
	 */
	public Shield(double x, double y, Level level) {
		super(x, y, WIDTH, HEIGHT, new Sprite(IMAGE, IMAGE_ROWS, IMAGE_COLS), SPRITE_X_OFFSET, SPRITE_Y_OFFSET, level);
	}

	/*
	 * Instance functions
	 */
	@Override
	public void effect() {
		this.level.getPlayerProperties().addShield();
	}
}