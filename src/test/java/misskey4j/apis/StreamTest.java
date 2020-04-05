package misskey4j.apis;

import misskey4j.AbstractTest;
import misskey4j.Misskey;
import misskey4j.MisskeyFactory;
import misskey4j.stream.MisskeyStream;
import org.junit.Test;

public class StreamTest extends AbstractTest {

    @Test
    public void testHomeTimeLineStream() throws InterruptedException {
        Misskey misskey = MisskeyFactory.getInstance(HOST, CLIENT_SECRET, USER_TOKEN);
        MisskeyStream stream = misskey.stream();

        stream.connectBlocking();
        stream.homeTimeLine((Note) -> {

        });

        Thread.sleep(100 * 1000L);
    }
}
