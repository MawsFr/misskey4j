package misskey4j.api.request.users;

import misskey4j.api.model.TokenRequest;

public class UserReportAbuseRequest extends TokenRequest {

    private String userId;
    private String comment;

    public String getUserId() {
        return userId;
    }

    public String getComment() {
        return comment;
    }

    public static UserReportAbuseRequestBuilder builder() {
        return new UserReportAbuseRequestBuilder();
    }

    public static final class UserReportAbuseRequestBuilder {
        private String userId;
        private String comment;

        private UserReportAbuseRequestBuilder() {
        }

        public UserReportAbuseRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserReportAbuseRequestBuilder comment(String comment) {
            this.comment = comment;
            return this;
        }

        public UserReportAbuseRequest build() {
            UserReportAbuseRequest userReportAbuseRequest = new UserReportAbuseRequest();
            userReportAbuseRequest.comment = this.comment;
            userReportAbuseRequest.userId = this.userId;
            return userReportAbuseRequest;
        }
    }
}
