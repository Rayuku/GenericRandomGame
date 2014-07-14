package GenericGameStudios.GenericRandomGame.Main;

import GenericGameStudios.GenericRandomGame.Loader.ItemLoader;

import com.badlogic.gdx.Game;

public class GenericRandomGame extends Game{
	
	@Override
	public void create() {
		ItemLoader loader = new ItemLoader();
		loader.loadItemsDevelop();
		//System.out.println(loader.getExistingItems().get(0).getName());
	}
	
	public void createGame(){
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
