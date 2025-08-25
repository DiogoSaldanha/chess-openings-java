package com.diogo.dev.core;

import com.diogo.dev.core.model.Opening;

import java.util.List;
import java.util.Scanner;

public class MenuCLI {
    public static void showMenu(List<Opening> openings) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------------------------------------------");
        System.out.println("Selecione a abertura que deseja praticar!");

        for (Opening opening : openings) {
            System.out.println(opening.getId() + ". " + opening.getName());
        }

        System.out.print("\nEscolha: ");
        int choice = scanner.nextInt();

        try{
            System.out.println("Você escolheu a abertura " + openings.get(choice - 1).getName() + "!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Escolha inválida. Encerrando o programa.");
        }
        System.out.println("---------------------------------------------------------------");
    }

}
