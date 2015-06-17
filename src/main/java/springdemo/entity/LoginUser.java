package springdemo.entity;

import java.io.Serializable;

public class LoginUser implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int userId;
    
    private String userName;
    
    private String password;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
