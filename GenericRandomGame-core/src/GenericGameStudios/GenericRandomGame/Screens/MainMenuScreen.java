package GenericGameStudios.GenericRandomGame.Screens;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;

public class MainMenuScreen implements Screen{
	
	private Skin skin;
	private Stage stage;
	private SpriteBatch batch;
	private BitmapFont font;
	
	private TextureAtlas buttonAtlas;
	
	private TextButton startGame;
	private TextButton options;
	private TextButton mods;
	private TextButton endGame;
	
	private ChangeListener modsListener = new ChangeListener(){
		@Override
		public void changed(ChangeEvent event, Actor actor) {
			((Game) Gdx.app.getApplicationListener()).setScreen(new ModScreen());
		}
	};
	
	private ChangeListener endGameListener = new ChangeListener(){
		@Override
		public void changed(ChangeEvent event, Actor actor) {
			Gdx.app.exit();
		}
	};
	
	public MainMenuScreen(){
		create();
	}
	
	public void create(){
		skin = new Skin();
		stage = new Stage();
	    Gdx.input.setInputProcessor(stage);
	    
	    buttonAtlas = new TextureAtlas("Buttons/Button.pack");
        skin.addRegions(buttonAtlas);
        font = new BitmapFont(Gdx.files.internal("Fonts/Font.fnt"),false);
	    
	    TextButtonStyle style = new TextButtonStyle();
	    style.up = skin.getDrawable("ButtonUp");
	    style.over = skin.getDrawable("ButtonDown");
	    style.down = skin.getDrawable("ButtonDown");
	    style.font = font;
	    
	    startGame = new TextButton("Start Game",style);
	    
        options = new TextButton("Options",style);
        
        mods = new TextButton("Mods",style);
        mods.addListener(modsListener);
        
        endGame = new TextButton("End",style);
        endGame.addListener(endGameListener);
        

	    Table table = new Table();
	    table.setFillParent(true);
	    stage.addActor(table);
	    
	    table.add(startGame).pad(2);
	    table.row();
	    table.add(options).pad(2);
	    table.row();
	    table.add(mods).pad(2);
	    table.row();
	    table.add(endGame).pad(2);
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	    stage.act(Gdx.graphics.getDeltaTime());
	    stage.draw();

	    Table.drawDebug(stage);
	}

	@Override
	public void resize(int width, int height) {
		stage.getViewport().update(width, height, true);
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
		stage.dispose();
        skin.dispose();
        batch.dispose();
	}

}
