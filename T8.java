package org.ProjectJavaOOPs;

import java.util.ArrayList;

public class T8 {

    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<String>();
        list.add("Anna");
        list.add("Isabel");
        list.add("Anton");
        list.add("Ismail");
        list.add("Avokado");


        list.replaceAll(String::toLowerCase);
        for (String w:list) {
            if(w.startsWith("a")){
                System.out.println(w);
            }

        }


    }
}
