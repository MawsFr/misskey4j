package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.AnnouncementsResource;
import misskey4j.api.request.announcements.IAnnouncementReadRequest;
import misskey4j.api.request.announcements.ListAnnouncementsRequest;
import misskey4j.api.response.announcements.ListAnnouncementsResponse;
import misskey4j.entity.share.Response;

public class AnnouncementsResourceImpl extends AbstractResourceImpl implements AnnouncementsResource {

    public AnnouncementsResourceImpl(String uri, String i) {
        super(uri, i);
    }

    @Override
    public Response<ListAnnouncementsResponse[]> list(final ListAnnouncementsRequest request) {
        return post(ListAnnouncementsResponse[].class,
                MisskeyAPI.Announcements.code(), request);
    }

    @Override
    public Response<Void> read(final IAnnouncementReadRequest request) {
        return post(MisskeyAPI.IReadAnnouncement.code(), request);
    }
}
