package com.github.ystromm.jubilant_octo_pancake.domain;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class Asset {
    private final String id;
    private final Collection<Video> videos;
    private final Map<String, Localized> descriptions;
    private final Date changed;

    public Asset(String id, Collection<Video> medias, Map<String, Localized> descriptions, Date changed) {
        this.id = id;
        this.videos = medias;
        this.descriptions = descriptions;
        this.changed = changed;
    }

    public String getId() {
        return id;
    }

    public Collection<Video> getVideos() {
        return videos;
    }

    public Map<String, Localized> getDescriptions() {
        return descriptions;
    }

    public Date getChanged() {
        return changed;
    }
}
