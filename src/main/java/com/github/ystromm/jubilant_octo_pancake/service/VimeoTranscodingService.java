package com.github.ystromm.jubilant_octo_pancake.service;

import com.github.ystromm.jubilant_octo_pancake.domain.Asset;
import com.github.ystromm.jubilant_octo_pancake.domain.Video;

import java.net.MalformedURLException;
import java.net.URL;

public class VimeoTranscodingService extends BaseTranscodingService {

    private final Mpeg4Transcoder mpeg4Transcoder;

    public VimeoTranscodingService(Mpeg4Transcoder mpeg4Transcoder) {
        this.mpeg4Transcoder = mpeg4Transcoder;
    }

    @Override
    protected void before(Asset asset) {
        // Vimeo only accepts videos on FTP!!
        asset.getVideos().stream().map(video -> url(video))
                .filter(url -> !url.getProtocol().equals("ftp"))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Unknown protocol."));
    }

    private URL url(Video video) {
        try {
            return new URL(video.getLocation());
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    protected void transcode(Video video) {
        mpeg4Transcoder.mpeg4(video.getLocation());
    }
}
