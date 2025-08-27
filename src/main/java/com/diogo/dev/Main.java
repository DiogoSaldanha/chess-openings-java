package com.diogo.dev;

import com.diogo.dev.core.MenuCLI;
import com.diogo.dev.core.model.Opening;
import com.diogo.dev.core.OpeningLoader;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {

            List<Opening> openings = OpeningLoader.loadJSON();
            MenuCLI menu = new MenuCLI(openings);
            menu.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}