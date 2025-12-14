package com.flappy.game.model;

public class Obstacle {

    private double x;
    private double gapY;

    public Obstacle(double x, double gapY) {
        this.x = x;
        this.gapY = gapY;
    }

    public void update() {
        x -= 4;
    }

    public double getX() {
        return x;
    }

    public double getGapY() {
        return gapY;
    }
}
