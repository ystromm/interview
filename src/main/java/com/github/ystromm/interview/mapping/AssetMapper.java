package com.github.ystromm.interview.mapping;

import com.github.ystromm.interview.domain.Asset;
import com.github.ystromm.interview.domain.Localized;
import com.github.ystromm.interview.domain.Medium;
import com.github.ystromm.interview.json.AssetDTO;
import com.github.ystromm.interview.json.LocalizedDTO;
import com.github.ystromm.interview.json.MediumDTO;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class AssetMapper {

    public static Asset of(AssetDTO assetDTO) {

        final Collection<Medium> media;
        if (assetDTO.getMedia() != null) {
            media = Lists.newArrayList();
            for (MediumDTO medium : assetDTO.getMedia()) {
                media.add(new Medium(medium.getLocation()));
            }
        } else {
            media = null;
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
        return new Asset(assetDTO.getId(), media, localizeds, new Date());
    }
}
