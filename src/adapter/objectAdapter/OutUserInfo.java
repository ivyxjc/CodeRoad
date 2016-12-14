package adapter.objectAdapter;

import java.util.Map;

/**
 * Created by jc on 12/4/2016.
 */
public class OutUserInfo extends OuterUser implements IUserInfo {

    private Map baseInfo=super.getUserBaseInfo();


    @Override
    public String getUserName() {
        String userName=(String)this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress=(String)this.baseInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }


    @Override
    public String getJobPosition() {
        String jobPosition=(String)this.baseInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }


}
