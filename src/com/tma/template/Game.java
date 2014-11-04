package com.tma.template;

/**
 * Created by thuynghi on 11/4/2014.
 */
public abstract class Game {
    abstract void initialize ();
    abstract void startPlay ();
    abstract void endPlay ();

    // template method
    public final void play () {

        // initialize the game
        initialize();

        // start game
        startPlay();

        // end game
        endPlay();
    }
}
