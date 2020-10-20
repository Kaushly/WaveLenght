package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class Centre extends ImageButton {
     private boolean activation;

    public Centre() {
        super(new TextureRegionDrawable(new Texture("center.png")));
        setPosition(Gdx.graphics.getWidth() / 2 - getWidth() / 2, Gdx.graphics.getHeight() / 2 - getHeight()/2);

        addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                if(activation != true){
                    activation = true;
                }
            }
        });
    }

    public boolean isActivation() {
        return activation;
    }
}
