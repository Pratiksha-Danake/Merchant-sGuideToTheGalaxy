//package com.amaap.merchantguide.service.io.reader.validator;
//
//import java.util.regex.Pattern;
//
//public class InputLineValidator {
//    private static final Pattern metalPattern = Pattern.compile("^([A-Za-z]+) ([A-Za-z]+) is (\\d+)$");
//    private static final Pattern questionPattern = Pattern.compile("^((how many)|(how much is)) ([A-Za-z ]+) ([A-Za-z]+)\\?$");
//
//    public static boolean isValid(String line) {
//
//        else if (line.matches(metalPattern.pattern()))
//            return true;
//        else if (line.matches(questionPattern.pattern()))
//            return true;
//        return false;
//    }
//}
