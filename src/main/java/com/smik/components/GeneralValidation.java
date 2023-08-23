package com.smik.components;

public class GeneralValidation {
    public static Boolean isValidEmail(String email)
    {
        if(email.length()>4)
            return true;
        return false;
    }
}
