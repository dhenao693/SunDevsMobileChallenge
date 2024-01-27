package utility;

import models.User;

public class UserUtil {
    public static String createUserName(User user){
        return String.format("%s %s",user.getName(),user.getLastName());
    }
}
