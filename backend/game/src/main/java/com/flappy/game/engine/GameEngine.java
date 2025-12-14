package com.flappy.game.engine;

import com.flappy.game.model.*;

import java.util.*;

public class GameEngine {

    private Bird bird;
    private List<Obstacle> obstacles;
    private boolean gameOver;
    private int score;
    private Random random = new Random();

    public GameEngine() {
        reset();
    }

    public void reset() {
        bird = new Bird();
        obstacles = new ArrayList<>();
        obstacles.add(new Obstacle(600, random.nextInt(200) + 100));
        gameOver = false;
        score = 0;
    }

    public void update() {
        if (gameOver) return;

        bird.update();

        for (Obstacle o : obstacles) {
            o.update();

            if (o.getX() < 100 && o.getX() > 60) {
                if (bird.getY() < o.getGapY() - 80 ||
                    bird.getY() > o.getGapY() + 80) {
                    gameOver = true;
                }
            }
        }

        if (bird.getY() < 0 || bird.getY() > 480) {
            gameOver = true;
        }

        if (obstacles.get(obstacles.size() - 1).getX() < 300) {
            obstacles.add(new Obstacle(600, random.nextInt(200) + 100));
            score++;
        }
    }

    public void jump() {
        bird.jump();
    }

    public GameState getState() {
        return new GameState(bird.getY(), obstacles, gameOver, score);
    }
}
