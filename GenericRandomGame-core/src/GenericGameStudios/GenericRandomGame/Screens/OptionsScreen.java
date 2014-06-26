package GenericGameStudios.GenericRandomGame.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;

public class OptionsScreen implements Screen{

	private MainMenuScreen mainMenuScreen;
	
	private Skin skin;
	private Stage stage;
	private BitmapFont font;
	
	private TextButtonStyle buttonStyle;
	
	private TextButton button;
	
	private ChangeListener backListener = new ChangeListener(){
		@Override
		public void changed(ChangeEvent event, Actor actor) {
			mainMenuScreen.create();
			((Game) Gdx.app.getApplicationListener()).setScreen(mainMenuScreen);
		}
	};
	
	public OptionsScreen(MainMenuScreen mainMenuScreen){
		this.mainMenuScreen = mainMenuScreen;
	}
	
	public void create(){
		skin = new Skin();
		stage = new Stage();
		
		this.initStyles();
		
		button = new TextButton("back",buttonStyle);
		
		stage.addActor(button);
	}
	
	@Override
	public void render(float delta) {
		
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void show() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void dispose() {
		
	}
	
	private void initStyles(){
		buttonStyle = new TextButtonStyle();
	    buttonStyle.up = skin.getDrawable("ButtonUp");
	    buttonStyle.over = skin.getDrawable("ButtonDown");
	    buttonStyle.down = skin.getDrawable("ButtonDown");
	    buttonStyle.font = font;
	}

}
