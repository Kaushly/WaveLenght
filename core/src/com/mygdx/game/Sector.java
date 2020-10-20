package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

public class Sector {
    private Vector2 position = new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
    private TextureRegion sector_4;
    private TextureRegion sector_3L;
    private TextureRegion sector_3R;
    private TextureRegion sector_2L;
    private TextureRegion sector_2R;
    private float angle;
    private int height = 50;



    public Sector() {
        sector_4 = new TextureRegion(new Texture("sector4.png"));
        sector_3L = new TextureRegion(new Texture("sector3.png"));
        sector_3R = new TextureRegion(new Texture("sector3.png"));
        sector_2L = new TextureRegion(new Texture("sector2.png"));
        sector_2R = new TextureRegion(new Texture("sector2.png"));
        angle = MathUtils.random(0.0f, 180.0f);
    }

    public void render(SpriteBatch batch) {

        batch.draw(sector_2L, position.x - height / 2, position.y - height / 2, 15, height / 2, sector_2L.getRegionWidth(), sector_2L.getRegionHeight(), 1, 1, angle - 12.0f);
        batch.draw(sector_2R, position.x- height / 2, position.y - height / 2, 15, height / 2, sector_2R.getRegionWidth(), sector_2R.getRegionHeight(), 1, 1, angle + 12.0f);
        batch.draw(sector_3L, position.x- height / 2, position.y - height / 2, 15, height / 2, sector_3L.getRegionWidth(), sector_3L.getRegionHeight(), 1, 1, angle - 6.0f);
        batch.draw(sector_3R, position.x- height / 2, position.y - height / 2, 15, height / 2, sector_3R.getRegionWidth(), sector_3R.getRegionHeight(), 1, 1, angle + 6.0f);
        batch.draw(sector_4, position.x- height / 2, position.y - height / 2, 15, height / 2, sector_4.getRegionWidth(), sector_4.getRegionHeight(), 1, 1, angle);
    }
}
