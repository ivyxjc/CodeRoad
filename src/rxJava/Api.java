package rxJava;

import com.sun.jndi.toolkit.url.Uri;

import java.util.List;

/**
 * Created by jc on 11/18/2016.
 */

//
//public interface Api {
//    List<Cat> queryCats(String query);
//    Uri store(Cat cat);
//}


//异步方式
public interface Api {

    interface CatsQueryCallback{
        void onCatListReceived(List<Cat> cats);
        void onError(Exception e);
    }

    List<Cat> queryCats(String query,CatsQueryCallback catsQueryCallback);
    Uri store(Cat cat);
}