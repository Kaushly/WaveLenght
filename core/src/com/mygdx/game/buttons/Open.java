package com.mygdx.game.buttons;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.mygdx.game.GameScreen;

public class Open extends ImageButton {

    public Open(final GameScreen gameScreen) {
        super(new TextureRegionDrawable(new Texture("open.png")));
        setPosition(Gdx.graphics.getWidth() / 2 - getWidth(), 80);

        addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                if(gameScreen.isCloseCurtain()){
                    gameScreen.setCloseCurtain(false);
                }
            }
        });
    }
}
