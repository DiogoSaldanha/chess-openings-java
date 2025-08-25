package com.diogo.dev;

import com.diogo.dev.core.MenuCLI;
import com.diogo.dev.core.model.Opening;
import com.diogo.dev.core.OpeningLoader;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Opening> openings = OpeningLoader.loadJSON();

        MenuCLI.showMenu(openings);

    }
}