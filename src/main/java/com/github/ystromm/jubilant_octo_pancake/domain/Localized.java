package com.github.ystromm.jubilant_octo_pancake.domain;

public class Localized {
    private final String title;
    private final String description;

    public Localized(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }
}
