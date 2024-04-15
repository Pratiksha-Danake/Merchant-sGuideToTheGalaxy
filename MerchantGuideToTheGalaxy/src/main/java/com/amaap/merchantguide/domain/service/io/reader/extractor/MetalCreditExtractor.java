package com.amaap.merchantguide.domain.service.io.reader.extractor;

import com.amaap.merchantguide.domain.model.entity.MetalCredit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetalCreditExtractor {
    public static MetalCredit getMetalCredit(String line) {
        String metalName = "";
        int metalValue = 0;
        Pattern pattern = Pattern.compile("(.*?) (\\w+) is (\\d+) Credits");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            metalName = matcher.group(1) + " " + matcher.group(2);
            metalValue = Integer.parseInt(matcher.group(3));
        }
        MetalCredit metalCredit = MetalCredit.create(metalName, metalValue);
        return metalCredit;
    }
}
