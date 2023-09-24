package misskey4j.api;

import misskey4j.api.request.username.UsernameAvailableRequest;
import misskey4j.api.request.users.UserReportAbuseRequest;
import misskey4j.api.request.users.UsersFollowersRequest;
import misskey4j.api.request.users.UsersFollowingsRequest;
import misskey4j.api.request.users.UsersReactionsRequest;
import misskey4j.api.request.users.UsersRecommendationRequest;
import misskey4j.api.request.users.UsersRelationRequest;
import misskey4j.api.request.users.UsersSearchByUsernameAndHostRequest;
import misskey4j.api.request.users.UsersSearchRequest;
import misskey4j.api.request.users.UsersShowMultipleRequest;
import misskey4j.api.request.users.UsersShowSingleRequest;
import misskey4j.api.response.notes.UsersReactionsResponse;
import misskey4j.api.response.username.UsernameAvailableResponse;
import misskey4j.api.response.users.UsersFollowersResponse;
import misskey4j.api.response.users.UsersFollowingsResponse;
import misskey4j.api.response.users.UsersRecommendationResponse;
import misskey4j.api.response.users.UsersRelationResponse;
import misskey4j.api.response.users.UsersSearchByUsernameAndHostResponse;
import misskey4j.api.response.users.UsersSearchResponse;
import misskey4j.api.response.users.UsersShowResponse;
import misskey4j.entity.share.Response;

public interface UsernameResource {

    /**
     * 指定したユーザーのフォロワー一覧を取得します。
     * https://misskey.io/api-doc#operation/users/followers
     */
    Response<UsernameAvailableResponse> available(
            UsernameAvailableRequest request);

}
