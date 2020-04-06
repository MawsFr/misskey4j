package misskey4j.stream;

import misskey4j.Misskey;
import misskey4j.stream.callback.NoteCallback;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;

public class MisskeyStream {

    private Misskey misskey;
    private StreamClient client;

    public MisskeyStream(Misskey misskey) {
        this.misskey = misskey;

        try {
            String host = misskey.getHost();
            String i = misskey.getAuthToken();
            String url = "wss://" + host + "/streaming?i=" + i;
            this.client = new StreamClient(new URI(url));

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    /**
     * Connect (nonblocking)
     */
    public void connect() {
        client.connect();
    }

    /**
     * Connect (blocking)
     */
    public void connectBlocking() {
        try {
            client.connectBlocking();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Close
     */
    public void close() {
        client.close();
    }

    /**
     * HomeTimeLine Events
     */
    public void homeTimeLine(NoteCallback callback) {
        client.subscribe("homeTimeline", null, Collections.singletonList(callback));
    }

    /**
     * LocalTimeline Events
     */
    public void localTimeline(NoteCallback callback) {
        client.subscribe("localTimeline", null, Collections.singletonList(callback));
    }

    /**
     * HybridTimeline Events
     */
    public void hybridTimeline(NoteCallback callback) {
        client.subscribe("hybridTimeline", null, Collections.singletonList(callback));
    }

    /**
     * GlobalTimeline Events
     */
    public void globalTimeline(NoteCallback callback) {
        client.subscribe("globalTimeline", null, Collections.singletonList(callback));
    }
}
