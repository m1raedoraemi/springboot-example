package com.in28minutes.springboot.tutorial.basics.application.configuration;

import java.util.ArrayList;

public class Result {
    private int distinctDatabase;
    private int distinctDataField;
    private int distinctDataValue;

    private ArrayList<Row> result;

    public Result(int distinctDatabase, int distinctDataField, int distinctDataValue, ArrayList<Row> result) {
        this.distinctDatabase = distinctDatabase;
        this.distinctDataField = distinctDataField;
        this.distinctDataValue = distinctDataValue;
        this.result = result;
    }

    public Result() {
    }

    public int getDistinctDatabase() {
        return distinctDatabase;
    }

    public void setDistinctDatabase(int distinctDatabase) {
        this.distinctDatabase = distinctDatabase;
    }

    public int getDistinctDataField() {
        return distinctDataField;
    }

    public void setDistinctDataField(int distinctDataField) {
        this.distinctDataField = distinctDataField;
    }

    public int getDistinctDataValue() {
        return distinctDataValue;
    }

    public void setDistinctDataValue(int distinctDataValue) {
        this.distinctDataValue = distinctDataValue;
    }

    public ArrayList<Row> getResult() {
        return result;
    }

    public void setResult(ArrayList<Row> result) {
        this.result = result;
    }
}
