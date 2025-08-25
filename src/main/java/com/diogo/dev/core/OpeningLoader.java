package com.diogo.dev.core;

import com.diogo.dev.core.model.Opening;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class OpeningLoader {

    public static List<Opening> loadJSON() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        InputStream inputStream = OpeningLoader.class.getClassLoader().getResourceAsStream("openings.json");

        List<Opening> openings = mapper.readValue(inputStream, new TypeReference<List<Opening>>() {});

        return openings;
    }

}
