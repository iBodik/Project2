package org.ProjectJavaOOPs;

public class T9 {
    public static void main(String[] args) {

        String s = "abracadabra";
        for(Character ch: s.toCharArray()){
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                System.out.println("First non-repeating character is "+ch);
                break;
            }
        }
    }
}
