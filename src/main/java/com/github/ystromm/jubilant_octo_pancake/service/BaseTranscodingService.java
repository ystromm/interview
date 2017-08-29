package com.github.ystromm.jubilant_octo_pancake.service;

import com.github.ystromm.jubilant_octo_pancake.domain.Asset;
import com.github.ystromm.jubilant_octo_pancake.domain.Video;

public abstract class BaseTranscodingService {

    protected abstract void before(Asset asset);

    public void transcode(Asset asset) {
        before(asset);
        for (Video video: asset.getVideos()) {
            transcode(video);
        }
    }

    protected abstract void transcode(Video video);

//transcodingJobService.start(transcodingJob);
//        try {
//        beforeStartTranscoding(transcodingJob);
//        VideoDetails videoDetails = getVideoDetails(transcodingJob);
//        videoDetails.getMaterialLength().ifPresent(transcodingJob::setDurationInSeconds);
//
//        ElementalJobParameters elementalJobParameters = getElementalJobParameters(transcodingJob);
//        ProfileElementalJob profileElementalJob =
//                elementalJobFactory.createJob(transcodingJob, videoDetails, elementalJobParameters);
//
//        Optional<String> elementalJobHref = sendToElemental(profileElementalJob);
//        elementalJobHref.ifPresent(transcodingJob::setElementalJobHref);
//
//        transcodingJobService.updateStatus(transcodingJob, TranscodingStatus.TRANSCODING);
//    } catch (UnexpectedPublisherStatusException e) {
//        transcodingJobService.finish(transcodingJob);
//    } catch (TranscoderRuntimeException e) {
//        transcodingJobService.fail(transcodingJob, new TranscodingJobErrorDetails(e));
//    } catch (Exception ex) {
//        transcodingJobService.fail(
//                transcodingJob,
//                new TranscodingJobErrorDetails("There was an error processing the file: "
//                        + transcodingJob.getFile(), ex));
//    }
}
