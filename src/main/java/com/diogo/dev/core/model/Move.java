package com.diogo.dev.core.model;

public class Move {
    private String notation;
    private boolean white; // 'true' para caso o jogador de brancas jogou

    public Move(String notation, boolean white) {
        this.notation = notation;
        this.white = white;
    }

    public Move() {
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
