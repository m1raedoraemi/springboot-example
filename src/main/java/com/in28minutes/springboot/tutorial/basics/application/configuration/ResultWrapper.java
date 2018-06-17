package com.in28minutes.springboot.tutorial.basics.application.configuration;

import java.util.ArrayList;

public class ResultWrapper {

    private ArrayList<Result> resultWrapper;

    public ResultWrapper(ArrayList<Result> resultWrapper) {
        this.resultWrapper = resultWrapper;
    }

    public ArrayList<Result> getResultWrapper() {
        return resultWrapper;
    }

    public void setResultWrapper(ArrayList<Result> resultWrapper) {
        this.resultWrapper = resultWrapper;
    }
}
