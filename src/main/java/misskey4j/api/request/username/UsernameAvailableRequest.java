package misskey4j.api.request.username;

import misskey4j.api.model.TokenRequest;

public class UsernameAvailableRequest extends TokenRequest {

        private String username;

        // region
        public String getUsername() {
            return username;
        }

        public static UsernameAvailableRequestBuilder builder() {
            return new UsernameAvailableRequestBuilder();
        }

        public static final class UsernameAvailableRequestBuilder {
            private String username;

            private UsernameAvailableRequestBuilder() {
            }

            public UsernameAvailableRequestBuilder username(String username) {
                this.username = username;
                return this;
            }

            public UsernameAvailableRequest build() {
                UsernameAvailableRequest usernameAvailableRequest = new UsernameAvailableRequest();
                usernameAvailableRequest.username = this.username;
                return usernameAvailableRequest;
            }
        }
        // endregion
}
