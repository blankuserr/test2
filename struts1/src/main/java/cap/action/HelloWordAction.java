package cap.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWordAction extends ActionSupport {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String sayHi() {

        return SUCCESS;
    }
}
