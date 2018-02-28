package com.arturnmk.java;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new SwitchScreen(), 0, 5000); // every 5s
        timer.schedule(new UpdateWeather(), 0, 60000); // every minute

        //System.out.println("I only show myself once");


    }
}
