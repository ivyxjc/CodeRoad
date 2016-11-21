package rxJava;

import com.sun.jndi.toolkit.url.Uri;

import java.util.Collections;
import java.util.List;

/**
 * Created by jc on 11/18/2016.
 */
//public class CatsHelper {
//    Api api;
//
//    public Uri saveTheCutestCat(String query){
//        List<Cat> cats = api.queryCats(query);
//        Cat cutest = findCutest(cats);
//
//        Uri savedUri = api.store(cutest);
//        return savedUri;
//    }
//
//    private Cat findCutest(List<Cat> cats) {
//        return Collections.max(cats);
//    }
//}


public class CatsHelper {

    public interface CuestCatCallback{
        void onCutestCatSaved(Uri uri);
        void onQueryFailed(Exception e);
    }

    Api api;

    public void saveTheCutestCat(String query,CuestCatCallback cuestCatCallback){
        List<Cat> cats = api.queryCats(query, new Api.CatsQueryCallback() {
            @Override
            public void onCatListReceived(List<Cat> cats) {
                Cat cuest=findCutest(cats);
                Uri uri=api.store(cuest);
                cuestCatCallback.onCutestCatSaved(uri);
            }

            @Override
            public void onError(Exception e) {
                //handle error
            }
        });


    }

    private Cat findCutest(List<Cat> cats) {
        return Collections.max(cats);
    }
}