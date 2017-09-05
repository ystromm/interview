package com.github.ystromm.jubilant_octo_pancake.service;

import com.github.ystromm.jubilant_octo_pancake.domain.Asset;
import com.github.ystromm.jubilant_octo_pancake.domain.Video;

public abstract class BaseTranscodingService {

    void before(Asset asset) {
    }

    public void transcode(Asset asset) {
        try {
            before(asset);
            for (Video video : asset.getVideos()) {
                transcode(video);
            }
        }
        catch (IllegalArgumentException e) {
            System.err.printf("Illegal input.");
        }
        catch (RuntimeException e) {
            System.err.printf("Unexpected error.");
        }
    }

    protected abstract void transcode(Video video);
}
