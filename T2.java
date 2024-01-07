package org.ProjectJavaOOPs;
/*
Find out how many alpha characters are present in a string?
 */
public class T2 {
    public static void main(String[] args) {

        String str = "Hello World 2024";

        int alphaChar=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                alphaChar++;
            }

        }
        System.out.println(alphaChar);


    }

}
