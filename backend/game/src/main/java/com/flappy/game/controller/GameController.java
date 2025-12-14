package com.flappy.game.controller;

import com.flappy.game.model.GameState;
import com.flappy.game.service.GameService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game")
@CrossOrigin
public class GameController {

    private final GameService service;

    public GameController(GameService service) {
        this.service = service;
    }

    @GetMapping("/state")
    public GameState state() {
        return service.getState();
    }

    @PostMapping("/jump")
    public void jump() {
        service.jump();
    }

    @PostMapping("/restart")
    public void restart() {
        service.restart();
    }
}
