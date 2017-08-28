package com.github.ystromm.jubilant_octo_pancake.json;

public class LocalizedDTO {
    private final String language;
    private final String title;
    private final String description;

    public LocalizedDTO(String language, String title, String description) {
        this.language = language;
        this.title = title;
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
