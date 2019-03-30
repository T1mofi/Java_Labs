package com.compare.numbers.utilites;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;

public class ConvertFromStringToIntUtility {
    public static ArrayList<Integer> convertStringToInt(String arguments) {
        ArrayList<Integer> argumrentsList = new ArrayList<>();
        for (String argument : arguments.split(",")) {
            if (NumberUtils.isNumber(argument)) {
                argumrentsList.add(NumberUtils.toInt(argument, 0));
            }
        }

        return argumrentsList;
    }
}
