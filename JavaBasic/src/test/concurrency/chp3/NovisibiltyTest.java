package concurrency.chp3;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by ivxyjc on 2017/1/16.
 */
public class NovisibiltyTest {

    @Test
    public void test() throws  Exception{

        Field fieldNumber=Novisibility.class.getDeclaredField("number");
        Field fieldReady=Novisibility.class.getDeclaredField("ready");
        fieldNumber.setAccessible(true);
        fieldReady.setAccessible(true);
        fieldNumber.setInt(null,40);
        fieldReady.setBoolean(null,true);
        new Novisibility.ReaderThread().run();

    }
}
