package com.diogo.dev.core;

import com.diogo.dev.core.model.Opening;

import java.util.List;
import java.util.Scanner;

public class MenuCLI {

    private final List<Opening> openings;
    private final Scanner scanner = new Scanner(System.in);
    private final GameEngine gameEngine = new GameEngine();

    public MenuCLI(List<Opening> openings) {
        this.openings = openings;
    }

    public void start() {

        while(true) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("Selecione a abertura que deseja praticar!");

            for (Opening opening : openings) {
                System.out.println(opening.getId() + ". " + opening.getName());
            }
            System.out.println("0. Sair");

            System.out.print("\nEscolha: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Saindo do programa.");
                break;
            } else if (choice > 0 && choice <= openings.size()) {
                Opening selectedOpening = openings.get(choice - 1);
                gameEngine.playOpening(selectedOpening);
            } else {
                System.out.println("A escolha é inválida. Tente novamente.");
            }
            System.out.println("---------------------------------------------------------------");
        }
    }
}
