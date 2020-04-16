package UpgradedMyInfo;

import java.util.List;
import java.util.Map;

/**
 * User list to create a list for classes and verification of student or advisor
 */
public class UserList {
    private List<Map.Entry<User, String>> userList;

    public User checkCredentials(String netID,String password){
        System.out.println("Verified");
        return (User) userList;
    }
}

