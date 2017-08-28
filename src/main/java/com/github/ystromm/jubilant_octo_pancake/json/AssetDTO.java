package com.github.ystromm.jubilant_octo_pancake.json;

import java.util.Collection;

public class AssetDTO {
    private final String id;
    private final Collection<LocalizedDTO> localizeds;
    private final Collection<VideoDTO> videos;

    public AssetDTO(String id, Collection<LocalizedDTO> localizeds, Collection<VideoDTO> videos) {
        this.id = id;
        this.localizeds = localizeds;
        this.videos = videos;
    }

    public String getId() {
        return id;
    }

    public Collection<LocalizedDTO> getLocalizeds() {
        return localizeds;
    }

    public Collection<VideoDTO> getVideos() {
        return videos;
    }
}
