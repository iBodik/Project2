package org.ProjectJavaOOPs;

public class T4 {

    public static void main(String[] args) {
        String str = "madam";
        String rev= "";

        for (int i = str.length()-1; i >=0 ; i--) {
            rev=rev+str.charAt(i);
        }
        if(str.equalsIgnoreCase(rev)){
            System.out.println(str+" is Palindrome");
        }else{
            System.out.println(str+" is not Palindrome");
        }



    }
}
