package com.compare.numbers.utilites;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;

public class ConvertUtility {
    public static ArrayList<Integer> convertStringToInt(String arguments) {

        ArrayList<Integer> argumentsList = new ArrayList<>();

        for (String argument : arguments.split(",")) {
            if (NumberUtils.isNumber(argument)) {
                argumentsList.add(NumberUtils.toInt(argument, 0));
            }
        }

        return argumentsList;
    }
}
