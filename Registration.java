package org.ProjectJavaOOPs;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email){
        if(email.endsWith("@yahoo.com")){
            this.email=email;
        }else {
            System.out.println("Please use yahoo email address");
        }
    }

    public void setUserName(String userName){
        if (userName.length()>=6){
            this.userName=userName;
        }else if(userName.isEmpty()){
            System.out.println("User name is empty");
        }else{
            System.out.println("Please input user name more than 6 characters");
        }
    }

    public void setPassword(String password){
        if (password.length()>=6 && !password.contains(userName)){
            this.password=password;
        }else if (password.isEmpty()){
            System.out.println("Password is empty");
        }else{
            System.out.println("Password should be 6 or more characters and don`t be same with user name   ");
        }
    }
    public void printInfo(){
        System.out.println("Email is : "+email);
        System.out.println("User name is : "+userName);
        System.out.println("Password is : "+password);
    }
}
