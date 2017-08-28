package com.github.ystromm.interview.json;

import java.util.Collection;

public class AssetDTO {
    private final String id;
    private final Collection<LocalizedDTO> localizeds;
    private final Collection<MediumDTO> media;

    public AssetDTO(String id, Collection<LocalizedDTO> localizeds, Collection<MediumDTO> media) {
        this.id = id;
        this.localizeds = localizeds;
        this.media = media;
    }

    public String getId() {
        return id;
    }

    public Collection<LocalizedDTO> getLocalizeds() {
        return localizeds;
    }

    public Collection<MediumDTO> getMedia() {
        return media;
    }
}
