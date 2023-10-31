package com.example.test.utils;


import com.example.test.dto.AppProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;




public final class UtilsFn {

    private static UtilsFn instance;

    /*
    @Autowired
    private AppProperty appProperties;
    */

    private UtilsFn() {
    }

    public static UtilsFn getInstance() {
        if(instance == null) {
            instance = new UtilsFn();
        }

        return instance;
    }
    public boolean validateEmail(String email, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validatePassword(String password, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
