package misskey4j.internal;

import misskey4j.Misskey;
import misskey4j.api.AccountsResource;
import misskey4j.api.AppResource;
import misskey4j.api.AuthResource;
import misskey4j.api.FollowingResource;
import misskey4j.api.ListsResource;
import misskey4j.api.MuteResource;
import misskey4j.api.NotesResource;
import misskey4j.api.UsersResource;
import misskey4j.internal.api.AccountsResourceImpl;
import misskey4j.internal.api.AppResourceImpl;
import misskey4j.internal.api.AuthResourceImpl;
import misskey4j.internal.api.FollowingResourceImpl;
import misskey4j.internal.api.ListsResourceImpl;
import misskey4j.internal.api.MuteResourceImpl;
import misskey4j.internal.api.NotesResourceImpl;
import misskey4j.internal.api.UsersResourceImpl;

public class MisskeyImpl implements Misskey {

    private AppResource app;
    private AuthResource auth;
    private AccountsResource accounts;
    private UsersResource users;
    private ListsResource lists;
    private NotesResource notes;
    private MuteResource mute;
    private FollowingResource following;

    public MisskeyImpl(String url, String i) {

        app = new AppResourceImpl(url);
        auth = new AuthResourceImpl(url);

        // Needs AccessToken
        accounts = new AccountsResourceImpl(url, i);
        users = new UsersResourceImpl(url, i);
        lists = new ListsResourceImpl(url, i);
        notes = new NotesResourceImpl(url, i);

        following = new FollowingResourceImpl(url, i);
        mute = new MuteResourceImpl(url, i);
    }

    @Override
    public AppResource app() {
        return app;
    }

    @Override
    public AuthResource auth() {
        return auth;
    }

    @Override
    public AccountsResource accounts() {
        return accounts;
    }

    @Override
    public UsersResource users() {
        return users;
    }

    @Override
    public ListsResource lists() {
        return lists;
    }

    @Override
    public NotesResource notes() {
        return notes;
    }

    @Override
    public FollowingResource following() {
        return following;
    }

    @Override
    public MuteResource mute() {
        return mute;
    }
}
