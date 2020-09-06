package com.galdovich.day1.parser;

import java.util.ArrayList;
import java.util.List;

public class ApplianceParser {
    /*
     * The variable stores the regular expression. Expression finds: equipment name, parameter name and all
     * whitespace and punctuation characters
     */
    private final static String REGEX_PARAM = "\\p{Ps}?\\p{L}+( : )|\\p{Pe}|\\p{L}+((_)?\\p{L}+)*=|[, ]";

    /*
     * The method creates a new collection in which each item is the parameter value in the order in which they
     * were in the database. The method removes all extraneous information including spaces and punctuation marks.
     */
    public List<String> createParamList(List<String> list) {
        List<String> result = new ArrayList<>();
        if (list != null && !list.isEmpty()) {
            String[] array;
            String line = list.toString();
            array = line.split(REGEX_PARAM);
            for (String a : array) {
                if (!a.isEmpty()) {
                    result.add(a);
                }
            }
        }
        return result;
    }
}