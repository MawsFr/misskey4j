package misskey4j.api.request.announcements;

import misskey4j.api.model.TokenRequest;

public class IAnnouncementReadRequest extends TokenRequest {

    private String announcementId;

    // region

    public String getAnnouncementId() {
        return announcementId;
    }

    public static IAnnouncementReadRequestBuilder builder() {
        return new IAnnouncementReadRequestBuilder();
    }

    public static final class IAnnouncementReadRequestBuilder {
        private String announcementId;

        private IAnnouncementReadRequestBuilder() {
        }

        public IAnnouncementReadRequestBuilder announcementId(String announcementId) {
            this.announcementId = announcementId;
            return this;
        }

        public IAnnouncementReadRequest build() {
            IAnnouncementReadRequest iAnnouncementReadRequest = new IAnnouncementReadRequest();
            iAnnouncementReadRequest.announcementId = this.announcementId;
            return iAnnouncementReadRequest;
        }
    }


}
