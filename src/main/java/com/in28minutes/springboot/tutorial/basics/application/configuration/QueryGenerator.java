package com.in28minutes.springboot.tutorial.basics.application.configuration;

public class QueryGenerator {

    public static int KEYWORD = 0;
    public static int SEMANTIC = 1;
    public static int MULTISEARCH = 2;

    public String[] autocomplete = {"MIRAE", "DAHYE", "HYNSK", "YUNSU", "FAKER"};
    private String[] header = {"Rendering engine", "Browser", "Platform", "Engine version", "CSS grade"};

    private int concept;
    private boolean reasoningType;

    public QueryGenerator() {
    }

    public QueryGenerator(int concept, boolean reasoningType) {
        this.concept = concept;
        this.reasoningType = reasoningType;
    }

    public String[] getHeader() {
        return header;
    }

    public String getQuery(){

        return null;
    }
}
