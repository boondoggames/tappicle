package com.boondoggames.tappicle.screens;

import com.boondog.imports.game.MyScreen;
import com.boondoggames.tappicle.Tappicle;

public class MainScreen extends MyScreen {
	public MainScreen(Tappicle app) {
		super(app);
	}

	@Override
	public void render(float delta) {
		clearColor();
		stage.act(delta);
		stage.draw();
	}

}
