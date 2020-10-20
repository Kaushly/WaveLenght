package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class GameScreen {
    private SpriteBatch batch;
    private Stage stage;
    private Vector2 position = new Vector2(Gdx.graphics.getWidth()/ 2, Gdx.graphics.getHeight() / 2);
    private Texture fon;
    private Texture disc;
    private Centre centre;
    private Arrow arrow;
    private Sector sector;


    public GameScreen(SpriteBatch batch) {
        this.batch = batch;
        this.stage = new Stage();
    }

    public void create(){
        fon = new Texture("fon.png");
        disc = new Texture("disc.png");
//        center = new Texture("center.png");
        arrow = new Arrow();
        sector = new Sector();
        centre = new Centre();
        stage.addActor(centre);
    }

    public void render(){
        float dt = Gdx.graphics.getDeltaTime();
        update(dt);
        batch.begin();
        batch.draw(fon, 0 ,0);
        batch.draw(disc, position.x - disc.getWidth() / 2, position.y);
        sector.render(batch);
        arrow.render(batch);
//        batch.draw(center, position.x - center.getWidth() / 2, position.y - center.getHeight()/2);
        batch.end();

        Gdx.input.setInputProcessor(stage);
        stage.act(dt);
        stage.draw();
    }

    public void update(float dt){
        if(centre.isActivation()) {
            arrow.update(dt);
        }
    }
}
