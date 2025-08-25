package com.diogo.dev.core.model;

import java.util.List;

public class Opening {

    private int id;
    private String name;
    private List<String> moves;

    public Opening() {
    }

    public Opening(int id, String name, List<String> moves) {
        this.id = id;
        this.name = name;
        this.moves = moves;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getMoves() {
        return moves;
    }

    @Override
    public String toString() {
        return "id = '" + id + '\'' +
                ", name = '" + name + '\'' +
                ", moves = " + moves;
    }
}
