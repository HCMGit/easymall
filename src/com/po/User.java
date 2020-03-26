package com.po;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String password2;
    private String nickname;
    private String email;

    @Override
    public String toString() {
        return username + "--" + password;
    }
}
