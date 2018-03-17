package com.arturnmk.java;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class PyWrite {


public static void write(String arg1){
arg1=arg1.replaceAll(" ", "_");
    try {
System.out.println("writing... arg: "+arg1);
        Process p = Runtime.getRuntime().exec(
                "python3 com/arturnmk/python/WriteToLCD.py "+arg1);
        BufferedReader in = new BufferedReader(new InputStreamReader(
                p.getInputStream()));
        System.out.println("callback from pyWrite: "+in.readLine());
    } catch (Exception e) {
System.out.println(e);
    }



}


}
