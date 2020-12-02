package com.greencity.enums;

public enum URLs {
    BASE_URL("https://ita-social-projects.github.io/GreenCityClient/#/welcome");
    private final String value;

    URLs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
