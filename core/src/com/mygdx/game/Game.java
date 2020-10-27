package com.mygdx.game;


import com.mygdx.game.buttons.Centre;

public class Game {
    private Arrow arrow;
    private Centre centre;

    public Game(Arrow arrow, Centre centre) {
        this.arrow = arrow;
        this.centre = centre;
    }

    public void result(){
        centre.setChoice(false);
    }
}
