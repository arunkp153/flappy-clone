package com.flappy.game.service;

import com.flappy.game.engine.GameEngine;
import com.flappy.game.model.GameState;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private final GameEngine engine = new GameEngine();

    public GameState getState() {
        engine.update();
        return engine.getState();
    }

    public void jump() {
        engine.jump();
    }

    public void restart() {
        engine.reset();
    }
}
