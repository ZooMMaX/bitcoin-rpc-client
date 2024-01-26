package ru.zoommax.bitcoin.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The type Blocks.
 */
public class Blocks {
    /**
     * The Description.
     */
    private String description;
    /**
     * The Arguments.
     */
    private Arguments arguments;
    /**
     * The Result.
     */
    private Result result;
    /**
     * The Examples.
     */
    private List<String> examples;

    /**
     * Instantiates a new Blocks.
     *
     * @param raw the raw
     */
    public Blocks(String raw) {
        String[] lines = raw.split("\n");
        String[] parts = {"","","",""};
        int resultIndex = 0;
        int argumentsIndex = 0;
        int exampleIndex = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].startsWith("Arguments") && argumentsIndex == 0) {
                argumentsIndex = i - 1;
            }
            if (lines[i].startsWith("Result") && resultIndex == 0) {
                resultIndex = i - 1;
            }
            if (lines[i].startsWith("Example")) {
                exampleIndex = i;
            }
        }

        for (int i = 0; i < lines.length; i++) {
            if (i < argumentsIndex) {
                parts[0] = parts[0] + lines[i]+ "\n";
            }
            if (i > argumentsIndex && i < resultIndex) {
                parts[1] = parts[1] + lines[i]+ "\n";
            }
            if (i > resultIndex && i < exampleIndex) {
                parts[2] = parts[2] + lines[i]+ "\n";
            }
            if (i > exampleIndex) {
                parts[3] = parts[3] + lines[i]+ "\n";
            }
        }

        if (resultIndex == 0 && argumentsIndex == 0 && exampleIndex == 0) {
            parts[0] = raw;
        }

        this.description = parts[0].trim();
        this.arguments = new Arguments(parts[1]);
        this.result = new Result(parts[2]);
        this.examples = new ArrayList<>(Arrays.asList(parts[3].split(">")));
        this.examples.replaceAll(String::trim);
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets arguments.
     *
     * @return the arguments
     */
    public Arguments getArguments() {
        return arguments;
    }

    /**
     * Gets result.
     *
     * @return the result
     */
    public Result getResult() {
        return result;
    }

    /**
     * Gets examples.
     *
     * @return the examples
     */
    public List<String> getExamples() {
        return examples;
    }
}
