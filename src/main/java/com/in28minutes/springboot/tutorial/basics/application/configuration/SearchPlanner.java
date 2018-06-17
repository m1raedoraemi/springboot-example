package com.in28minutes.springboot.tutorial.basics.application.configuration;

import java.util.ArrayList;

public class SearchPlanner {
    private boolean reasoningType = false;
    private int concept;

    private String searchStr;
    private ResultWrapper resultWrapper = null;

    public SearchPlanner() {
    }

    public SearchPlanner(String searchStr) {
        this.searchStr = searchStr;
    }

    public void startSearch(){
        if(searchStr.isEmpty())
            return;

        String[] splitSearchStr = searchStr.split(",");
        ArrayList<Result> results = new ArrayList<>();

        for(String str : splitSearchStr){
            results.add(queryToDatabase(str));
        }
        resultWrapper = new ResultWrapper(results);
    }

    private Result queryToDatabase(String searchStr){

        ArrayList<Row> rows = new ArrayList<>();
        for(int i = 0 ;i <13;i++){
            Row row = new Row(searchStr+i, searchStr, searchStr,searchStr,searchStr);
            rows.add(row);
        }
        Result result = new Result(rows.size(),rows.size(),rows.size(),rows);

        return result;
    }

    public ResultWrapper getResultWrapper() {
        return resultWrapper;
    }
}
