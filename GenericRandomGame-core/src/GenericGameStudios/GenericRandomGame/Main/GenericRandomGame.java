package GenericGameStudios.GenericRandomGame.Main;

import GenericGameStudios.GenericRandomGame.Screens.MainMenuScreen;

import com.badlogic.gdx.Game;

public class GenericRandomGame extends Game{
	@Override
	public void create() {
		this.setScreen(new MainMenuScreen());
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}

	@Override
	public void dispose() {
		super.dispose();
	}
}
