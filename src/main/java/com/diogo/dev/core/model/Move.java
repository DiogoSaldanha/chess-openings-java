package com.diogo.dev.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class Move {
    private String notation;
    private boolean white; // 'true' para caso o jogador de brancas jogou

    public Move() {
    }

    public Move(String notation, boolean white) {
        this.notation = notation;
        this.white = white;
    }

    public String getNotation() {
        return notation;
    }

    public boolean isWhite() {
        return white;
    }

    @Override
    public String toString() {
        return (white ? "Branco: " : "Preto: ") + notation;
    }
}
