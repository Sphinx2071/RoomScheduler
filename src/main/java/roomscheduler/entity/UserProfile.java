package roomscheduler.entity;

import java.lang.reflect.Type;

public class UserProfile {
    private String userName;
    private String password;
    private boolean userType;

    public UserProfile(String userName, String password, boolean userType) {
        setUserName(userName);
        setPassword(password);
        setUserType(userType);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isUserType() {
        return userType;
    }

    public void setUserType(boolean userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userType=" + userType +
                '}';
    }
}

