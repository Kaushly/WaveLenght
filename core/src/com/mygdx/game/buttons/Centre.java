package com.mygdx.game.buttons;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.mygdx.game.GameScreen;

public class Centre extends ImageButton {
    private boolean activation;
    private boolean choice;

    public Centre(final GameScreen gameScreen) {
        super(new TextureRegionDrawable(new Texture("update.png")));
        setPosition(Gdx.graphics.getWidth() / 2 - getWidth() / 2, Gdx.graphics.getHeight() / 2 - getHeight() / 2);
        addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                if (gameScreen.isCloseCurtain()) {
                    if (!activation) {
                        activation = true;
                    } else {
                        activation = false;
                        choice = true;
                    }
                }
            }
        });
    }

    public boolean isActivation() {
        return activation;
    }

    public boolean isChoice() {
        return choice;
    }

    public void setChoice(boolean choice) {
        this.choice = choice;
    }
}
