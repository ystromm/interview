package com.github.ystromm.jubilant_octo_pancake.domain;

import java.util.Date;

public class Video {
    private final String location;
    private final Date changed;

    public Video(String location, Date changed) {
        this.location = location;
        this.changed = changed;
    }

    public String getLocation() {
        return location;
    }

    public Date getChanged() {
        return changed;
    }
}
