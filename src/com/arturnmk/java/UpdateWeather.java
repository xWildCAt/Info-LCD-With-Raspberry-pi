package com.arturnmk.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.TimerTask;

public class UpdateWeather extends TimerTask {
    @Override
    public void run() {
        try {
            Process p = Runtime.getRuntime().exec(
                    "python3 com/arturnmk/python/PyWeather.py");
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    p.getInputStream()));
String ldl = in.readLine();
System.out.println(ldl);
            InfoDispatcher.setWeather(ldl);
        } catch (Exception e) {
        }

    }
}
