package GenericGameStudios.GenericRandomGame.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.CheckBox;
import com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;

public class ModScreen implements Screen {
	
	private MainMenuScreen mainMenuScreen;
	
	private Skin skin;
	private Stage stage;
	private BitmapFont font;
	
	private TextureAtlas buttonAtlas;
	private TextureAtlas checkBoxAtlas;
	
	private Texture white;
	private Texture blue;
	private Texture lightblue;
	private Texture green;
	
	private Table mainTable;
	private Table modNamesTable;
	private Table modDescriptionTable;
	private Table buttonTable;
	
	private ScrollPane modNamesScrollPane;
	private ScrollPane modDescriptionScrollPane;
	
	private LabelStyle labelStyle;
	private CheckBoxStyle boxStyle;
	private TextButtonStyle buttonStyle;
	private TextFieldStyle textFieldStyle;	
	
	private Label label;
	private CheckBox box;
	private TextButton button;
	private TextField modDescription;
	
	private ChangeListener backListener = new ChangeListener(){
		@Override
		public void changed(ChangeEvent event, Actor actor) {
			mainMenuScreen.create();
			((Game) Gdx.app.getApplicationListener()).setScreen(mainMenuScreen);
		}
	};
	
	public ModScreen(MainMenuScreen mainMenuScreen){
		this.mainMenuScreen = mainMenuScreen;
	}
	
	public void create(){
		skin = new Skin();
		stage = new Stage();
		
	    Gdx.input.setInputProcessor(stage);
	    
        font = new BitmapFont(Gdx.files.internal("Fonts/Font.fnt"),false);
	    
	    this.initDrawables();
	    this.initStyles();
	    this.initTablesAndScrollBars();
	    
	    label = new Label("ModName",labelStyle);
	    modDescriptionTable.add(label).height(30).left();
	    modDescriptionTable.row();
	    
	    modDescription = new TextField("",textFieldStyle);
	    modDescriptionScrollPane = new ScrollPane(modDescription);
	    modDescriptionTable.add(modDescriptionScrollPane).size(400,500);
	    modDescriptionTable.row();
	    
	    button = new TextButton("Apply",buttonStyle);
	    buttonTable.add(button).align(Align.bottom).size(90, 40).pad(10);
	    
	    button = new TextButton("Back",buttonStyle);
	    button.addListener(backListener);
	    buttonTable.add(button).align(Align.bottom).size(90, 40).pad(10);
	    
	    modDescriptionTable.add(buttonTable).size(400, 50);
	    mainTable.add(modDescriptionTable).height(580).align(Align.top).pad(10);
	    stage.addActor(mainTable);
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
	}
	
	private void initDrawables(){
		buttonAtlas = new TextureAtlas("Buttons/Button.pack");
	    checkBoxAtlas = new TextureAtlas("CheckBoxes/CheckBox.pack");
	    
	    white = new Texture("Backgrounds/white.png");
	    lightblue = new Texture("Backgrounds/lightblue.png");
	    blue = new Texture("Backgrounds/blue.png");
	    green = new Texture("Backgrounds/green.png");
	    
        skin.addRegions(buttonAtlas);
        skin.addRegions(checkBoxAtlas);
        
        skin.add("white", white);
        skin.add("lightblue", lightblue);
        skin.add("blue", blue);
        skin.add("green", green);
	}
	
	private void initStyles(){
		labelStyle = new LabelStyle(font,Color.GREEN);
		    
	    boxStyle = new CheckBoxStyle();
	    boxStyle.checkboxOff = skin.getDrawable("CheckBoxUnchecked");
	    boxStyle.checkboxOn = skin.getDrawable("CheckBoxChecked");
	    boxStyle.font = font;
	    
	    buttonStyle = new TextButtonStyle();
	    buttonStyle.up = skin.getDrawable("ButtonUp");
	    buttonStyle.over = skin.getDrawable("ButtonDown");
	    buttonStyle.down = skin.getDrawable("ButtonDown");
	    buttonStyle.font = font;
	    
	    textFieldStyle = new TextFieldStyle();
	    textFieldStyle.font = font;
	}
	
	private void initTablesAndScrollBars(){
		//outer table
        mainTable = new Table();
        mainTable.setFillParent(true);
        mainTable.debug();
        
        //table1 in ScrollBar
        modNamesTable = new Table();
        modNamesTable.debug();
        
        modDescriptionTable = new Table();
        modDescriptionTable.setSize(400, 580);
        
        buttonTable = new Table();
        
        //ScrollPane
	    modNamesScrollPane = new ScrollPane(modNamesTable);
	    modNamesScrollPane.setOverscroll(false, false);
	    mainTable.add(modNamesScrollPane).width(298).top().pad(10);
	}

}
