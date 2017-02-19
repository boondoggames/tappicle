package com.boondoggames.tappicle;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.boondog.imports.game.MyGame;
import com.boondoggames.tappicle.screens.MainScreen;

public class Tappicle extends MyGame {
	private final int worldWidth = 100;
	private int worldHeight;

	@Override
	public void create() {
		init();
		setScreen(new MainScreen(this));
	}

	@Override
	protected void initViewport() {
		// Ensure we do the math here with floats, as int math is very weird
		worldHeight = (int) ((Gdx.graphics.getHeight() * 1.0f / Gdx.graphics.getWidth()) * worldWidth);

		setViewport(new StretchViewport(worldWidth, worldHeight));
		getViewport().update(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), true);
	}

	public float getWidth() {
		return worldWidth;
	}

	public float getHeight() {
		return worldHeight;
	}
}
