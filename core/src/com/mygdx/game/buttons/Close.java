package com.mygdx.game.buttons;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.mygdx.game.GameScreen;

public class Close extends ImageButton {

    public Close(final GameScreen gameScreen) {
        super(new TextureRegionDrawable(new Texture("close.png")));
        setPosition(Gdx.graphics.getWidth() / 2, 80.0f);
        addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                if (!gameScreen.isCloseCurtain()) {
                    gameScreen.setCloseCurtain(true);
                }
            }
        });
    }
}
