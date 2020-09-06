package com.galdovich.day1.file;

import com.galdovich.day1.file.exception.ApplianceFileReaderException;
import com.galdovich.day1.model.entity.criteria.Criteria;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApplianceFileReader {
    private final static String SPACE = " ";
    private final static String SEPARATOR = ",";

    /*
     * The method reads input file and search for criteria information. The criteria information contains the name
     * of the required appliance, the parameter and its value.
     * If the file contains the required lines, method returns a collection of finding lines. If the required information
     * is missing, then method returns aт empty collection.
     */
    public List<String> readLine(String file, Criteria criteria)
            throws ApplianceFileReaderException {
        List<String> resultList;
        String criteriaLine = criteria.getCriteria().entrySet().toString();
        String request = criteriaLine.substring(1, criteriaLine.length() - 1) + SEPARATOR;
        try (Stream<String> stream = Files.lines(Paths.get(file))) {
            resultList = stream
                    .filter(line -> line.contains(criteria.getGroupSearchName() + SPACE))
                    .filter(line -> line.contains(request))
                    .collect(Collectors.toList());
        } catch (IOException exc) {
            throw new ApplianceFileReaderException("Reading file error", exc);
        }
        return resultList;
    }
}