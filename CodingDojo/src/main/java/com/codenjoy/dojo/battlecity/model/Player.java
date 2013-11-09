package com.codenjoy.dojo.battlecity.model;

import com.codenjoy.dojo.bomberman.services.BombermanEvents;
import com.codenjoy.dojo.services.Dice;
import com.codenjoy.dojo.services.Direction;
import com.codenjoy.dojo.services.EventListener;

public class Player {
    private Tank tank;
    private EventListener listener;
    private int maxScore;
    private int score;

    public Player(EventListener listener, Dice dice) {
        this.listener = listener;
        clearScore();
        tank = new Tank(0, 0, Direction.UP, dice);
    }

    public Tank getTank() {
        return tank;
    }

    private void increaseScore() {
        score = score + 1;
        maxScore = Math.max(maxScore, score);
    }

    public int getMaxScore() {
        return maxScore;
    }

    public int getScore() {
        return score;
    }

    public void event(BombermanEvents event) {
        switch (event) {
            case KILL_MEAT_CHOPPER : increaseScore(); break;
            case KILL_DESTROY_WALL : increaseScore(); break;
            case KILL_BOMBERMAN: gameOver(); break;
        }

        if (listener != null) {
            listener.event(event.name());
        }
    }

    private void gameOver() {
        tank.kill(null);
        score = 0;
    }

    public void clearScore() {   // TODO test me
        score = 0;
        maxScore = 0;
    }
}