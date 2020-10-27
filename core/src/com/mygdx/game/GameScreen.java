package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.game.buttons.Centre;
import com.mygdx.game.buttons.Close;
import com.mygdx.game.buttons.Open;

public class GameScreen {
    private SpriteBatch batch;
    private Stage stage;
    private Vector2 position = new Vector2(Gdx.graphics.getWidth()/ 2, Gdx.graphics.getHeight() / 2);
    private Texture fon;
    private Texture disc;
    private Texture curtain;
    private boolean closeCurtain = true;
    private Centre centre;
    private Arrow arrow;
    private Sector sector;
    private Game game;
    private Close close;
    private Open open;


    public GameScreen(SpriteBatch batch) {
        this.batch = batch;
        this.stage = new Stage();
    }

    public void create(){
        fon = new Texture("fon.png");
        disc = new Texture("disc.png");
        curtain = new Texture("disc.png");
        arrow = new Arrow();
        sector = new Sector();
        centre = new Centre(this);
        stage.addActor(centre);
        close = new Close(this);
        stage.addActor(close);
        open = new Open(this);
        stage.addActor(open);
        game = new Game(arrow,centre);

    }

    public void render(){
        float dt = Gdx.graphics.getDeltaTime();
        update(dt);
        batch.begin();
        batch.draw(fon, 0 ,0);
        batch.draw(disc, position.x - disc.getWidth() / 2.0f, position.y);
        sector.render(batch);
        if(closeCurtain){
            batch.draw(curtain, position.x - disc.getWidth() / 2.0f, position.y);
        }
        arrow.render(batch);
        batch.end();

        Gdx.input.setInputProcessor(stage);
        stage.act(dt);
        stage.draw();
    }

    public void update(float dt){

        if(centre.isActivation()) {
            arrow.update(dt);
        }
        if (centre.isChoice()){
            game.result();
        }
    }

    public boolean isCloseCurtain() {
        return closeCurtain;
    }

    public void setCloseCurtain(boolean closeCurtain) {
        this.closeCurtain = closeCurtain;
    }
}
