package xyz.ivyxjc.annotation;

import java.util.List;

/**
 * Created by jc on 1/7/2017.
 */
public class PasswordUtils {


    @UseCase(id=47,description = "Passwords must contain at lease one numeric")
    public boolean validatePassword(String password){
        return password.matches("\\w*\\d\\w*");
    }

    @UseCase(id=48)
    public String encrypedPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id=49,description = "New passwords can not equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPsswords,String password){
        return !prevPsswords.contains(password);
    }

}
