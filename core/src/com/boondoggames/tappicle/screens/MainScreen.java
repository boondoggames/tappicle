package com.boondoggames.tappicle.screens;

import com.boondog.imports.game.MyScreen;
import com.boondoggames.tappicle.Circle;
import com.boondoggames.tappicle.Tappicle;

public class MainScreen extends MyScreen {
	public MainScreen(Tappicle app) {
		super(app);
		stage.addActor(new Circle(this));
	}

	@Override
	public void render(float delta) {
		clearColor();
		stage.act(delta);
		stage.draw();
	}

}
