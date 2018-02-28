package com.arturnmk.java;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new SwitchScreen(), 0, 5000);
        //timer.schedule(new SayHello2(), 0, 7000);

        //System.out.println("I only show myself once");


    }
}
