package com.simple.service;

public class CustomerServiceInfo {

    private final String office;
    private final String team;
    private final String api;

    public CustomerServiceInfo(String office, String team, String api) {
        this.office = office;
        this.team = team;
        this.api = api;
    }

    public String getOffice() {
        return office;
    }

    public String getTeam() {
        return team;
    }

    public String getApi() {
        return api;
    }
}
