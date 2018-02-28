package com.arturnmk.java;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class PyWrite {


public static void write(String arg1){

    try {
        Process p = Runtime.getRuntime().exec(
                "../python/python3 pytest.py "+arg1);
        BufferedReader in = new BufferedReader(new InputStreamReader(
                p.getInputStream()));
        System.out.println(in.readLine());
    } catch (Exception e) {
    }



}


}
