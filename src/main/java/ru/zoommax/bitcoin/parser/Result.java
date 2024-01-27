package ru.zoommax.bitcoin.parser;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Result.
 */
public class Result {
	/**
	 * The Jsonschema.
	 */
	private List<String> jsonschema;
	/**
	 * The Description.
	 */
	private List<String> description;

	/**
	 * Instantiates a new Result.
	 *
	 * @param raw the raw
	 */
	public Result(String raw) {
		final String[] lines = raw.split("\n");

		jsonschema = new ArrayList<>();
		description = new ArrayList<>();

		for (final String line : lines) {
			final String[] parts = line.split("\\(", 2);
			if (!parts[0].isEmpty()) {
				jsonschema.add(parts[0].replaceFirst("\\s++$", ""));
				if (parts.length > 1) {
					description.add("(" + parts[1].trim());
				} else {
					description.add("");
				}
			}
		}
	}

	/**
	 * Gets jsonschema.
	 *
	 * @return the jsonschema
	 */
	public List<String> getJsonschema() {
		return jsonschema;
	}

	/**
	 * Gets description.
	 *
	 * @return the description
	 */
	public List<String> getDescription() {
		return description;
	}
}
