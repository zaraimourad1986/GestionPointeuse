package com.spring.gestionpointeuse.Utils;

public class JwtRespone {
    private String token;

    public JwtRespone(String token) {
        this.token = token;
    }

    public JwtRespone() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
