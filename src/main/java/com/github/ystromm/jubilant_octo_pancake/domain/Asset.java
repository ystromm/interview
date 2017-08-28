package com.github.ystromm.jubilant_octo_pancake.domain;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class Asset {
    private final String id;
    private final Collection<Video> media;
    private final Map<String, Localized> descriptions;
    private final Date changed;

    public Asset(String id, Collection<Video> medias, Map<String, Localized> descriptions, Date changed) {
        this.id = id;
        this.media = medias;
        this.descriptions = descriptions;
        this.changed = changed;
    }

    public String getId() {
        return id;
    }

    public Collection<Video> getMedia() {
        return media;
    }

    public Map<String, Localized> getDescriptions() {
        return descriptions;
    }

    public Date getChanged() {
        return changed;
    }
}
