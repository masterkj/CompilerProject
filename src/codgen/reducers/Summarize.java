package codgen.reducers;

import codgen.Query;

import java.util.ArrayList;

public class Summarize {

    public static String reduce(String sourceFilePath,String reduceFileName) {

        Query.reduce(sourceFilePath, AggregationFunction.choseReducer("avg"),"mean("+reduceFileName+")");

        Query.reduce(sourceFilePath, AggregationFunction.choseReducer("median"),"median("+reduceFileName+")");

        Query.reduce(sourceFilePath, AggregationFunction.choseReducer("mode"),"mode("+reduceFileName+")");

        Query.reduce(sourceFilePath, AggregationFunction.choseReducer("min"),"min("+reduceFileName+")");

        Query.reduce(sourceFilePath, AggregationFunction.choseReducer("max"),"max("+reduceFileName+")");

        Query.reduce(sourceFilePath, AggregationFunction.choseReducer("Q1"),"Q1("+reduceFileName+")");

        Query.reduce(sourceFilePath, AggregationFunction.choseReducer("Q3"),"Q3("+reduceFileName+")");

        Query.reduce(sourceFilePath, AggregationFunction.choseReducer("std"),"std("+reduceFileName+")");

        Query.reduce(sourceFilePath, AggregationFunction.choseReducer("count"),"count("+reduceFileName+")");

        return null;
    }
}
