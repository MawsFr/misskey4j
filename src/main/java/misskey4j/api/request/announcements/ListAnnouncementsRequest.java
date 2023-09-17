package misskey4j.api.request.announcements;

import misskey4j.api.model.TokenRequest;

public class ListAnnouncementsRequest extends TokenRequest {

    private Long limit;
    private String sinceId;
    private String untilId;

    private Boolean withUnreads;

    // region

    public Long getLimit() {
        return limit;
    }

    public String getSinceId() {
        return sinceId;
    }

    public String getUntilId() {
        return untilId;
    }

    public Boolean getWithUnreads() {
        return withUnreads;
    }

    public static ListAnnouncementsRequestBuilder builder() {
        return new ListAnnouncementsRequestBuilder();
    }

    public static final class ListAnnouncementsRequestBuilder {
        private Long limit;
        private String sinceId;
        private String untilId;
        private Boolean withUnreads;

        private ListAnnouncementsRequestBuilder() {
        }

        public ListAnnouncementsRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public ListAnnouncementsRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public ListAnnouncementsRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public ListAnnouncementsRequestBuilder withUnreads(Boolean withUnreads) {
            this.withUnreads = withUnreads;
            return this;
        }

        public ListAnnouncementsRequest build() {
            ListAnnouncementsRequest listAnnouncementsRequest = new ListAnnouncementsRequest();
            listAnnouncementsRequest.limit = this.limit;
            listAnnouncementsRequest.untilId = this.untilId;
            listAnnouncementsRequest.sinceId = this.sinceId;
            listAnnouncementsRequest.withUnreads = this.withUnreads;
            return listAnnouncementsRequest;
        }
    }
}
