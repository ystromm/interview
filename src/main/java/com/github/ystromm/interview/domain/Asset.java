package com.github.ystromm.interview.domain;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class Asset {
    private final String id;
    private final Collection<Medium> media;
    private final Map<String, Localized> descriptions;
    private final Date changed;

    public Asset(String id, Collection<Medium> medias, Map<String, Localized> descriptions, Date changed) {
        this.id = id;
        this.media = medias;
        this.descriptions = descriptions;
        this.changed = changed;
    }

    public String getId() {
        return id;
    }

    public Collection<Medium> getMedia() {
        return media;
    }

    public Map<String, Localized> getDescriptions() {
        return descriptions;
    }

    public Date getChanged() {
        return changed;
    }
}
