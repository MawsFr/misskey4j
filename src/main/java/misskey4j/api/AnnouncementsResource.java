package misskey4j.api;

import misskey4j.api.request.announcements.IAnnouncementReadRequest;
import misskey4j.api.request.announcements.ListAnnouncementsRequest;
import misskey4j.api.response.announcements.ListAnnouncementsResponse;
import misskey4j.entity.share.Response;

/**
 * Announcements API.
 */
public interface AnnouncementsResource {

    /**
     * Lists announcements.
     *
     * @see "https://misskey.io/api-doc#operation/announcements"
     */
    Response<ListAnnouncementsResponse[]> list(ListAnnouncementsRequest request);

    /**
     * Reads an announcement.
     *
     * @see "https://misskey.io/api-doc#operation/i/read-announcement"
     */
    Response<Void> read(IAnnouncementReadRequest request);

}
