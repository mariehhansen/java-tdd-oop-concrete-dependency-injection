package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    private final PowerSupply powerSupply;
    public ArrayList<Game> installedGames;

    public Computer(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
        this.installedGames = new ArrayList<>();
    }

    public Computer(PowerSupply powerSupply, ArrayList<Game> installedGames) {
        this.powerSupply = powerSupply;
        this.installedGames = installedGames;
    }
    public void turnOn() {
        this.powerSupply.turnOn();
    }

    public void installGame(Game game) {
        this.installedGames.add(game);
    }

    public String playGame(String name) {
        for (Game g : this.installedGames) {
            if (g.name.equals(name)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
