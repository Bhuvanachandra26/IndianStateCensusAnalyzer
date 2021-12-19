package com.bridgelabz.indianstatecensusanalyzer;

import com.bridgelabz.indianstatecensusanalyzer.CustomizedExceptions;
import com.bridgelabz.indianstatecensusanalyzer.FileReaderWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**************************************************************************************************
 *
 * Purpose : Ability for the analyser to load the Indian States Census
 *           Information from a csv file - Create a StateCensusAnalyser Class
 *           to load the State Census CSV Data
 *           - Create CSVStateCensus Class to load the CSV Data
 *           - Use Iterator to load the data
 *           - Check with StateCensusAnalyser to ensure number of records matches
 *
 ***************************************************************************************************/

public class IndianStateCensusAnalyzer {

    public static void main(String[] args) throws CustomizedExceptions {
        String filePath = "E:\\BRIDGE LABZ RPF\\IndianStateCensusAnalyzer\\src\\main\\java\\com\\bridgelabz\\indianstatecensusanalyzer\\Files\\StateCensusData.csv";

        IndianStateCensusAnalyzer id = new IndianStateCensusAnalyzer();

    }

    /**
     * Purpose : To get the number of records in CSV File
     */
    public int getNumberOfRecords(String filePath) throws CustomizedExceptions {
        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        int count = fileReaderWriter.getTotalRecords(filePath);

        return count;
    }

    /**
     * Purpose : To get flag  value from FileReader method
     */
    public boolean delimiterChecker(String filePath) {
        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        boolean flag = fileReaderWriter.checkDelimiter(filePath);
        return flag;
    }

    /**
     * Purpose : To get flag value from FileReaderWriter Method
     */
    public  boolean csvHeaderChecker(String filePath) throws IOException, CustomizedExceptions {
        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("State","Population","Area","Density"));
        boolean flag = fileReaderWriter.checkCSVHeader(filePath, stringArrayList);
        return flag;
    }

}