package com.amaap.merchantguide.domain.model.validator;

import java.util.regex.Pattern;

public class IntergalacticUnitValidator {
    private static final Pattern unitPattern = Pattern.compile("^([A-Za-z]+) is ([I|V|X|L|C|D|M]+)$");

    public static boolean isValid(String line) {
        if (line.matches(unitPattern.pattern()))
            return true;
        return false;
    }
}
