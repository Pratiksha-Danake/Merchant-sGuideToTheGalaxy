package com.amaap.merchantguide.domain.service.io.reader.validator;

import java.util.regex.Pattern;

public class InputLineValidator {
    private static final Pattern unitPattern = Pattern.compile("^([A-Za-z]+) is ([I|V|X|L|C|D|M]+)$");
    private static final Pattern metalPattern = Pattern.compile("^([A-Za-z]+) ([A-Za-z]+) is (\\d+)$");
    private static final Pattern questionPattern = Pattern.compile("^((how many)|(how much is)) ([A-Za-z ]+) ([A-Za-z]+)\\?$");

    public boolean isValidUnitLine(String line) {
        return line.matches(unitPattern.pattern());
    }

    public boolean isValidMetalCreditLine(String line) {
        return line.matches(metalPattern.pattern());
    }

    public boolean isValidQueryLine(String line) {
        return line.matches(questionPattern.pattern());
    }
}
