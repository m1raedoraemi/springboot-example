package com.in28minutes.springboot.tutorial.basics.application.configuration;

public class Row {
    private String datafield;
    private String database;
    private String dataservice;
    private String servicemanager;
    private String servicemanagerInfo;

    public String getDatafield() {
        return datafield;
    }

    public void setDatafield(String datafield) {
        this.datafield = datafield;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getDataservice() {
        return dataservice;
    }

    public void setDataservice(String dataservice) {
        this.dataservice = dataservice;
    }

    public String getServicemanager() {
        return servicemanager;
    }

    public void setServicemanager(String servicemanager) {
        this.servicemanager = servicemanager;
    }

    public String getServicemanagerInfo() {
        return servicemanagerInfo;
    }

    public void setServicemanagerInfo(String servicemanagerInfo) {
        this.servicemanagerInfo = servicemanagerInfo;
    }

    public Row(){}

    public Row(String datafield, String database, String dataservice, String servicemanager, String servicemanagerInfo) {
        this.datafield = datafield;
        this.database = database;
        this.dataservice = dataservice;
        this.servicemanager = servicemanager;
        this.servicemanagerInfo = servicemanagerInfo;
    }
}
