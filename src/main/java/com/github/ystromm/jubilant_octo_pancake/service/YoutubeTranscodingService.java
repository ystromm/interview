package com.github.ystromm.jubilant_octo_pancake.service;

import com.github.ystromm.jubilant_octo_pancake.domain.Video;

public class YoutubeTranscodingService extends BaseTranscodingService {

    private final AviTranscoder aviTranscoder;

    public YoutubeTranscodingService(AviTranscoder aviTranscoder) {
        this.aviTranscoder = aviTranscoder;
    }

    @Override
    protected void transcode(Video video) {
        video.getChanged().setTime(System.currentTimeMillis());
        aviTranscoder.avi(video.getLocation());
    }
}
