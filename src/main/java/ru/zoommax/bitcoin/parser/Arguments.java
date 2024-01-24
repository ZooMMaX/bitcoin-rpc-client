package ru.zoommax.bitcoin.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arguments {
    private List<String> jsonschema;
    private List<String> description;

    public Arguments(String raw) {
        String[] lines = raw.split("\n");
        jsonschema = new ArrayList<>();
        description = new ArrayList<>();

        for (int i = 0; i < lines.length; i++) {
            String[] parts = lines[i].split("\\(", 2);
            if (!parts[0].isEmpty()){
                jsonschema.add(parts[0].replaceFirst("\\s++$", ""));
                if (parts.length > 1) {
                    description.add("(" + parts[1].trim());
                }else{
                    description.add("");
                }
            }
        }
    }

    public List<String> getJsonschema() {
        return jsonschema;
    }

    public List<String> getDescription() {
        return description;
    }
}
