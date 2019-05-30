package codgen.reducers;

import codgen.Query;

import java.util.ArrayList;

public class Summarize {

    public static String reduce(String sourceFilePath,String reduceFileName) {

        Query.reduce(sourceFilePath, AggregationFunction.choseReducer("avg"),reduceFileName);

        return null;
    }
}
