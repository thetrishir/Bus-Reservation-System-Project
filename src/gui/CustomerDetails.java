package gui;

import java.io.Serializable;

public class CustomerDetails implements Serializable {
    private String name, add, phone, email, username;
    char[] pass;

    public CustomerDetails(String name, String add, String phone, String email, String username, char[] pass) {
        super();
        this.name = name;
        this.add = add;
        this.phone = phone;
        this.email = email;
        this.username = username;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char[] getPass() {
        return pass;
    }

    public void setPass(char[] pass) {
        this.pass = pass;
    }


}
