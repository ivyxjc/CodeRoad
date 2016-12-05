package adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jc on 12/4/2016.
 */
public class OuterUser implements IOuterUser {


    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfo=new HashMap<>();
        baseInfo.put("userName","name_1");
        baseInfo.put("homeAddress","homeAddress_1");
        baseInfo.put("jobPosition","jobPosition_1");
        return null;
    }
}