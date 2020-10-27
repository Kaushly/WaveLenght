package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class Arrow {
    private Vector2 position = new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
    private TextureRegion arrow;
    private float angle = 90.0f;
    private float wight = 360;
    private float height = 80;
    private float result;

    public Arrow() {
        arrow = new TextureRegion(new Texture("arrow.png"));
    }


    public void update(float dt) {
        float mx = Gdx.input.getX();
        float my = Gdx.graphics.getHeight() - Gdx.input.getY();
        angle = Utils.getAngle(position.x, position.y, mx, my);
        if (angle > 180.0f) {
            angle = 180.0f;
        }
        if (angle < 2.0f && angle > 0.0f) {
            angle = 0.0f;
        }
        if (angle < 0 && angle >= -90.0f) {
            angle = 0.0f;
        }
        if (angle < -90.0f && angle > -180.0f) {
            angle = 180.0f;
        }
        result = angle;

    }


    public void render(SpriteBatch batch) {
        batch.draw(arrow, position.x - height / 2, position.y - arrow.getRegionHeight() / 2, height / 2, height / 2, wight, height, 1, 1, angle);
    }

    public float getResult() {
        return result;
    }
}
