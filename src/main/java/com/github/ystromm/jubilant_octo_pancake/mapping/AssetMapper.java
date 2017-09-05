package com.github.ystromm.jubilant_octo_pancake.mapping;

import com.github.ystromm.jubilant_octo_pancake.domain.Asset;
import com.github.ystromm.jubilant_octo_pancake.domain.Localized;
import com.github.ystromm.jubilant_octo_pancake.domain.Video;
import com.github.ystromm.jubilant_octo_pancake.json.AssetDTO;
import com.github.ystromm.jubilant_octo_pancake.json.LocalizedDTO;
import com.github.ystromm.jubilant_octo_pancake.json.VideoDTO;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class AssetMapper {

    public static Asset of(AssetDTO assetDTO) {

        final Collection<Video> videos;
        if (assetDTO.getVideos() != null) {
            videos = Lists.newArrayList();
            for (VideoDTO videoDTO : assetDTO.getVideos()) {
                videos.add(new Video(videoDTO.getLocation(), changed));
            }
        } else {
            videos = null;
        }
        final Map<String, Localized> localizeds;
        if (assetDTO.getLocalizeds() != null) {
            localizeds = Maps.newHashMap();
            for (LocalizedDTO localized : assetDTO.getLocalizeds()) {
                localizeds.put(localized.getLanguage(), new Localized(localized.getTitle(), localized.getDescription()));
            }
        }
        else {
            localizeds = null;
        }
        return new Asset(assetDTO.getId(), videos, localizeds, new Date());
    }
}
