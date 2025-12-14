package com.flappy.game.model;

public class Bird {

    private double y = 250;
    private double velocity = 0;

    private static final double GRAVITY = 0.6;
    private static final double JUMP_FORCE = -10;

    public void update() {
        velocity += GRAVITY;
        y += velocity;
    }

    public void jump() {
        velocity = JUMP_FORCE;
    }

    public double getY() {
        return y;
    }
}
