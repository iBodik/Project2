package org.ProjectJavaOOPs;

public class RegistrationTester {
    public static void main(String[] args) {

        Registration registration = new Registration();
        registration.setEmail("bodik@yahoo.com");
        registration.setUserName("iBodik");
        registration.setPassword("Password");
        registration.printInfo();


        System.out.println("**************************");

        registration.setEmail("Bodik@gmail.com");
        registration.setUserName("Bodik");
        registration.setPassword("Pass");
    }
}
