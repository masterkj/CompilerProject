package codgen;

import codgen.row_functions.RowFunction;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

import static codgen.Mapper.*;

public class FlatProcess {

    public static void flat(String shuffledFilePath, RowFunction rowFunction, String subName) throws IOException {

        if(Query.EXPLAIN_PLAN)
            System.out.println("row function ["+RowFunction.getName(rowFunction) + "] "+subName);

        String outFileName = RowFunction.getName(rowFunction) + "(" + subName + ")";
        String outFilePath = Query.OUTPUT_FLAT_PATH + "/" + outFileName + ".csv";

        File shuffledFile = new File(shuffledFilePath);

        createDire(Query.OUTPUT_FLAT_PATH);
        BufferedWriter outFileBuffer = new BufferedWriter(new FileWriter(outFilePath));

        HashMap<String, ArrayList<String>> shuffledFileMap, outFileMap = new HashMap<>();
        shuffledFileMap = shuffledFileToMap(shuffledFile);

        String fileHeader = getHeader(shuffledFile);
        outFileBuffer.append(fileHeader).append("\n");

        shuffledFileMap.forEach((e, s) -> {
            outFileMap.put(e, rowFunction.flat(s));
        });
        writeShuffledMap(outFileBuffer, outFileMap);

    }

}
