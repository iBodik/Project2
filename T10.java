package org.ProjectJavaOOPs;

import java.util.ArrayList;

public class T10 {
    public static void main(String[] args) {


        ArrayList<String> l=new ArrayList<String>();
        l.add("Pepsi");
        l.add("Pepsi");
        l.add("CocaCola");
        l.add("Dr. Peper");
        l.add("Lemonade");

        for (int i = 0; i < l.size(); i++) {
            for (int j = i+1; j <l.size() ; j++) {
                if(l.get(i).equals(l.get(j))){
                    l.remove(j);
                    j--;
                }
            }
        }
        l.forEach(c-> System.out.println(c));
    }
}
