package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

        if(oldPassword.equals(password)){
            if(isValid(newPassword)){
            //System.out.println("Password changed successfully");
            this.password = newPassword;
            }else{
                //System.out.println("not valid");
            }
        }else{
            //System.out.println("do not match");
        }
    }

    private boolean isValid(String password){
        boolean cl = false;
        boolean sl = false,digit = false,sc = false;

        if(password.length()<8){
            return false;
        }
        for(char c : password.toCharArray()){
            if(c>='A'&&c<='Z'){
                cl = true;
            }
            if(c>='a'&&c<='z'){
                sl = true;
            }
            if(c>='0'&&c<='9'){
                digit=true;
            }
            else{
                sc=true;
            }
        }
        if(sl&&cl&&sc&&digit){
            return true;
        }
        return false;

    }
}
