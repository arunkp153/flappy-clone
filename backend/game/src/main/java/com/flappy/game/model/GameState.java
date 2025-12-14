package com.flappy.game.model;

import java.util.List;

public class GameState {

    public double birdY;
    public List<Obstacle> obstacles;
    public boolean gameOver;
    public int score;

    public GameState(double birdY, List<Obstacle> obstacles, boolean gameOver, int score) {
        this.birdY = birdY;
        this.obstacles = obstacles;
        this.gameOver = gameOver;
        this.score = score;
    }
}
