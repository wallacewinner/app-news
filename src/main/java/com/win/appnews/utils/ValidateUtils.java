package com.win.appnews.utils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUtils {
    public boolean isValidName(String name) {
        return (name == null || name.isBlank()) ? false : isFullName(name);
    }

    private boolean isFullName(String name) {
        name = name.trim();
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(name);
        return matcher.find();
    }
    
}
