package com.boondoggames.tappicle;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.boondoggames.tappicle.screens.MainScreen;

public class Circle extends Button {
	private static Texture circle;
	private MainScreen screen;

	public Circle(MainScreen screen) {
		super();
		this.screen = screen;
		initStyle();
		initListener();
		this.setSize(10, 10);
		this.setPosition(0, 0);
	}

	private void initListener() {
		this.addListener(new InputListener() {
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				System.out.println("Clicked");
				return true;
			}
		});
	}

	private void initStyle() {
		ButtonStyle style = new ButtonStyle();
		style.up = screen.getAssets().getSkin("assets").newDrawable("circle", Color.BLUE);
		style.down = screen.getAssets().getSkin("assets").newDrawable("circle", Color.BLUE);
		setStyle(style);
	}

	public static void dispose() {
		if (circle != null) {
			circle.dispose();
		}
	}
}
