package com.tma.template;

/**
 * Created by thuynghi on 11/4/2014.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();

        System.out.println();

        game = new Football();
        game.play();
    }
}
