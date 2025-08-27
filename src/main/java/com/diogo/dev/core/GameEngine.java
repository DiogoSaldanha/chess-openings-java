package com.diogo.dev.core;

import com.diogo.dev.core.model.Move;
import com.diogo.dev.core.model.Opening;

import java.util.List;
import java.util.Scanner;

public class GameEngine {

    private Scanner scanner = new Scanner(System.in);


    public void playOpening(Opening opening) {

        System.out.println("Praticando a abertura: " + opening.getName());
        List<Move> moves = opening.getMoves();
        int score = 0;

        for (int i = 0; i < moves.size(); i++) {
            Move correctMove = moves.get(i);
            System.out.println("O seu lance para o turno " + (i + 1) + ": ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase(correctMove.getNotation())) {
                System.out.println("Correto!!! Você acertou.");
                score++;
            } else {
                System.out.println("Você errou! Era esperado: " + correctMove.getNotation());
                score--;
            }
        }

        System.out.println("Pontuação final: ");
    }
}
