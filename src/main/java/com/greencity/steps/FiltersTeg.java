package com.greencity.steps;

public enum FiltersTeg {
    NEWS("News"),
    EDUCATION("Education"),
    EVENTS("Events"),
    INITIATIVES("Initiatives"),
    ADS("Ads");


    private String filterTeg;

    FiltersTeg(String filterTeg){
        this.filterTeg=filterTeg;
    }

    public String getFilterTeg() {
        return filterTeg;
    }
}
